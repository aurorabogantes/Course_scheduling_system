package proyectofinal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import static proyectofinal.LoginAdmin.guardarUsuario;
import static proyectofinal.LoginAdmin.leerUsuario;

public class LoginAsis extends javax.swing.JFrame {

    private MenuAsistente menu=null;
    public LoginAsis() {
        initComponents();
    }
    
    private int intentos=3;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(txt_contraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(txt_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnIngresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_contraseña)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String contraseña=new String(txt_contraseña.getPassword());
        
        if(contraseña.equals("asis")) {
            String usuario=txt_usuario.getText();
            
            try {
                File archivo=new File("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\logAsis.txt");
                if(archivo.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Archivo creado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo ya existe");
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
            
            try {
                FileReader fr=new FileReader("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\logAsis.txt");
                FileWriter fw=new FileWriter("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\logAsis.txt", true);
                
                guardarUsuario(usuario, fw);
                fw.flush();
                fw.close();
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
            JOptionPane.showMessageDialog(null, "Sesión iniciada como asistente");
            MenuAsistente asis=new MenuAsistente();
            asis.setVisible(true);
            this.dispose();
        } else {
            intentos--;
            if(intentos==0) {
                JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. La aplicación se cerrará");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Datos erróneos, por favor intente de nuevo. \n"+"Intentos restantes: "+intentos);
            }
        }
    }                                           

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginAsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAsis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAsis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration                   
public static void guardarUsuario(String usuario, FileWriter fw) throws IOException {
    JOptionPane.showMessageDialog(null, "Guardando la información...");
    for(int i=0;i<usuario.length();i++) {
        fw.write(usuario.charAt(i));
    }
    fw.write("\n");
    fw.flush();
    JOptionPane.showMessageDialog(null, "Usuario guardado correctamente");
}

public static void leerUsuario(FileReader fr) throws IOException {
    try {
        int caracter=fr.read();
        
        while(caracter != -1) {
            JOptionPane.showMessageDialog(null, ((char)caracter));
            caracter=fr.read();
            
            if((char)caracter=='\n') {
                JOptionPane.showMessageDialog(null, "\n");
            }
        }
    } catch(IOException e) {
        JOptionPane.showMessageDialog(null, "Error: "+e);
    } finally {
        fr.close();
    }
}
}
