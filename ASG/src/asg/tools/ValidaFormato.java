package asg.tools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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

    public static boolean ValidarUsuario(String Nombre_Usuario, String Password){
        /*
            El método Valida que determinados datos de Usuario se encuentre en la base de datos
            Recibe como parametros el nombre de usuario y la contraseña
            Genera la Query para buscar si los datos recibidos se encuentran/coinciden en la base de datos
            Utiliza el método que retorna un arreglo bidimensional

            ESTE METODO NO RETORNA EL VALOR EN SÍ DE LA BUSQUEDA. SOLO INDICA SI SE ENCONTRÓ
            UNA COINCIDENCIA.
        */
        String SearchQuery = "SELECT * FROM usuario WHERE nombre_usuario = '"+Nombre_Usuario+"' AND password='"+Password+"'";
        boolean Match = false;
        int x = 0;
        try{
            JDBSConectionTools JCT = new JDBSConectionTools();
            Connection LC = JCT.ConnectionTool();
            Statement MyStatement = LC.createStatement();
            ResultSet MyResultSet = MyStatement.executeQuery(SearchQuery);
            while(MyResultSet.next()){
                Match = true;
            }
            return Match;
        }catch(Exception e){
            System.err.println(e);
        }
        return Match;
    }    
}