/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.PersistenceException.PersistenceException;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.samples.entities.TipoItem;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class MyBATISTipoItemDAO implements TipoItemDAO{
    
    @Inject
    private TipoItemMapper TipoItemMapper; 

    @Override
    public void save(TipoItem ti) throws PersistenceException {
         try{
            TipoItemMapper.insertarTipoItem(ti);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar el Tipo item "+ ti.toString(),e);
        }
    }

    @Override
    public TipoItem load(int id) throws PersistenceException {
        try{
            return TipoItemMapper.getTipoItem(id);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar tipo de item",e);
        }  
    }

    @Override
    public List<TipoItem> consultarTiposItem() throws PersistenceException {
        try{
            return TipoItemMapper.getTiposItems();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
             throw new PersistenceException("Error al consultar los Tipos de items ",e);
        }
    }
}
