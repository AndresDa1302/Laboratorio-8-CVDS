/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.view;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
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
