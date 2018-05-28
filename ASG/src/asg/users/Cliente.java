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
public class Cliente {
    
    private String Nombre;
    private String Razon_Social;
    private String Telefono;
    private String RFC;
    private String Direccion_Destino;
    
    public Cliente (String Nombre,String Razon_Social,String Telefono,String RFC,String Direccion_Destino){
    this.Nombre = Nombre;
    this.Razon_Social = Razon_Social;
    this.Telefono = Telefono;
    this.RFC = RFC;
    this.Direccion_Destino = Direccion_Destino;
    }
    
    public Cliente (Cliente Temp){
        this.Nombre = Temp.getNombre();
        this.Razon_Social = Temp.Razon_Social;
        this.Telefono = Temp.getTelefono();
        this.RFC = Temp.getRFC();
        this.Direccion_Destino = Temp.getDireccion_Destino();
    }

    public void RegristarCliente(){
        try {
            JDBSConectionTools CT = new JDBSConectionTools();
            String query = "INSERT INTO public.cliente(nombre, razon_social, tel, rfc, destino)VALUES ('"+this.getNombre()+"', '"+this.getRazon_Social()+"', '"+this.getTelefono()+"', '"+this.getRFC()+"', '"+this.getDireccion_Destino()+"')";
            CT.QueryTool(query);
        } catch (Exception e) {
            System.err.println("ERROR AL REGRISTAR EL CLIENTE"+e);
        }
    }

    public String getRFC() {
        return RFC;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRazon_Social() {
        return Razon_Social;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion_Destino() {
        return Direccion_Destino;
    }
    
}
