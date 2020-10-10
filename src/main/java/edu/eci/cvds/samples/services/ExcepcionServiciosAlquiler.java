package edu.eci.cvds.samples.services;

import edu.eci.cvds.sampleprj.dao.persistenceException.PersistenceException;

public class ExcepcionServiciosAlquiler extends Exception {

        public ExcepcionServiciosAlquiler(String string) {
		super(string);
	}
        
	public ExcepcionServiciosAlquiler(String string, PersistenceException pex) {
		super(string, pex);
	}
}