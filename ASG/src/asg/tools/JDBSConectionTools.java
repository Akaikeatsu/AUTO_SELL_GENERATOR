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

    /*private String[] getLabelList(ResultSetMetaData temp){
    *   int ColumnCount = temp.getColumnCount();
    *  String[] LabelList = new String[ColumnCount-1];
    *    try {            
    *        int x = 0;
    *        while((x+1)<ColumnCount){
    *            LabelList[x] = temp.getColumnName(x+1);
    *        }
    *        return LabelList;
    *    } catch (Exception e) {
    *    }
    *    return LabelList;
    }*/


    public String[][] SearchTableTool (String sqlquery)
    {//El método retorna un booleano, el cual nos indicará si se llevó a cabo la operación
        ResultSet MyResultSet;
        ResultSetMetaData myResultSetMetaData;
        String[][] Data;
        try {
            Connection LC = ConnectionTool();
            Statement MyStatement = LC.createStatement();
            MyResultSet = MyStatement.executeQuery(sqlquery);
            myResultSetMetaData = MyResultSet.getMetaData();
            int ColumNum = myResultSetMetaData.getColumnCount();
            int RowNum = getRowCount(MyResultSet);
            Data = new String[RowNum][ColumNum];
            for (int i = 1; i < RowNum; i++) {
                for (int j = 1; i < ColumNum; i++) {
                    Data[i][j] = MyResultSet.getString(j);
                }
            }
            return Data;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            Data = new String[1][1];
            Data[0][0] = "Error "+e;
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
    private Connection ConnectionTool (){
        String connectString = "jdbc:postgresql:"+RecoverDirection();
        String user = RecoverUser();
        String pass = RecoverPass();
        try {
            MyConnection = DriverManager.getConnection(connectString, user, pass);
        } catch (Exception e) {
        }
        return MyConnection;
    }
}