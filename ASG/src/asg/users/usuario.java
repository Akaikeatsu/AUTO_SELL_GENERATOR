package asg.users;

public class usuario {
    private String Nombre, ApellidoP, ApellidoM, Nombre_Usuario, Password, Email, Direccion, Telefono;
    int No_empleado;

    void usuario(String Nombre, String ApellidoP, String ApellidoM, String Nombre_Usuario, String Password, String Email, String Direccion, String Telefono, String No_empleado){
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

    public void RegistrarUsuario(){
        
    }
}
