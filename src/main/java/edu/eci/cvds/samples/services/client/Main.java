/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Cliente;

import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;

import java.text.ParseException;

//import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Main {
     public static void main(String args[]) throws ExcepcionServiciosAlquiler, ParseException{
         
         ServiciosAlquiler serviciosalquiler= ServiciosAlquilerFactory.getInstance().getServiciosAlquiler();
         /*Item i;
         String fechafinal="2020-12-25";
         Date d2 = Date.valueOf(fechafinal);
         TipoItem tip =new TipoItem(4, "tecnologia");
         i = new Item(tip,2160666,"Jorgito","Es un gigoló",d2,1000,"prueba","+18");
         ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().registrarItem(i);*/
         
         //(TipoItem tipo, int id, String nombre, String descripcion, Date fechaLanzamiento, long tarifaxDia, String formatoRenta, String genero)
         /*Cliente cl;
         cl = new Cliente("Andres Davila",(int) 01010000,"3197118807", "Calle 54 #24A-30 13-201","flash@gmail.com");
         ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().registrarCliente(cl);*/
         //System.out.println(serviciosalquiler.consultarItemsDisponibles()); 
         //System.out.println(serviciosalquiler.consultarItem(-1555)); 
         //System.out.println(serviciosalquiler.consultarCliente(2160666));
         //System.out.println(serviciosalquiler.consultarItemsCliente(1));
         
         Cliente cl;
         cl = new Cliente("Andres Davila",(int) 01010000,"3197118807", "Calle 54 #24A-30 13-201","flash@gmail.com");
         ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().registrarCliente(cl);
         //System.out.println(ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().consultarTipoItem(1));

     }
}
