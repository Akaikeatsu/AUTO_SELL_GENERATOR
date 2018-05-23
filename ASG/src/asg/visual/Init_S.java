
package asg.visual;

import asg.tools.JDBSConectionTools;
import asg.tools.ValidaFormato;
import asg.users.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Init_S extends javax.swing.JFrame {

    public Init_S() {
        initComponents();
        this.setLocationRelativeTo(null);
        this. setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        passw = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        registra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG-IN");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setLayout(null);

        user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(user);
        user.setBounds(190, 150, 150, 30);

        passw.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(passw);
        passw.setBounds(190, 210, 150, 28);

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login.setText("Log-In");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel2.add(Login);
        Login.setBounds(130, 280, 90, 40);

        registra.setBackground(new java.awt.Color(255, 255, 255));
        registra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registra.setText("Registrar");
        registra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraMouseClicked(evt);
            }
        });
        jPanel2.add(registra);
        registra.setBounds(120, 350, 113, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 210, 170, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 150, 120, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/init.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, -10, 360, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/init.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 30, 360, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        char[] arrayC = passw.getPassword(); 
        String pass = new String(arrayC);
        System.out.println(pass);
        boolean UnN = user.getText().equals(""); //Comprueba si el campo User está vacio
        boolean PnN = pass.equals(""); // Comprueba si el campo password está vacio.
        String no_empleado = "";
        if((UnN && PnN) == false ){ //Si ambos están diferentes de vacio entra al if
            if(ValidaFormato.ValidarUsuario(user.getText(), pass)){//Se ejecuta el método Validar Usuario el cual devuelve un True si encuentra algún Match en la base de datos, devuelve un False en caso contrario.          
                JOptionPane.showMessageDialog(null, "Generando sesion de usuario");//En caso de encontrar un Match en la base de datos. Genera una sesión de Generar Orden_acto_one con los Datos del Usuario. WIP
                JDBSConectionTools CT = new JDBSConectionTools();                
                try {
                    /**En caso de encontrar la coincidencia se hace una busqueda para recuperar el numero de usuario
                     * del usuario que está iniciando sesión.
                     * 
                     * Se pasa como pararametro a la primera parte del formulario
                     * 
                     * Se cierra esta ventana
                     */
                    Connection cn = CT.ConnectionTool();
                    Statement st = cn.createStatement();
                    ResultSet rs1 = st.executeQuery("SELECT no_empleado FROM usuario WHERE nombre_usuario = '"+user.getText()+"' AND password = '"+pass+"'");
                    while(rs1.next())
                        no_empleado =rs1.getString(1);
                    System.err.println(no_empleado);
                    Orden_acto_one GenOrTemp = new Orden_acto_one(no_empleado);
                    this.dispose();
                } catch (SQLException ex) { 
                    Logger.getLogger(Init_S.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Los datos no coinciden con ningún usuario registrado");//En caso de no encontrar un Match en la base de datos. Solamente regresa al menú de login
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void registraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraMouseClicked
        Registrar ReNuUs = new Registrar(this, rootPaneCheckingEnabled);
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
            java.util.logging.Logger.getLogger(Init_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Init_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Init_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Init_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Init_S().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passw;
    private javax.swing.JButton registra;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
