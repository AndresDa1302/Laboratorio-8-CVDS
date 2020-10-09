/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;

/**
 *
 * @author Administrador
 */
public class Main {
     public static void main(String args[]) throws ExcepcionServiciosAlquiler{
         //Cliente cl;
         //cl = new Cliente("Andres Davila",(int) 01010000,"3197118807", "Calle 54 #24A-30 13-201","flash@gmail.com");
         //ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().registrarCliente(cl);
         //System.out.println(ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().consultarTipoItem(1));
         System.out.println(ServiciosAlquilerFactory.getInstance().getServiciosAlquiler().consultarItemsCliente(1));
         //Cliente(String nombre, long documento, String telefono, String direccion, String email)
     }
}
