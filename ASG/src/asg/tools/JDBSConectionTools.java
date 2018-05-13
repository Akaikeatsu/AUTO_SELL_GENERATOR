package asg.tools;

import java.sql.*;
import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

public class JDBSConectionTools {

    private static Connection MyConnection;

    /*El metodo QueryTool de la clase JDBSConectionTools permitirá ingresar datos a la base de datos
    Recibe como parametros
    sqlquery >> Cadena de Texto que contiene la instrucción SQL.
    */
    public boolean QueryTool (String sqlquery)
    {//El método retorna un booleano, el cual nos indicará si se llevó a cabo la operación
        try {
            Connection LC = ConnectionTool();
            Statement MyStatement = LC.createStatement();
            int EU = MyStatement.executeUpdate(sqlquery);
            LC.close();
            return true;//En caso de no haber ningún error, retorna un true en caso de que no haya existido ningún error al ejecutar el insert
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;//En caso de haber existido algún error, retorna un false.
        }

    }

    private static int getRowCount(ResultSet temp){
        int RowCount = 0;
        try {
            while(temp.next())
                RowCount++;
        } catch (Exception e) {
        }
        return RowCount;

    }

    public String[] SearchSingleRow (String sqlquery) {
        ResultSet MyResultSet;                          //Se declara un ResultSet y un ResultSetMetaData que se ocuparan en el procesamiento de la Query
        ResultSetMetaData myResultSetMetaData; 
        String [] Data;
        try {            
            Connection LC = ConnectionTool();
            Statement MyStatement = LC.createStatement();
            MyResultSet = MyStatement.executeQuery(sqlquery); // Se ejecuta la Query y se almancena en el ResultSet
            myResultSetMetaData = MyResultSet.getMetaData(); // Se obtienen los metadatos del ResultSet
            int ColumNum = myResultSetMetaData.getColumnCount(); // De los metadatos se obtiene el número de columnas que conforma el ResultSet
            Data = new String[ColumNum];
            for (int i = 1; i < ColumNum; i++) {//Controla el número de Columnas de cada Fila.
                Data[i-1] = MyResultSet.getString(i); //Almacena el Resultado en una tabla en el orden de columna por columna que cada fila.
            }
            return Data;
        } catch (Exception e) {
            /* 
                Si se genera un error de cualquier tipo el arreglo de crea de dimensiones 1x1 de tal manera y se le asigna
                el valor "" para indicar que no se recuperó el resultado de la Query sin indicar el tipo del error.
            */
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e);
            Data = new String[1]; 
            Data[0] = "";
            return Data;
        }
    } 

    public String[][] SearchTableTool (String sqlquery)
    {//El método retorna un arreglo bidimencional de n x n, el cual contiene el numero de filas y columnas correspondientes a los resultados de la consulta.
        ResultSet MyResultSet;                          //Se declara un ResultSet y un ResultSetMetaData que se ocuparan en el procesamiento de la Query
        ResultSetMetaData myResultSetMetaData;          //A su vez se declara un arreglo Bidimensional de tipo String que almacenará los datos obtenidos de la Query
        String[][] Data;                                //
        try {
            Connection LC = ConnectionTool();
            Statement MyStatement = LC.createStatement();
            MyResultSet = MyStatement.executeQuery(sqlquery); // Se ejecuta la Query y se almancena en el ResultSet
            myResultSetMetaData = MyResultSet.getMetaData(); // Se obtienen los metadatos del ResultSet
            int ColumNum = myResultSetMetaData.getColumnCount(); // De los metadatos se obtiene el número de columnas que conforma el ResultSet
            int RowNum = getRowCount(MyResultSet); // Se llama al método getRowCount el cual obtiene el número de filas que contiene el ResultSet

            if((RowNum==0) || (ColumNum==0)){ 
                int z = 0/0;                    //En caso de que alguna de las dimesiones sea igual a cero, se fuerza un error aritmetico para interrumpir el método.
            }

            Data = new String[RowNum][ColumNum]; //En caso de que ambas dimensiones sean mayores a cero, el arreglo de genera de acuerdo al número de filas y al numero de columnas, respectivamente.
            while(MyResultSet.next()){//Mientras aún exista una fila en el ResultSet...
                for (int i = 1; i < RowNum; i++) {//Controla el número de Filas
                    for (int j = 1; i < ColumNum; i++) {//Controla el número de Columnas de cada Fila.
                        Data[i-1][j-1] = MyResultSet.getString(j); //Almacena el Resultado en una tabla en el orden de columna por columna que cada fila.
                    }
                }
            }
            return Data; //Se retorna el arreglo con los datos del ResultSet
        } catch (SQLException e) {
            /* 
                Si se genera un error de cualquier tipo el arreglo de crea de dimensiones 1x1 de tal manera y se le asigna
                el valor "" para indicar que no se recuperó el resultado de la Query sin indicar el tipo del error.
            */
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e);
            Data = new String[1][1]; 
            Data[0][0] = "";
            return Data;
        }        
    }

    private  String RecoverDirection(){
        //Recuperará la dirección de la base de datos de un archivo de configuración
        return "";
    }    
    private  String RecoverUser(){
        //Recuperará el usuario de la base de datos de un archivo de configuración
        return "";
    }
    private  String RecoverPass(){
        //Recuperará la contraseña de la base de datos de un archivo de configuración
        return "";
    }

    /*
    El método ConnectionTool se encarga de generar una conexion con la base de datos
    Retorna un Connection
    */
    public Connection ConnectionTool (){ // Ofrece una manera de acceder a la base de datos que sea necesario en el momento. 
                                         // Dado que se accede a la base de datos de la aplicación y a la de la empresa.
        /*String connectString = "jdbc:postgresql:"+RecoverDirection();
        String user = RecoverUser();
        String pass = RecoverPass();*/
        try {
            /*MyConnection = DriverManager.getConnection(connectString, user, pass);*/
            MyConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ASG_DB","postgres","no32sdc1");
        } catch (Exception e) {
        }
        return MyConnection;
    }
}