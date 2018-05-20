package asg.users;

import asg.tools.JDBSConectionTools;
import javax.swing.JOptionPane;

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

    public void RegistrarUsuario (){
        /*
            El método registra el Usuario en la base de datos
            Llama al método QueryTool de la clase JDBSConectionTools el cual recibe como parametro la instrucción SQL de inserción    
        */
        String insertquery = "INSERT INTO usuario(nombre, apellido_paterno, apellido_materno, nombre_usuario, password, email, dirección, tel, no_empleado) VALUES ('"+Nombre+"', '"+ApellidoP+"', '"+ApellidoM+"','"+Nombre_Usuario+"', '"+Password+"', '"+Email+"', '"+Direccion+"', '"+Telefono+"', "+No_empleado+")";
        JDBSConectionTools JCT = new JDBSConectionTools();
        JCT.QueryTool(insertquery);
        JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
    }
}
