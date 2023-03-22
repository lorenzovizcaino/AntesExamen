package Servicios;

import modelo.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;

public class EmpleadosServicios implements IEmpleadosServicios{
    @Override
    public void addEmpleado(Employees empleado) {
        SessionFactory sessionFactory= SessionFactoryUtil.getSessionFactory();
        Transaction tx=null;
        try(Session session= sessionFactory.openSession()){
            tx= session.beginTransaction();
            session.save(empleado);
            tx.commit();

        }catch (Exception ex) {
        System.out.println("Ha ocurrido una exception: " + ex.getMessage());

        if (tx != null) {
            tx.rollback();
        }

    }
    }
}
