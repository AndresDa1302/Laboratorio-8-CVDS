package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.sampleprj.dao.PersistenceException.PersistenceException;
import java.util.List;

public interface ItemDAO {

   public void save(Item it) throws PersistenceException;

   public Item load(int id) throws PersistenceException;
   
   public List<Item> consultarItems() throws PersistenceException;
   
   public List<Item> consultarItemsDisponibles() throws PersistenceException;
}