package asg.tools;

import java.util.regex.*;

public class ValidaFormato{

    public static boolean VNombre (String Nombre){
        return Nombre.matches("[A-Z][[a-z]+[\\s]?]+"); //Compara si determinada cadena coincide con el formato para el campo Nombre.
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VApellido (String Apellido){ //Compara si determinada cadena coincide con el formato para el campo Apellido.
        return Apellido.matches("[A-Z][a-z]+");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VNombre_Usuario (String Nombre_Usuario){ //Compara si determinada cadena coincide con el formato para el campo Nombre de Usuario.
        return Nombre_Usuario.matches("[a-zA-Z0-9]{8,}");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VPassword (String Password){ //Compara si determinada cadena coincide con el formato para el campo Password.
        return Password.matches("[a-zA-Z0-9]{8,}");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VEmail(String Email){ //Compara si determinada cadena coincide con el formato para el campo Email.
        return Email.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VDireccion(String Direccion){ //Compara si determinada cadena coincide con el formato para el campo Direccion.
        return Direccion.matches("([\\w]+[\\s])+\\#[0-9]+([\\s][\\w]+(\\,)?)+");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VTelefono (String Telefono){//Compara si determinada cadena coincide con el formato para el campo Telefono.
        return Telefono.matches("[0-9]{10}");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
    public static boolean VNo_empleado (String No_empleado){ //Compara si determinada cadena coincide con el formato para el campo Número de Empleado.
        return No_empleado.matches("[0-9]{8}");
        //En caso de coincidir devuelve True, de lo contrario devuelve False
    }
}