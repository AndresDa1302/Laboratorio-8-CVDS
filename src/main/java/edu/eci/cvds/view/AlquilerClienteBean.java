/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.view;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import java.sql.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Administrador
 */
@ManagedBean(name = "Cliente")
@ApplicationScoped
public class AlquilerClienteBean extends BasePageBean{
    @Inject
    private ServiciosAlquiler serviciosAlquiler;
    private List<Cliente> clientes;
    private List<Item> disponibles;
    private Cliente desplegado;
    private long multa;
    private long costo;
    private List<ItemRentado> rentados;
    private int[] item = new int[2];
    
    
    public void start(){
        try{
            clientes = serviciosAlquiler.consultarClientes();
            
        }catch(ExcepcionServiciosAlquiler e){
        }
    }
    
    public void registrarCliente(String nombre, long documento, String telefono, String direccion, String email){
        try {
            serviciosAlquiler.registrarCliente(new Cliente(nombre,documento,telefono,direccion,email));
            clientes = serviciosAlquiler.consultarClientes();

        } catch (ExcepcionServiciosAlquiler ex) {
            new ExcepcionServiciosAlquiler("No se pudo registrar cliente");
        }       
    }
    public void setDesplegado(Cliente desplegado) {
        this.desplegado = desplegado;
        try{
        disponibles = serviciosAlquiler.consultarItemsDisponibles();
        }catch(ExcepcionServiciosAlquiler ex){
            
        }
        consultarItemsRentados();
        consultarPrecioMulta();
    }
    
    public Cliente getDesplegado() {
        return desplegado;
    }
    
    public List<Item> getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(List<Item> disponibles) {
        this.disponibles = disponibles;
    }



    public long getMulta() {
        return multa;
    }

    public void setMulta(long multa) {
        this.multa = multa;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public List<ItemRentado> getRentados() {
        return rentados;
    }

    public void setRentados(List<ItemRentado> rentados) {
        this.rentados = rentados;
    }

    public int[] getItem() {
        return item;
    }

    public void setItem(int[] item) {
        this.item = item;
    }
        private void consultarItemsRentados(){
        try {
            rentados = serviciosAlquiler.consultarItemsCliente(desplegado.getDocumento());
        } catch (ExcepcionServiciosAlquiler ex) {
            new ExcepcionServiciosAlquiler("Error al consultar items rentados");
        }
    }
    
    private void consultarPrecioMulta(){
        long t=0;
        try {
            if(rentados!=null){
                
                for(ItemRentado i: rentados){
                    t+=serviciosAlquiler.consultarMultaAlquiler(i.getItem().getId(),new Date(System.currentTimeMillis()));
                }
            }
        }catch (ExcepcionServiciosAlquiler ex) {
                new ExcepcionServiciosAlquiler("Error al consultar multa");
        }
        multa=t;
        
    }
    
    public void consultarCostoAlquiler(int itid, int numDias){
        try {
            costo=serviciosAlquiler.consultarCostoAlquiler(itid,numDias);
            item[0]=itid;
            item[1]=numDias;
        } catch (ExcepcionServiciosAlquiler ex) {
            new ExcepcionServiciosAlquiler("Error al consultar costo");
        }
    }
    public void registrarAlquilerCliente(){
        try {
            costo=0;
            Item rentado=serviciosAlquiler.consultarItem(item[0]);
            serviciosAlquiler.registrarAlquilerCliente(new Date(System.currentTimeMillis()), desplegado.getDocumento(), rentado, item[1]);
            
            item= new int[2];
            
        } catch (ExcepcionServiciosAlquiler ex) {
            new ExcepcionServiciosAlquiler("Error al rentar");
        }
    }  
    public ServiciosAlquiler getServiciosAlquiler() {
        return serviciosAlquiler;
    }

    public void setServiciosAlquiler(ServiciosAlquiler serviciosAlquiler) {
        this.serviciosAlquiler = serviciosAlquiler;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


}
