package asg.visual;
import asg.tools.ValidaFormato;
public class Registrar extends javax.swing.JDialog {
    
    private boolean Nombre = false,
            ApellidoP = false,
            ApellidoM = false,
            Nombre_Usuario = false,
            Password = false,
            Email = false,
            Direccion = false,
            Telefono = false,
            No_empleado = false;

    public Registrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Apll_P = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Apll_M = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passw = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        direc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        No_empl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        registra = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Usuario");
        setResizable(false);
        setSize(new java.awt.Dimension(867, 450));

        jPanel1.setPreferredSize(new java.awt.Dimension(868, 420));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 120, 90, 30);

        nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(250, 120, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido Paterno");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 180, 192, 30);

        Apll_P.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Apll_P.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apll_PKeyTyped(evt);
            }
        });
        jPanel1.add(Apll_P);
        Apll_P.setBounds(250, 180, 150, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Materno");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 240, 200, 30);

        Apll_M.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Apll_M.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apll_MKeyTyped(evt);
            }
        });
        jPanel1.add(Apll_M);
        Apll_M.setBounds(250, 240, 150, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre de");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 290, 130, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Usuario");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 320, 89, 30);

        user_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_nameKeyReleased(evt);
            }
        });
        jPanel1.add(user_name);
        user_name.setBounds(250, 300, 150, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 370, 140, 30);

        passw.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwKeyReleased(evt);
            }
        });
        jPanel1.add(passw);
        passw.setBounds(250, 370, 150, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 120, 80, 30);

        email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(630, 120, 220, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dirección");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 180, 140, 30);

        direc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direcKeyTyped(evt);
            }
        });
        jPanel1.add(direc);
        direc.setBounds(630, 180, 220, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("No. empleado");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(440, 240, 160, 30);

        No_empl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        No_empl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                No_emplKeyReleased(evt);
            }
        });
        jPanel1.add(No_empl);
        No_empl.setBounds(630, 240, 80, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Teléfono");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(440, 300, 140, 30);

        tel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(630, 300, 140, 30);

        registra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registra.setText("Registrar");
        registra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraMouseClicked(evt);
            }
        });
        jPanel1.add(registra);
        registra.setBounds(570, 370, 110, 31);

        cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cancel.setText("Cancelar");
        jPanel1.add(cancel);
        cancel.setBounds(720, 370, 110, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if(!nombre.getText().equals("")){
            Nombre = ValidaFormato.VNombre(nombre.getText());
            if(!ValidaFormato.VNombre(nombre.getText()))
                    System.out.println("Nombre Invalido");
            else
                System.out.println("Nombre Valido");
        }
        CompCampos();
    }//GEN-LAST:event_nombreKeyTyped

    private void Apll_PKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apll_PKeyTyped
        if(!Apll_P.getText().equals("")){
            ApellidoP = ValidaFormato.VApellido(Apll_P.getText());
            if(!ValidaFormato.VApellido(Apll_P.getText()))
                    System.out.println("Apellido Invalido");
            else
                System.out.println("Apellido Valido");
        }
        CompCampos();
    }//GEN-LAST:event_Apll_PKeyTyped

    private void Apll_MKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apll_MKeyTyped
        if(!Apll_M.getText().equals("")){
            ApellidoM = ValidaFormato.VApellido(Apll_M.getText());
            if(!ValidaFormato.VApellido(Apll_M.getText()))
                    System.out.println("Apellido Invalido");
            else
                System.out.println("Apellido Valido");
        }
        CompCampos();
    }//GEN-LAST:event_Apll_MKeyTyped
    private void user_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_nameKeyReleased
        if(!user_name.getText().equals("")){
            Nombre_Usuario = ValidaFormato.VNombre_Usuario(user_name.getText());
            if(!ValidaFormato.VNombre_Usuario(user_name.getText()))
                    System.out.println("Usuario Invalido");
            else
                System.out.println("Usuario Valido");
        }
        CompCampos();
    }//GEN-LAST:event_user_nameKeyReleased

    private void passwKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwKeyReleased
        if(!passw.getText().equals("")){
            Password = ValidaFormato.VPassword(passw.getText());
            if(!ValidaFormato.VPassword(passw.getText()))
                    System.out.println("Conttraseña Invalido");
            else
                System.out.println("Conttraseña Valido");
        }
        CompCampos();
    }//GEN-LAST:event_passwKeyReleased

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        if(!email.getText().equals("")){
            Email = ValidaFormato.VEmail(email.getText());
            if(!ValidaFormato.VEmail(email.getText()))
                    System.out.println("Email Invalido");
            else
                System.out.println("Email Valido");
        }
        CompCampos();
    }//GEN-LAST:event_emailKeyTyped

    private void direcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcKeyTyped
        if(!direc.getText().equals("")){
            Direccion = ValidaFormato.VDireccion(direc.getText());
            if(!ValidaFormato.VDireccion(direc.getText()))
                    System.out.println("Direccion Invalido");
            else
                System.out.println("Direccion Valido");
        }
        CompCampos();
    }//GEN-LAST:event_direcKeyTyped    

    private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
        if(!tel.getText().equals("")){
            Telefono = ValidaFormato.VTelefono(tel.getText());
            if(!ValidaFormato.VTelefono(tel.getText()))
                    System.out.println("Telefono Invalido");
            else
                System.out.println("Telefono Valido");
        }
        CompCampos();
    }//GEN-LAST:event_telKeyReleased
    
    private void No_emplKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_No_emplKeyReleased
        if(!No_empl.getText().equals("")){
            No_empleado = ValidaFormato.VNo_empleado(No_empl.getText());
            if(!ValidaFormato.VNo_empleado(No_empl.getText()))
                    System.out.println("Noempleado Invalido");
            else
                System.out.println("Noempleado Valido");
        }
        CompCampos();
    }//GEN-LAST:event_No_emplKeyReleased

    private void CompCampos(){
        if((Nombre && ApellidoP && ApellidoM && Nombre_Usuario && Password && Email && Direccion && Telefono && No_empleado)){
            registra.setEnabled(true);
            System.err.println("El boton debería estar activado ahora"); 
        }else{
            registra.setEnabled(false);
            System.err.println("Aún hay algún error");
        }
    }    
    
    private void registraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraMouseClicked

    }//GEN-LAST:event_registraMouseClicked

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrar dialog = new Registrar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apll_M;
    private javax.swing.JTextField Apll_P;
    private javax.swing.JTextField No_empl;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField direc;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField passw;
    private javax.swing.JButton registra;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
