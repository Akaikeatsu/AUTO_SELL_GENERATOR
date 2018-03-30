package asg.tools;

import java.util.regex.*;

public class ValidaFormato{
    private String Nombre, ApellidoP, ApellidoM, Nombre_Usuario, Password, Email, Direccion, Telefono;
    int No_empleado;

    public boolean ValidaFormatoUsuario(String Nombre, String ApellidoP, String ApellidoM, String Nombre_Usuario, String Password, String Email, String Direccion, String Telefono, String No_empleado){
        boolean ValNom = false, ValApe1 = false, ValApe2 = false, ValNomU = false, ValPass = false, ValEmail = false, ValDir = false, ValTel = false, ValNumE = false;
        ValNom = Nombre.matches("[[A-Z]{1}[[a-z]+([\\s])?]+]{3,15}");
        ValApe1 = ApellidoP.matches("");
        ValApe2 = ApellidoM.matches("");
        ValNomU = Nombre_Usuario.matches("");
        ValPass = Password.matches("");
        ValEmail = Email.matches("");
        ValDir = Direccion.matches("");
        ValTel = Telefono.matches("");
        ValNumE = No_empleado.matches("[0-9]{8}");

        return (ValNom && ValApe1 && ValApe2 && ValNomU && ValPass && ValEmail && ValDir && ValTel && ValNumE)==true;        
    }
}