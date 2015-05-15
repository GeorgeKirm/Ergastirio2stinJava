/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio2;

import javax.swing.JOptionPane;

/**
 *
 * @author georkirm
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
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
        Onoma = new javax.swing.JLabel();
        EponumoT = new javax.swing.JTextField();
        Eponumo = new javax.swing.JLabel();
        AEMT = new javax.swing.JTextField();
        AEM = new javax.swing.JLabel();
        OnomaT = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Arxeio = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        show = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Onoma.setText("Όνομα:");

        Eponumo.setText("Επώνυμο:");

        AEM.setText("ΑΕΜ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eponumo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Onoma, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(AEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EponumoT)
                            .addComponent(OnomaT, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(AEMT))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AEM)
                    .addComponent(AEMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Onoma)
                    .addComponent(OnomaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eponumo)
                    .addComponent(EponumoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Arxeio.setText("Αρχείο");

        Save.setText("Αποθήκευση");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Arxeio.add(Save);

        show.setText("Ανάγνωση");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        Arxeio.add(show);

        jMenuBar1.add(Arxeio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        NiceClass temp = new NiceClass();
        if ((OnomaT.getText() != null && !OnomaT.getText().isEmpty())) {
            if ((EponumoT.getText() != null && !EponumoT.getText().isEmpty())) {
                if ((AEMT.getText() != null && !AEMT.getText().isEmpty())) {
                    if(OnomaT.getText().contains(" ")||EponumoT.getText().contains(" ")||AEMT.getText().contains(" ")){
                        JOptionPane.showMessageDialog(null, "Please dont put space in the fields.", "Error message", 
                                JOptionPane.PLAIN_MESSAGE);
                    }else{
                        temp.save(OnomaT.getText(), EponumoT.getText(), AEMT.getText());
                        getContentPane().removeAll();
                        getContentPane().repaint();
                        initComponents();
                    }
                }else{
                    getContentPane().removeAll();
                    getContentPane().repaint();
                    initComponents();
                    JOptionPane.showMessageDialog(null, "Something went wrong.", "Error message", 
                            JOptionPane.PLAIN_MESSAGE);
                }
            }else{
                getContentPane().removeAll();
                getContentPane().repaint();
                initComponents();
                JOptionPane.showMessageDialog(null, "Something went wrong.", "Error message", 
                        JOptionPane.PLAIN_MESSAGE);
                
            }
        }else{
            getContentPane().removeAll();
            getContentPane().repaint();
            initComponents();
            JOptionPane.showMessageDialog(null, "Something went wrong.", "Error message", 
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        NiceClass temp = new NiceClass();
        temp.show();
        OnomaT.setText(NiceClass.onoma);
        EponumoT.setText(NiceClass.eponumo);
        AEMT.setText(NiceClass.aem);
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AEM;
    private javax.swing.JTextField AEMT;
    private javax.swing.JMenu Arxeio;
    private javax.swing.JLabel Eponumo;
    private javax.swing.JTextField EponumoT;
    private javax.swing.JLabel Onoma;
    private javax.swing.JTextField OnomaT;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem show;
    // End of variables declaration//GEN-END:variables
}