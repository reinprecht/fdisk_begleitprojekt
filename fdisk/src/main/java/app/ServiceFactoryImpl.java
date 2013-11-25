package app;

import repositoryjpa.PersistenceFactory;
import service.MitgliedService;
import service.ServiceFactory;

public class ServiceFactoryImpl implements ServiceFactory {
	
	 private PersistenceFactory persistenceFactory;

	    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
	        this.persistenceFactory = persistenceFactory;
	    }

		@Override
		public MitgliedService mitgliedService() {
			return new MitgliedService();
		}

}
