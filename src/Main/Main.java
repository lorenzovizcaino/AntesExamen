package Main;


import Servicios.EmpleadosServicios;
import Servicios.IEmpleadosServicios;
import modelo.Employees;

public class Main {
    public static void main(String[] args) {
        IEmpleadosServicios empleadosServicios=new EmpleadosServicios();
        Employees emp1=new Employees();
        emp1.setFirstName("Luis");
        emp1.setLastName("Garcia");

        empleadosServicios.addEmpleado(emp1);

    }
}
