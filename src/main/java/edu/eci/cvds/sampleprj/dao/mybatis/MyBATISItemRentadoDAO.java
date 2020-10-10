/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.ItemRentadoDAO;
import edu.eci.cvds.sampleprj.dao.persistenceException.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemRentadoMapper;
import edu.eci.cvds.samples.entities.ItemRentado;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class MyBATISItemRentadoDAO implements ItemRentadoDAO{
    
    @Inject
    private ItemRentadoMapper ItemRentadoMapper;

    @Override
    public List<ItemRentado> consultarItemsCliente(long idcliente) throws PersistenceException {
        try{
           return ItemRentadoMapper.consultarItemsCliente(idcliente);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar los items rentados ",e);
        }  
    }

    @Override
    public ItemRentado consultarItemRentado(int iditem) throws PersistenceException {
        try{
           return ItemRentadoMapper.consultarItemRentado(iditem);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar el item rentado",e);
        }  
    }
}
