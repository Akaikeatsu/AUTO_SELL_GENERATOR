package asg_order_viewer;

import asg.tools.JDBSConectionTools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class orderlist extends javax.swing.JFrame {
    JDBSConectionTools con = new JDBSConectionTools();
    DefaultTableModel model; /*Declaramos un nuevo modelo para la tabla*/
    /*Este modelo se utilizará para llenar la tabla*/
    String folio = ""; /*Esta variable folio nos servira para confirmar las ordenes de pedido*/
    
    public orderlist() {
        initComponents();
        reset_model();
    }
    
    private void reset_model(){ /*EL metodo reset_model sirve para construir la tabla de ordenes de pedido*/
        model = new DefaultTableModel();
        getData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_orders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTO SELL GENERATOR - Vista de Ordenes");
        setResizable(false);

        jPanel1.setLayout(null);

        tbl_orders = new javax.swing.JTable(){
            public boolean isCellEditable(int RowIdex, int colIndex){  /*En este constructor se*/
                return false;                                          /*le indica a NetBeans  */
            }                                                          /*que las celdad de la tabla*/
        };                                                             /*no podran ser editadas o modificadas*/
        tbl_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_orders.setFocusable(false);
        tbl_orders.getTableHeader().setReorderingAllowed(false);
        tbl_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_orders);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 780, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 100);

        confirm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        confirm.setText("Confirmar Carga");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm);
        confirm.setBounds(570, 420, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Green.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 380, 780, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ordersMouseClicked
        int tupla=tbl_orders.getSelectedRow();  /*Primero obtenemos el inidice de la tupla que se ha seleccionado de la tabla*/
        if(tupla>=0){                           /*Si se ha seleccionado una tupla*/
            folio = tbl_orders.getValueAt(tupla, 0).toString(); /*Obtenemos el valor que se encuentra en la primera columna de la tupla seleccionada (el folio), y se le asigna a la variable local folio*/
        }
    }//GEN-LAST:event_tbl_ordersMouseClicked

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        Connection cn = con.ConnectionTool(); /*Se crea un nuevo objeto de Conexión*/
        try{
            PreparedStatement sqlc;           /*Declaramos un preparesStatement, que utilizaremos para actualizar el estado de la orden*/
            if(!folio.equals("")){            /*Si hay un folio de una orden almacenado, es decir, si previamente se ha seleccionado una tupla*/
                sqlc = cn.prepareStatement("UPDATE orden_de_pedido SET estado_pedido='Cargado' WHERE folio = '"+folio+"'"); /*Ejecuta el query para atualozar el estado del pedido*/
                int retorno = sqlc.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(orderlist.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset_model();  /*Recarga la informacion de la tabla*/
        folio="";       /*Vuele a vaciar el folio lmacenado para evitar que la orden se actualice otra vez*/
    }//GEN-LAST:event_confirmActionPerformed

    private void getData(){ /*En este metodo cargamos la informacion de la tabla*/
        Connection cn = con.ConnectionTool(); /*Se crea un nuevo objeto de Conexión*/
        String colum[] = {"Folio", "Cliente", "RFC", "Direccion", "Conductor", "Estado"}; /*Se determinan las columnas que podrá ver el usuario*/
        for(int c=0; c<colum.length;c++){ /*Iniciamos un ciclo en el que añadiremos cada columna al modelo de la tabla*/
            model.addColumn(colum[c]);    /*En cada vuelta se añade una columna*/
        }
        String data[] = new String[6];    /*Creamos un array que no servira para colocar los datos de una tupla para la tabla. El tamaño de array esa determinado por el número de columnas de la tabla*/
        Statement st, st2;                /*Declaramos 2 nuevos Statement que nos servirar para 3 consultas, el primero para la informacion del pedido y el segundo para informacion adicional del cliente y el conductor, que no se encuentra en la tabla de ordenes*/
        ResultSet rs1, rs2, rs3;          /*Creamos los resultadados que almacenaran lo obtenido de las consulltas*/
        try {
            st = cn.createStatement();
            st2 = cn.createStatement();
            rs1 = st.executeQuery("SELECT folio, cliente, conductor, estado_pedido FROM orden_de_pedido ORDER BY folio");/*Con esta consulta obtenemos la informacion general de la orden (El folio, el rfc del cliente, el no. de entrada el conductor y el estado de la orden)*/
            while(rs1.next()){  /*NOTA: el metodo getString recoge la informacion de cada columan del resultado de la consulta en el orden en que la recibe. en este caso folio=1, cliente=2, conductor=3 y estado de pedido=4*/
                data[0]=rs1.getString(1);   /*Aquí va el folio*/
                data[2]=rs1.getString(2);   /*Aquí va el rfc del cliente */
                data[4]=rs1.getString(3);   /*Aquí va el no. de entrada del conductor*/
                data[5]=rs1.getString(4);   /*Aquí va el estado del pedido*/
                rs2 = st2.executeQuery("SELECT nombre, destino FROM cliente WHERE rfc = '"+data[2]+"'");/*Con esta consulta obtenemos el nombre y la direccion de destino del cliente en base al rfc que obtuvimos de la consulta anterior*/
                if(rs2.next()){
                    data[1]=rs2.getString(1);   /*Aquí va el nombre del cliente*/
                    data[3]=rs2.getString(2);   /*Aquí va la dirección de destino*/
                }
                rs3 = st2.executeQuery("SELECT nombre FROM conductor WHERE no_entrada = "+data[4]);/*Con esta consulta obtenemos el nombre de conductor en base a el no_de entrada obtenido en la primera consulta realizada*/
                if(rs3.next()){
                    data[4]=rs3.getString(1);   /*Aqui va el nomre del conductor*/
                }
                model.addRow(data); /*Añadimos el vector construido como una nueva tupla en nustro modelo*/
            }
            tbl_orders.setModel(model); /*Añadimos El modelo a nuestra tabla*/
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(orderlist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_orders;
    // End of variables declaration//GEN-END:variables
}
