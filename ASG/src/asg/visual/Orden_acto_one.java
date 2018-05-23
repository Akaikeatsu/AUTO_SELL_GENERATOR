package asg.visual;

import asg.users.Cliente;
import asg.users.Conductor;
import asg.users.Orden;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Orden_acto_one extends javax.swing.JFrame {
    
    private String Num_Empleado;

    public Orden_acto_one(String Num_Empleado) {    //Metodo Constructor recibe como parametro el número del empledo que genera la orden
        initComponents();                           //Se inicializan los componentes del frame
        this.setLocationRelativeTo(null);
        Date date = new Date();                     //Se inicializa una nueva variable de tipo Date
        DateFormat hourdateFormat = new SimpleDateFormat("ddMMyyHHmmss");   //Se genera un formato de 12 carateres con la variable date
        String Genfolio = hourdateFormat.format(date);  //La cadena de 12 caracteres se almancena en un String
        folio.setText(Genfolio);                        //La cadena de 12 caracteres se coloca en la etiqueta folio del menú
        this.setVisible(true);                          
        this.Num_Empleado = Num_Empleado;               //Se almacena el numero de empleado que genera la orden
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        folio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name_client = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        raz_soc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        destino = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        name_tranp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        linea = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ticket = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        gnerate = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTO SELL GENERATOR");
        setResizable(false);
        setSize(new java.awt.Dimension(525, 400));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setMaximumSize(new java.awt.Dimension(524, 758));
        jPanel1.setMinimumSize(new java.awt.Dimension(524, 758));
        jPanel1.setPreferredSize(new java.awt.Dimension(524, 758));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Folio:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 20, 70, 30);

        folio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        folio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(folio);
        folio.setBounds(100, 20, 300, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos del Cliente");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 60, 200, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 110, 100, 30);

        name_client.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(name_client);
        name_client.setBounds(240, 110, 250, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Razón Social:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 150, 160, 30);

        raz_soc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(raz_soc);
        raz_soc.setBounds(240, 150, 250, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 190, 110, 30);

        tel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(tel);
        tel.setBounds(320, 190, 170, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RFC:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 230, 60, 30);

        rfc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(rfc);
        rfc.setBounds(240, 230, 250, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dirección de");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 280, 150, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Destino:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 300, 150, 30);

        destino.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(destino);
        destino.setBounds(230, 290, 250, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Datos del Conductor");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(130, 350, 240, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nombre:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(60, 400, 100, 30);

        name_tranp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(name_tranp);
        name_tranp.setBounds(240, 400, 250, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Linea de");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 440, 100, 30);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Transportista:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(60, 460, 160, 30);

        linea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(linea);
        linea.setBounds(240, 450, 250, 30);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No. Entrada:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(60, 500, 150, 30);

        entrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(entrada);
        entrada.setBounds(240, 500, 250, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("No. Placa:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(60, 540, 120, 30);

        placa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(placa);
        placa.setBounds(240, 540, 250, 30);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("No. de Ticket");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(60, 580, 160, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("de Báscula:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(60, 600, 140, 30);

        ticket.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ticket);
        ticket.setBounds(240, 590, 250, 30);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tipo de Envio");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(20, 650, 170, 30);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Internacional" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(190, 650, 170, 30);

        gnerate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        gnerate.setText("Generar");
        gnerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gnerateMouseClicked(evt);
            }
        });
        jPanel1.add(gnerate);
        gnerate.setBounds(250, 700, 110, 40);

        cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(380, 700, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 760);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gnerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gnerateMouseClicked
        /**
         * Al hacer click en el boton de generar orden. Se valida que no existan campos vacios.
         * Se construye una orden, un cliente y conductor con los campos del formulario.
         * Se genera la segunda parte de la orden a la cual se le envían las entidades generadas
         * así como el número de empleado que fue recibido de la clase anterior
         */
        if(ComprobarCamposVacios()){//Llama al metodo que comprueba que no existan campos vacios
            try {
                Orden TempOrden = new Orden(folio.getText(),jComboBox1.getSelectedItem().toString(),"Pendiente");
                Cliente TempCliente = new Cliente(name_client.getText(), raz_soc.getText(), tel.getText(), rfc.getText(), destino.getText());
                Conductor TempConductor = new Conductor(name_tranp.getText(), linea.getText(), entrada.getText(), ticket.getText(), placa.getText());
                Order_acto_two NewOrtw = new Order_acto_two(this, rootPaneCheckingEnabled, TempCliente, TempConductor, TempOrden,Num_Empleado);
                this.dispose();
            } catch (Exception e) {

            }
        }else{
            JOptionPane.showMessageDialog(null, "Confirme que no existan campos vacíos");
        }        
    }//GEN-LAST:event_gnerateMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
        Init_S NIS = new Init_S();
    }//GEN-LAST:event_cancelMouseClicked

    private boolean ComprobarCamposVacios(){ //Evalua el contenido de todos los campos de texto y se asegura de que ninguno sea vacio
        return  !(name_client.getText().equals("")&&
                raz_soc.getText().equals("")&&
                tel.getText().equals("")&&
                rfc.getText().equals("")&&
                destino.getText().equals("")&&
                name_tranp.getText().equals("")&&
                linea.getText().equals("")&&
                entrada.getText().equals("")&&
                placa.getText().equals("")&&
                ticket.getText().equals(""));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel folio;
    private javax.swing.JButton gnerate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField linea;
    private javax.swing.JTextField name_client;
    private javax.swing.JTextField name_tranp;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField raz_soc;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField ticket;
    // End of variables declaration//GEN-END:variables
}
