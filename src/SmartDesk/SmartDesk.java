/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartDesk;

/**
 *
 * @author Simmigon Flagg
 */
public class SmartDesk extends javax.swing.JFrame {

    /**
     * Creates new form SmartDesk
     */
    public SmartDesk() {
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

        jLabel6 = new javax.swing.JLabel();
        PanCard = new javax.swing.JPanel();
        CardPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        CardPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CardPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CardPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPanel1 = new javax.swing.JButton();
        btnPanel4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 560));
        setPreferredSize(new java.awt.Dimension(1000, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmartDesk/newbackground.jpg"))); // NOI18N
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        PanCard.setBackground(new java.awt.Color(0, 0, 0));
        PanCard.setOpaque(false);
        PanCard.setLayout(new java.awt.CardLayout());

        CardPanel1.setBackground(new java.awt.Color(102, 255, 0));
        CardPanel1.setOpaque(false);
        CardPanel1.setPreferredSize(new java.awt.Dimension(971, 453));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CardPanel1Layout = new javax.swing.GroupLayout(CardPanel1);
        CardPanel1.setLayout(CardPanel1Layout);
        CardPanel1Layout.setHorizontalGroup(
            CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(749, Short.MAX_VALUE))
            .addGroup(CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CardPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(804, Short.MAX_VALUE)))
            .addGroup(CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CardPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );

        CardPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField1, jTextField2});

        CardPanel1Layout.setVerticalGroup(
            CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CardPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addContainerGap(403, Short.MAX_VALUE)))
            .addGroup(CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CardPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );

        CardPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField1, jTextField2});

        PanCard.add(CardPanel1, "card2");

        CardPanel2.setBackground(new java.awt.Color(0, 204, 204));
        CardPanel2.setOpaque(false);
        CardPanel2.setPreferredSize(new java.awt.Dimension(971, 453));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmartDesk/Slide2.JPG"))); // NOI18N

        javax.swing.GroupLayout CardPanel2Layout = new javax.swing.GroupLayout(CardPanel2);
        CardPanel2.setLayout(CardPanel2Layout);
        CardPanel2Layout.setHorizontalGroup(
            CardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        CardPanel2Layout.setVerticalGroup(
            CardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel2, "card2");

        CardPanel3.setBackground(new java.awt.Color(153, 0, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmartDesk/Slide3.JPG"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout CardPanel3Layout = new javax.swing.GroupLayout(CardPanel3);
        CardPanel3.setLayout(CardPanel3Layout);
        CardPanel3Layout.setHorizontalGroup(
            CardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CardPanel3Layout.setVerticalGroup(
            CardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel3, "card2");

        CardPanel4.setBackground(new java.awt.Color(0, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmartDesk/Slide1.JPG"))); // NOI18N

        javax.swing.GroupLayout CardPanel4Layout = new javax.swing.GroupLayout(CardPanel4);
        CardPanel4.setLayout(CardPanel4Layout);
        CardPanel4Layout.setHorizontalGroup(
            CardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CardPanel4Layout.setVerticalGroup(
            CardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel4, "card2");

        getContentPane().add(PanCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel2.setOpaque(false);

        btnPanel1.setText("Cancel");
        btnPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel1ActionPerformed(evt);
            }
        });

        btnPanel4.setText("Login");
        btnPanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(673, Short.MAX_VALUE)
                .addComponent(btnPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel4)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPanel1, btnPanel4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPanel4)
                    .addComponent(btnPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPanel1, btnPanel4});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 471, 879, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel4ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel2);
        PanCard.repaint();
        PanCard.revalidate();
        btnPanel4.setVisible(false);
        btnPanel4.setVisible(false);
        
    }//GEN-LAST:event_btnPanel4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel1ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel1);
        PanCard.repaint();
        PanCard.revalidate();
    }//GEN-LAST:event_btnPanel1ActionPerformed

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
            java.util.logging.Logger.getLogger(SmartDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartDesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel1;
    private javax.swing.JPanel CardPanel2;
    private javax.swing.JPanel CardPanel3;
    private javax.swing.JPanel CardPanel4;
    private javax.swing.JPanel PanCard;
    private javax.swing.JButton btnPanel1;
    private javax.swing.JButton btnPanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
