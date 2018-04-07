package asg.tools;

import java.util.regex.*;

public class ValidaFormato{

    public static boolean VNombre (String Nombre){
        return Nombre.matches("[A-Z][[a-z]+[\\s]?]+");
    }
    public static boolean VApellido (String Apellido){
        return Apellido.matches("[A-Z][a-z]+");
    }
    public static boolean VNombre_Usuario (String Nombre_Usuario){
        return Nombre_Usuario.matches("[a-zA-Z0-9]{8,}");
    }
    public static boolean VPassword (String Password){
        return Password.matches("[a-zA-Z0-9]{8,}");
    }
    public static boolean VEmail(String Email){
        return Email.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static boolean VDireccion(String Direccion){
        return Direccion.matches("([\\w]+[\\s])+\\#[0-9]+([\\s][\\w]+(\\,)?)+");
    }
    public static boolean VTelefono (String Telefono){
        return Telefono.matches("[0-9]{10}");
    }
    public static boolean VNo_empleado (String No_empleado){
        return No_empleado.matches("[0-9]{8}");
    }
}