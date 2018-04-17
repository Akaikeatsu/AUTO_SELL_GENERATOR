package asg.users;

import asg.tools.JDBSConectionTools;

public class Usuario {
    private String Nombre, ApellidoP, ApellidoM, Nombre_Usuario, Password, Email, Direccion, Telefono;
    int No_empleado;
    
    public Usuario (String Nombre, String ApellidoP, String ApellidoM, String Nombre_Usuario, String Password, String Email, String Direccion, String Telefono, String No_empleado)
    {
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

    public Usuario(){

    }

    public void RegistrarUsuario (){
        String insertquery = "INSERT INTO Usuario(Nombre, Apellido_Paterno, Apellido_Materno, Nombre_Usuario, Password, Email, Dirección, No_empleado, Telefono) VALUES ("+Nombre+","+ApellidoP+","+ApellidoM+","+Nombre_Usuario+","+Password+","+Email+","+Direccion+","+Telefono+","+No_empleado+")";
        JDBSConectionTools JCT = new JDBSConectionTools();
        JCT.QueryTool(insertquery);
    }

    public boolean ValidarUsuario(String Nombre, String Password){
        String SearchQuery = "SELECT * FROM Usuarios WHERE Nombre ="+Nombre+"&& Password="+Password;
        return true;
    }
}
