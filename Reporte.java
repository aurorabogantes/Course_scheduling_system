
package proyectofinal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reporte extends javax.swing.JFrame {

    String codigo, cursos, carrera;
    double horas, creditos;
    double totalHoras=0;
    double totalCreditos=0;
    int i, tamaño;
    Scanner scanner=new Scanner(System.in);
    CReporte[] planilla;
    
    public Reporte() {
        initComponents();
        
        do {
            System.out.println("Digite la cantidad de profesores a registrar");
            tamaño=scanner.nextInt();
        } while(tamaño<=0);
        
        planilla=new CReporte[tamaño];
        
        for(i=0; i<planilla.length; i++) {
            scanner.nextLine();
            System.out.println("Digite el código del profesor: ");
            codigo=scanner.nextLine();
            System.out.println("Digite los cursos del profesor: ");
            cursos=scanner.nextLine();
            System.out.println("Digite las horas del profesor: ");
            horas=scanner.nextDouble();
            System.out.println("Digite los créditos del profesor: ");
            creditos=scanner.nextDouble();
            System.out.println("Digite la carrera del profesor: ");
            carrera=scanner.nextLine();
            
            planilla[i]=new CReporte(codigo, cursos, carrera, horas, creditos);
        }
        imprimirPlanilla(planilla);
        
        try {
            File archivo=new File("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\reporte.txt");
            if(archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            }
        } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
        
        try {
                FileReader fr=new FileReader("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\reporte.txt");
                FileWriter fw=new FileWriter("C:\\Users\\Usuario\\OneDrive\\Documentos\\Ing. del Software\\II Cuatrimestre\\Programación I\\Proyecto Final\\Archivos txt\\reporte.txt", true);
                
                guardarReporte(planilla, fw);
                fw.flush();
                fw.close();
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        btnAtrasAdmin = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Reporte"));

        jLabel1.setText("Código:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Reportes"));

        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaReporte);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnAtrasAdmin.setText("Atrás Admin");
        btnAtrasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAdminActionPerformed(evt);
            }
        });

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasAdmin)
                    .addComponent(btnAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtrasAdmin))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String cod_prof=txt_codigo.getText();
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Código de profesor");
        modelo.addColumn("Cursos");
        modelo.addColumn("Horas");
        modelo.addColumn("Créditos");
        modelo.addColumn("Carrera");
        
        totalHoras=0;
        totalCreditos=0;
        
        for(int i=0; i<planilla.length; i++) {
            if(planilla[i].codigo.equals(cod_prof)) {
                Object[] fila={planilla[i].codigo, planilla[i].cursos, planilla[i].horas, planilla[i].creditos, planilla[i].carrera};
                modelo.addRow(fila);
                
                totalHoras+=planilla[i].horas;
                totalCreditos+=planilla[i].creditos;
            }
        }
        if(modelo.getRowCount()==0) {
            JOptionPane.showMessageDialog(null, "Código de profesor inválido. Error: "+JOptionPane.ERROR_MESSAGE);
        } else {
            Object[] filaTotales={"", "Total", totalHoras, totalCreditos, ""};
            modelo.addRow(filaTotales);
            
            tablaReporte.setModel(modelo);
        }
    }                                         

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {                                         
        MenuAsistente menu=new MenuAsistente();
        menu.setVisible(true);
        this.dispose();
    }                                        

    private void btnAtrasAdminActionPerformed(java.awt.event.ActionEvent evt) {                                              
        MenuAdministrador menu=new MenuAdministrador();
        menu.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtrasAdmin;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration                   
public static void imprimirPlanilla(CReporte arr[]) {
    for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i].getCodigo()+" - "+arr[i].getCursos()+" - "+arr[i].getHoras()+" - "+arr[i].getCreditos()+" - "+arr[i].getCarrera());
    }
}

public static void guardarReporte(CReporte arr[], FileWriter fw) throws IOException {
    JOptionPane.showMessageDialog(null, "Guardando la información...");
    for(int i=0;i<arr.length;i++) {
        fw.write(arr[i].getCodigo()+" - "+arr[i].getCursos()+" - "+arr[i].getHoras()+" - "+arr[i].getCreditos()+" - "+arr[i].getCarrera()+"\n");
    }
    fw.write("\n");
    fw.flush();
    JOptionPane.showMessageDialog(null, "Reporte guardado correctamente");
}

public static void leerReporte(FileReader fr) throws IOException {
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
