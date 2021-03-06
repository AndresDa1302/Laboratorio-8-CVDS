/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.persistenceException.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;
import java.sql.Date;
import java.util.List;
import org.mybatis.guice.transactional.Transactional;

/**
 *
 * @author Administrador
 */
public class MyBATISClienteDAO implements ClienteDAO{

    @Inject
    private ClienteMapper ClienteMapper; 
    
    @Override
    @Transactional
    public void save(Cliente cl) throws PersistenceException {
        try{
            ClienteMapper.registrarCliente(cl);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al registrar "+ cl.toString(),e);
        }  
    }

    @Override
    public Cliente load(int doc) throws PersistenceException {
        try{
            return ClienteMapper.consultarCliente(doc);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar cliente",e);
        }  
    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenceException {
        try{
            return ClienteMapper.consultarClientes();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar los Clientes ",e);
        }
    }

    @Override
    public void agregarItemRentadoACliente(long id, int idit, Date fechainicio, Date fechafin) throws PersistenceException {
        try{
            ClienteMapper.agregarItemRentadoACliente(id, idit, fechainicio, fechafin);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error rentado item",e);
        }
    }
}
