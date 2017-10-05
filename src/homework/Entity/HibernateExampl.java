package homework.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.io.File;

public class HibernateExampl {

    public static void main(String[] args) {
      File file = new File("D:\\MyLessons\\src\\homework\\Entity\\hibernate.cfg.xml");
      SessionFactory sessionFactory = new Configuration()
              .configure(file)
              .buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.close();
        sessionFactory.close();
    }
}


