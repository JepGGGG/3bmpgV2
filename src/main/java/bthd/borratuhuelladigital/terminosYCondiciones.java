/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bthd.borratuhuelladigital;

import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jaxt3
 */
public class terminosYCondiciones extends javax.swing.JFrame {

    /**
     * Creates new form terminosYCondiciones
     */
    
    public terminosYCondiciones() {
    setUndecorated(true);
    initComponents(); // Inicializa los componentes del JFrame
    
    // Centra el JFrame en la pantalla
    setLocationRelativeTo(null); 
    
    // Asegúrate de que el tamaño del JFrame esté calculado
    pack();
    
    // Aplica la forma redondeada
    setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
        try {
            // Carga y escala la imagen
            File file = new File("src/main/resources/images/ImagenAceptarFinal.png");
            BufferedImage bufferedImage = ImageIO.read(file);

            ImageIcon imageIcon = new ImageIcon(bufferedImage);

            Image scaledImage = imageIcon.getImage().getScaledInstance(
                AceptarBotton.getWidth(), 
                AceptarBotton.getHeight(), 
                Image.SCALE_SMOOTH
            );
            AceptarBotton.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AceptarBotton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("TÉRMINOS Y CONDICIONES DE USO DE LA RED SOCIAL \"LIFE INVADER\"\n\nAl registrarte en nuestra red social, aceptas los términos y condiciones aquí descritos. Nuestro objetivo es concientizar sobre la huella digital y garantizar un uso responsable de la plataforma.\n\n1. Publicaciones y Comentarios: Persistencia de Contenido\n1.1. Todas las publicaciones y comentarios realizados en la plataforma serán permanentes y no podrán ser eliminados de forma individual.\n1.2. La única manera de borrar contenido es a través de la eliminación total de la cuenta, lo cual eliminará todas las publicaciones, comentarios y datos asociados a ella.\n1.3. Antes de eliminar tu cuenta, tendrás un período de reflexión de 7 días hábiles. Durante este tiempo, podrás cancelar la solicitud si cambias de opinión.\n1.4. Los contenidos que sean reportados por violar nuestras políticas serán revisados por el equipo de moderación y podrán ser ocultados o eliminados si infringen las normas comunitarias.\n1.5. Los usuarios son responsables de todo el contenido que publiquen y deberán asegurarse de que este cumpla con las leyes aplicables y las normas de la comunidad.\n\n2. Uso de Información para Fines Comerciales\n2.1. Toda la información que compartas en nuestra plataforma (nombre, intereses, publicaciones, interacciones) puede ser utilizada para fines comerciales, incluyendo pero no limitado a:\n\nPublicidad personalizada.\nEstudios de mercado.\nDesarrollo de productos y servicios.\n2.2. Al aceptar estos términos, nos concedes una licencia no exclusiva, mundial y libre de regalías para usar, reproducir, distribuir y modificar tu contenido para fines relacionados con la plataforma.\n2.3. Nunca venderemos información personal identificable a terceros sin tu consentimiento explícito, pero colaboramos con socios publicitarios y tecnológicos para mejorar nuestros servicios.\n2.4. La información recopilada puede incluir tu actividad en la plataforma, datos del dispositivo, ubicación aproximada y preferencias de navegación.\n2.5. Tienes derecho a solicitar acceso a los datos recopilados sobre ti y pedir una copia en un formato legible, conforme a las leyes de protección de datos aplicables.\n3. Concientización sobre la Huella Digital\n3.1. Entiendes y aceptas que cualquier actividad realizada en nuestra plataforma deja una huella digital permanente.\n3.2. Los datos compartidos en línea pueden ser utilizados por terceros, incluso fuera de nuestro control, por lo que debes ser consciente de la información que decides publicar.\n3.3. Life Invader te proporcionará herramientas educativas para entender y gestionar tu huella digital, como informes mensuales de actividad y consejos de seguridad.\n3.4. Nos reservamos el derecho de mostrar métricas públicas de actividad para fomentar la transparencia y el aprendizaje comunitario.\n3.5. Las interacciones inapropiadas, acoso o spam serán marcadas como parte de la huella digital del usuario y podrán conllevar sanciones, como la suspensión o eliminación de la cuenta.\n\n4. Comportamiento y Responsabilidad del Usuario\n4.1. Los usuarios se comprometen a utilizar la plataforma de manera ética y respetuosa hacia otros miembros de la comunidad.\n4.2. Está prohibido:\n\nPublicar contenido ofensivo, discriminatorio o violento.\nUtilizar la plataforma para actividades ilegales o no autorizadas.\nCrear cuentas falsas o suplantar la identidad de otros usuarios.\n4.3. Life Invader no se responsabiliza por el contenido publicado por los usuarios, pero se reserva el derecho de eliminar cuentas que infrinjan las normas.\n4.4. Los usuarios son responsables de mantener la seguridad de sus cuentas, incluyendo el uso de contraseñas fuertes y la activación de autenticación en dos pasos.\n4.5. Las sanciones por violaciones a las normas incluyen advertencias, suspensiones temporales o eliminación definitiva de la cuenta.\n5. Modificaciones y Finalización del Servicio\n5.1. Life Invader se reserva el derecho de modificar estos términos y condiciones en cualquier momento. Los cambios serán notificados con 30 días de anticipación.\n5.2. Si no estás de acuerdo con los cambios, tendrás la opción de eliminar tu cuenta antes de que entren en vigor.\n5.3. Nos reservamos el derecho de finalizar el servicio o suspender cuentas que consideremos necesarias para mantener la seguridad y funcionalidad de la plataforma.\n5.4. Los usuarios que decidan cerrar sus cuentas tendrán acceso a una copia de su contenido antes de la eliminación, bajo solicitud previa.\n5.5. En caso de que la plataforma sea descontinuada, notificaremos a los usuarios con al menos 90 días de anticipación.\n\nCláusula Final\nAl aceptar estos términos, comprendes que Life Invader es una herramienta para fomentar la conciencia digital. Toda actividad realizada aquí es responsabilidad del usuario y está sujeta a las leyes y normativas locales e internacionales.\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        AceptarBotton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AceptarBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(AceptarBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AceptarBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBottonActionPerformed
        dispose();
    }//GEN-LAST:event_AceptarBottonActionPerformed

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
            java.util.logging.Logger.getLogger(terminosYCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(terminosYCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(terminosYCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(terminosYCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new terminosYCondiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBotton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
