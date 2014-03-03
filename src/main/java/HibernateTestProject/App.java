package HibernateTestProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        SessionFactory sf = new AnnotationConfiguration().configure().
//                addPackage("untitled4").addAnnotatedClass(StudentEntity.class).buildSessionFactory();

        System.out.println( "Hello World!" );
        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory sf = configuration.buildSessionFactory();

//        or
        Session session = sf.openSession();
        System.out.println(session.get(StudentEntity.class, 1));

    }
}
