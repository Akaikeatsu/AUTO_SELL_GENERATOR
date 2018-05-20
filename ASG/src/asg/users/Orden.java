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
public class Orden {
    
    private String Folio;
    private String Tipo_Envio;
    private String Estado_Pedido;
    private String descripcion;
        
    public Orden (String Folio,String Tipo_Envio, String Estado_Pedido){
        this.Folio = Folio;
        this.Tipo_Envio = Tipo_Envio;
        this.Estado_Pedido = Estado_Pedido;
    }
    
    public void ImprimirDatos(){
        System.err.println(this.Folio+" "+this.Tipo_Envio+" "+this.Estado_Pedido);
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public void setTipo_Envio(String Tipo_Envio) {
        this.Tipo_Envio = Tipo_Envio;
    }

    public void setEstado_Pedido(String Estado_Pedido) {
        this.Estado_Pedido = Estado_Pedido;
    }
    
    public boolean RegistrarOrden (String no_empleado,String conductor,String cliente,String descripcion){
        try {
            JDBSConectionTools CT = new JDBSConectionTools();
            String query = "INSERT INTO public.orden_de_pedido(folio, tipo_envio, estado_pedido, no_empleado, conductor, cliente, descripcion)VALUES ('"+this.Folio+"', '"+this.Tipo_Envio+"', '"+this.Estado_Pedido+"', '"+no_empleado+"', '"+conductor+"','"+cliente+"','"+descripcion+"');";
            CT.QueryTool(query);
        } catch (Exception e) {
            System.err.println("ERROR AL REGRISTAR LA ORDEN"+e);
        }
        return true;
    }

    public String getFolio() {
        return Folio;
    }
    
}
