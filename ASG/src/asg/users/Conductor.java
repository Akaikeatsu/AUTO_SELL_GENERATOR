/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg.users;

import asg.tools.JDBSConectionTools;

/**
 *
 * @author pedro
 */
public class Conductor {
    private String Nombre;
    private String Linea_Transportista;
    private String No_Entrada;
    private String No_Ticket_Bascula;
    private String No_Numero_Placa;
    
    public Conductor (String Nombre, String Linea_Transportista,String No_Entrada,String No_Ticket_Bascula,String No_Numero_Placa){
    this.Nombre = Nombre;
    this.Linea_Transportista = Linea_Transportista;
    this.No_Entrada = No_Entrada;
    this.No_Ticket_Bascula = No_Ticket_Bascula;
    this.No_Numero_Placa = No_Numero_Placa;
    }
    
    public boolean RegristarConductor(){
        try {
            JDBSConectionTools CT = new JDBSConectionTools();
            String query = "INSERT INTO public.conductor(nombre, linea_transportista, no_entrada, no_ticketb, numero_placa) VALUES ('"+this.Nombre+"', '"+this.Linea_Transportista+"', '"+this.getNo_Entrada()+"', '"+this.No_Ticket_Bascula+"', '"+this.No_Numero_Placa+"');";
            CT.QueryTool(query);
        } catch (Exception e) {
            System.err.println("ERROR AL REGRISTAR EL CONDUCTOR"+e);
        }
        return true;
    }

    public String getNo_Entrada() {
        return No_Entrada;
    }
}
