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

        PanCard = new javax.swing.JPanel();
        CardPanel1 = new javax.swing.JPanel();
        CardPanel2 = new javax.swing.JPanel();
        CardPanel3 = new javax.swing.JPanel();
        CardPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPanel1 = new javax.swing.JButton();
        btnPanel2 = new javax.swing.JButton();
        btnPanel3 = new javax.swing.JButton();
        btnPanel4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 560));
        setPreferredSize(new java.awt.Dimension(1000, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanCard.setBackground(new java.awt.Color(0, 0, 0));
        PanCard.setOpaque(false);
        PanCard.setLayout(new java.awt.CardLayout());

        CardPanel1.setBackground(new java.awt.Color(102, 255, 0));
        CardPanel1.setOpaque(false);
        CardPanel1.setPreferredSize(new java.awt.Dimension(971, 453));

        javax.swing.GroupLayout CardPanel1Layout = new javax.swing.GroupLayout(CardPanel1);
        CardPanel1.setLayout(CardPanel1Layout);
        CardPanel1Layout.setHorizontalGroup(
            CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        CardPanel1Layout.setVerticalGroup(
            CardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel1, "card2");

        CardPanel2.setBackground(new java.awt.Color(0, 204, 204));
        CardPanel2.setOpaque(false);
        CardPanel2.setPreferredSize(new java.awt.Dimension(971, 453));

        javax.swing.GroupLayout CardPanel2Layout = new javax.swing.GroupLayout(CardPanel2);
        CardPanel2.setLayout(CardPanel2Layout);
        CardPanel2Layout.setHorizontalGroup(
            CardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        CardPanel2Layout.setVerticalGroup(
            CardPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel2, "card2");

        CardPanel3.setBackground(new java.awt.Color(153, 0, 255));

        javax.swing.GroupLayout CardPanel3Layout = new javax.swing.GroupLayout(CardPanel3);
        CardPanel3.setLayout(CardPanel3Layout);
        CardPanel3Layout.setHorizontalGroup(
            CardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        CardPanel3Layout.setVerticalGroup(
            CardPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel3, "card2");

        CardPanel4.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout CardPanel4Layout = new javax.swing.GroupLayout(CardPanel4);
        CardPanel4.setLayout(CardPanel4Layout);
        CardPanel4Layout.setHorizontalGroup(
            CardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        CardPanel4Layout.setVerticalGroup(
            CardPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        PanCard.add(CardPanel4, "card2");

        getContentPane().add(PanCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel2.setOpaque(false);

        btnPanel1.setText("Answer");
        btnPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel1ActionPerformed(evt);
            }
        });

        btnPanel2.setText("Save");
        btnPanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel2ActionPerformed(evt);
            }
        });

        btnPanel3.setText("Show Parents");
        btnPanel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel3ActionPerformed(evt);
            }
        });

        btnPanel4.setText("Save");
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
                .addContainerGap()
                .addComponent(btnPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
                .addComponent(btnPanel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel4)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPanel1, btnPanel2, btnPanel3, btnPanel4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPanel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPanel4)
                        .addComponent(btnPanel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPanel1, btnPanel2, btnPanel3, btnPanel4});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 471, 879, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmartDesk/back.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel1ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel1);
        PanCard.repaint();
        PanCard.revalidate();
    }//GEN-LAST:event_btnPanel1ActionPerformed

    private void btnPanel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel3ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel3);
        PanCard.repaint();
        PanCard.revalidate();
    }//GEN-LAST:event_btnPanel3ActionPerformed

    private void btnPanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel2ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel2);
        PanCard.repaint();
        PanCard.revalidate();
    }//GEN-LAST:event_btnPanel2ActionPerformed

    private void btnPanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel4ActionPerformed
        PanCard.removeAll();
        PanCard.repaint();
        PanCard.revalidate();

        PanCard.add(CardPanel4);
        PanCard.repaint();
        PanCard.revalidate();
    }//GEN-LAST:event_btnPanel4ActionPerformed

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
    private javax.swing.JButton btnPanel2;
    private javax.swing.JButton btnPanel3;
    private javax.swing.JButton btnPanel4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
