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
        return Nombre_Usuario.matches("[a-zA-Z0-9]{8}");
    }
    public static boolean VPassword (String Password){
        return Password.matches("[a-zA-Z0-9]{8}");
    }
    /*public boolean VEmail(String Email){
        return Email.matches("");
    }*/
    public static boolean Telefono (String Telefono){
        return Telefono.matches("[0-9]{10}");
    }
    public static boolean No_empleado (String No_empleado){
        return No_empleado.matches("[0-9]{8}");
    }
}