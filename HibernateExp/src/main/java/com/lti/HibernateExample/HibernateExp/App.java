package com.lti.HibernateExample.HibernateExp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    Configuration c = new Configuration().configure();
    StandardServiceRegistryBuilder b= new StandardServiceRegistryBuilder().applySettings(c.getProperties());
    SessionFactory f=c.buildSessionFactory(b.build());
    Session s=f.openSession();
    Employee e=new Employee();
    int id = 121;
	Employee emp=(Employee)s.get(Employee.class, id); 
    		emp.setEmpName("shivam");
    emp.setBranch("student");
    s.update(e);
    s.beginTransaction();
    s.getTransaction().commit();
    }
}
