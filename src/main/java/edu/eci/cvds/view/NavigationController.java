/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Administrador
 */
@ManagedBean(name = "navigationController")
@RequestScoped
public class NavigationController {
    public String paginaAlquiler() {
        return "registroalquiler";
    }
    public String paginaCliente() {
        return "registrocliente";
    }
    public String paginaInicio(){
        return "index";
    }
}
