package asg.users;

import java.sql.ResultSet;

import javax.sql.rowset.JdbcRowSet;

import asg.tools.JDBSConectionTools;

public class Usuario {
    private String Nombre, ApellidoP, ApellidoM, Nombre_Usuario, Password, Email, Direccion, Telefono;
    int No_empleado;
    
    public Usuario (String Nombre, String ApellidoP, String ApellidoM, String Nombre_Usuario, String Password, String Email, String Direccion, String Telefono, String No_empleado)
    {
        /*
            Es un constructor el cual inicializa las variables de la Clase usuario
        */
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Password = Password;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.No_empleado =Integer.parseInt(No_empleado);
    }

    public Usuario (String Usuario, String Password){
        /**
         * Este constructor recibe como parametro el nombre del usuario y el password. 
         * El método se ejecuta despues de validar que exista alguna coincidencia con estos datos en la base de datos
         * Deberá ser llamado desde la clase Init_S
         * Genera un usuario con los datos recuperados de la base de datos.
         */

        JDBSConectionTools JCB = new JDBSConectionTools();
        String sqlquery = "SELECT * FROM usuario WHERE nombre_usuario = '"+Usuario+"' AND password = '"+Password+"'";
        String Datos [] = JCB.SearchSingleRow(sqlquery);
        this.Nombre = Datos [0];
        this.ApellidoP = Datos [1];
        this.ApellidoM = Datos [2];
        this.Nombre_Usuario = Datos [3];
        this.Password = Datos [4];
        this.Email = Datos [5];
        this.Direccion = Datos [6];
        this.Telefono = Datos [7];
        this.No_empleado = Integer.parseInt(Datos [8]);
    }

    public void RegistrarUsuario (){
        /*
            El método registra el Usuario en la base de datos
            Llama al método QueryTool de la clase JDBSConectionTools el cual recibe como parametro la instrucción SQL de inserción    
        */
        String insertquery = "INSERT INTO Usuario(nombre, apellido_paterno, apellido_materno, nombre_usuario, password, email, dirección, tel, no_empleado) VALUES ('"+Nombre+"', '"+ApellidoP+"', '"+ApellidoM+"','"+Nombre_Usuario+"', '"+Password+"', '"+Email+"', '"+Direccion+"', '"+Telefono+"', "+No_empleado+")";
        JDBSConectionTools JCT = new JDBSConectionTools();
        JCT.QueryTool(insertquery);
    }
}
