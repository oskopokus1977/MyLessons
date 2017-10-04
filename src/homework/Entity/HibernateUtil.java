package homework.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
   private  static File file = new File("D:\\MyLessons\\src\\homework\\Entity\\hibernate.cfg.xml");


    static {
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
        sessionFactory = cfg.buildSessionFactory(registryBuilder.build());
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
