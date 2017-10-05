//package homework.Entity;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.internal.SessionFactoryImpl;
//
//import java.io.File;
//
//public class HibernateUtil {
//    private static SessionFactory sessionFactory;
//    private static File file = new File("D:\\MyLessons\\src\\homework\\Entity\\hibernate.cfg.xml");
//
//
//    static {
//
//        Configuration cfg = new Configuration().configure(file);
//        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
//                .applySettings(cfg.getProperties());
//        sessionFactory = cfg.buildSessionFactory(registryBuilder.build());
//
//
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//}
