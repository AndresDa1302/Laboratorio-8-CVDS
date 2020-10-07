/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.sampleprj.dao.PersistenceException.PersistenceException;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface ItemRentadoDAO {
    
   public abstract List<ItemRentado> consultarItemsCliente(long idcliente) throws PersistenceException;
   
   public ItemRentado consultarItemRentado(int iditem) throws PersistenceException;   
}
