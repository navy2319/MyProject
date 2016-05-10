package farm.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * This file provides a SessionFactory for use with DAOS using Hibernate
 * @author naivischeffert
 * @version 1.0 4/21/16.
 */
public class SessionFactoryProvider {

    private static SessionFactory sessionFactory;

    /**
     * Use this method to create a session factory
     */
    public static void createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuration.getProperties()). buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
    //check for this error 

    /**
     * Use this method to get a session factory
     *
     * @return the session factory
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;

    }
}
