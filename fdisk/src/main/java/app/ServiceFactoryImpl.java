package app;

import repositoryjpa.PersistenceFactory;

public class ServiceFactoryImpl {
	
	 private PersistenceFactory persistenceFactory;

	    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
	        this.persistenceFactory = persistenceFactory;
	    }

}
