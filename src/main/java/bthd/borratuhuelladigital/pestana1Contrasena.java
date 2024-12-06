/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bthd.borratuhuelladigital;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author jaxt3
 */
public class pestana1Contrasena extends javax.swing.JFrame {

    /**
     * Creates new form post6
     */
    public pestana1Contrasena() {
        setUndecorated(true); // Elimina los bordes y barra de título predeterminados
        initComponents();
        setSize(475,163); // Tamaño del JFrame
        setLocationRelativeTo(null); // Centra el JFrame
        // Aplica la forma de bordes redondeados
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        try {
    BufferedImage bufferedImage = ImageIO.read(getClass().getResource("/images/BotonSijframe.png"));
    ImageIcon imageIcon = new ImageIcon(bufferedImage);
    Image scaledImage = imageIcon.getImage().getScaledInstance(
        siContrasena.getWidth(),
        siContrasena.getHeight(),
        Image.SCALE_SMOOTH
    );
    siContrasena.setIcon(new ImageIcon(scaledImage));
} catch (IOException | NullPointerException e) {
    System.err.println("Error al cargar la imagen: " + e.getMessage());
}
   try {
    BufferedImage bufferedImage = ImageIO.read(getClass().getResource("/images/BotonNojframe.png"));
    ImageIcon imageIcon = new ImageIcon(bufferedImage);
    Image scaledImage = imageIcon.getImage().getScaledInstance(
        noContrasena.getWidth(),
        noContrasena.getHeight(),
        Image.SCALE_SMOOTH
    );
    noContrasena.setIcon(new ImageIcon(scaledImage));
} catch (IOException | NullPointerException e) {
    System.err.println("Error al cargar la imagen: " + e.getMessage());
}
    }
    
    @Override
    public void paint(Graphics g) {
        // Renderiza un fondo con bordes redondeados
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE); // Fondo blanco
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50); // Bordes redondeados
        super.paint(g);
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        siContrasena = new javax.swing.JButton();
        noContrasena = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        siContrasena.setBackground(new java.awt.Color(241, 44, 41));
        siContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        siContrasena.setToolTipText("");
        siContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siContrasenaActionPerformed(evt);
            }
        });

        noContrasena.setBackground(new java.awt.Color(241, 44, 41));
        noContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        noContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noContrasenaActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jTextArea1.setRows(2);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("¿Crees que es una contraseña\nsegura?");
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(siContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

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

    private void noContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noContrasenaActionPerformed
        cambiarVentana(new pestana2Contrasena());
    }//GEN-LAST:event_noContrasenaActionPerformed

    private void siContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siContrasenaActionPerformed
        cambiarVentana(new pestana1NombreReal());

    }//GEN-LAST:event_siContrasenaActionPerformed
   
    private void cambiarVentana(javax.swing.JFrame nuevaVentana) {
        nuevaVentana.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(post6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(post6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(post6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(post6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pestana1Correo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton noContrasena;
    private javax.swing.JButton siContrasena;
    // End of variables declaration//GEN-END:variables
}
