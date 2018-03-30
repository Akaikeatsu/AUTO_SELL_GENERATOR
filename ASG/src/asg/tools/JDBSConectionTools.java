package asg.tools;

import java.sql.*;

public class JDBSConectionTools {

    private String connectString="jdbc:postgresql:";

    /*El metodo Insert Tool de la clase JDBSConectionTools permitirá ingresar datos a la base de datos
    Recibe como parametros
    connectString >> Recibe la URL de la base de datos
    user >> El usuario principal de la base de datos (No confundir con usuario de la aplicación)
    password >> La contrasena de la base de datos    (No confundir con la contrasena de la apliación)
    */
    public boolean InsertTool (String connecString, String user, String password,String sqlquery){
        this.connectString = "jdbc:postgresql:"+connecString;
        try {
            Connection MyConnection = DriverManager.getConnection(this.connectString, user, password);
            Statement MyStatement = MyConnection.createStatement();
            int EU = MyStatement.executeUpdate(sqlquery);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public String GenerateInsertSQL(){
		return connectString;
    }
    
}