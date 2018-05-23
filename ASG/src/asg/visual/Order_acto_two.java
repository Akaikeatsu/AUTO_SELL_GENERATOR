package asg.visual;

import asg.tools.JDBSConectionTools;
import asg.users.Cliente;
import asg.users.Conductor;
import asg.users.Orden;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Order_acto_two extends javax.swing.JDialog {
    
    private final Cliente C1;
    private final Conductor C2;
    private final Orden C3;
    private final String Num_Empleado;
    
    public Order_acto_two(java.awt.Frame parent, boolean modal, Cliente T1, Conductor T2, Orden T3,String Num_Empleado) {
        /**
         * Método constructor que recibe como parametro
         * Un objeto de tipo cliente
         * Un objeto de tipo conductor
         * Un objeto de tipo Orden
         * Un String que contiene el numero de empleado que genera la orden
         * Se almacena en variables locales.
         */
        super(parent, modal);
        C1=T1;
        C2=T2;
        C3=T3;
        this.Num_Empleado = Num_Empleado;
        System.out.println(this.Num_Empleado);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        enviar = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AUTO SELL GENERATOR");
        setResizable(false);

        jPanel1.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 Unidades", "1 lb", "2 lb", "4 lb", "8 lb", "25 lb", "50 lb", "50 Kg" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(290, 20, 240, 28);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 70, 110, 30);

        jSpinner1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(290, 70, 70, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seleccione el producto");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 20, 270, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripción del producto");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 120, 300, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 500, 180);

        enviar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enviar.setText("Enviar");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        jPanel1.add(enviar);
        enviar.setBounds(310, 360, 90, 31);

        cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(410, 360, 110, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acto_two.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
        Init_S NIS = new Init_S();
    }//GEN-LAST:event_cancelMouseClicked

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        String Contar_Disponible = "SELECT COUNT (folio) FROM public.producto WHERE folio NOT IN (SELECT productofolio FROM public.orden_de_pedido_producto) AND descripcion = '"+jComboBox1.getSelectedItem().toString()+"';";
        String Buscar_Disponible = "SELECT folio FROM public.producto WHERE folio NOT IN (SELECT productofolio FROM public.orden_de_pedido_producto) AND descripcion = '"+jComboBox1.getSelectedItem().toString()+"';";
        int Cantidad=0;
        try {
            JDBSConectionTools CT = new JDBSConectionTools();
            Connection cn = CT.ConnectionTool();
            Statement st,st2;
            ResultSet rs1,rs2;
            st = cn.createStatement();
            st2 = cn.createStatement();
            rs1 = st.executeQuery(Contar_Disponible); // Se ejecuta la query que cuenta los folios en la tabla productos que no se encuentren en la tabla de orden_producto y además que su descripción coincida con la seleccionada.
            while (rs1.next())    
                Cantidad = rs1.getInt(1); //Se recupera el resultado de la consulta
            if(Cantidad >= Integer.parseInt(jSpinner1.getValue().toString())){ //Si la cantidad de producto solicidato es menos o igual a la cantidad existente, procede a registar la orden
                this.C1.RegristarCliente(); //Se llama a la entidad Cliente para que ejecute RegistrarCliente
                this.C2.RegristarConductor(); //Se llama a la entidad Conductor para que ejecute RegistrarConductor;
                this.C3.RegistrarOrden(Num_Empleado,C2.getNo_Entrada(),C1.getRFC(),jTextArea1.getText()); //Se llama a la entidad Orden para que ejecute RegistrarOrden
                rs2 = st2.executeQuery(Buscar_Disponible);
                for (int i = 0; i < Integer.parseInt(jSpinner1.getValue().toString()); i++) {
                    while (rs2.next()){
                        CT.QueryTool("INSERT INTO public.orden_de_pedido_producto(orden_de_pedidofolio, productofolio)VALUES ('"+C3.getFolio()+"', '"+rs2.getString(1)+"');"); /*Ejecuta el query para atualozar el estado del pedido*/
                    }
                }
                JOptionPane.showMessageDialog(this, "La orden se regristro correctamente");
                this.dispose();
                Init_S NIS = new Init_S();
            }else{//Si la cantidad de producto solicidato es mayor a la cantidad existente, se indica que no es posible terminar el registro.
                JOptionPane.showMessageDialog(this, "No hay suficiente existencia de ésta presentación para satisfacer la orden");
            }
        } catch (Exception e) {
            System.err.println("ALGO SAlIO MAL" +e);
            e.printStackTrace();
        }finally{
            JOptionPane.showMessageDialog(this, "Cerrando Sesión");
        }
        
    }//GEN-LAST:event_enviarMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton enviar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
