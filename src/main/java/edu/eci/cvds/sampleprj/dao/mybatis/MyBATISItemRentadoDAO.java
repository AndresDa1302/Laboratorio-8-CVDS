/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import edu.eci.cvds.sampleprj.dao.ItemRentadoDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException.PersistenceException;
import edu.eci.cvds.samples.entities.ItemRentado;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class MyBATISItemRentadoDAO implements ItemRentadoDAO{

    @Override
    public List<ItemRentado> consultarItemsCliente(long idcliente) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemRentado consultarItemRentado(int iditem) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
