
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author brent
 */
public class PIn extends javax.swing.JFrame {

    /**
     * Creates new form PIn
     */
    public PIn() {
        initComponents();
    }
    {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Num2 = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        EnterButton = new javax.swing.JButton();
        MinusButton = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        pinField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 40));

        Num2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });
        jPanel1.add(Num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 53));

        Num1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });
        jPanel1.add(Num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 53));

        Num3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });
        jPanel1.add(Num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 70, 53));

        Num4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });
        jPanel1.add(Num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 53));

        Num5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });
        jPanel1.add(Num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 53));

        Num6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });
        jPanel1.add(Num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, 53));

        Num7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });
        jPanel1.add(Num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 70, 53));

        Num8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });
        jPanel1.add(Num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 70, 53));

        Num9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });
        jPanel1.add(Num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 70, 53));

        CancelButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 88, 53));

        EnterButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 90, 50));

        MinusButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MinusButton.setText("-");
        MinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MinusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 70, 53));

        Num0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num0.setText("0");
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });
        jPanel1.add(Num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 70, 53));

        AddButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddButton.setText("+");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 70, 53));

        ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 50));

        ClearButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 88, 53));

        pinField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        appendTopinField("2");
    }//GEN-LAST:event_Num2ActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        appendTopinField("1");
    }//GEN-LAST:event_Num1ActionPerformed

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num3ActionPerformed
        appendTopinField("3");
    }//GEN-LAST:event_Num3ActionPerformed

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num4ActionPerformed
        appendTopinField("4");
    }//GEN-LAST:event_Num4ActionPerformed

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num5ActionPerformed
        appendTopinField("5");
    }//GEN-LAST:event_Num5ActionPerformed

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num6ActionPerformed
        appendTopinField("6");
    }//GEN-LAST:event_Num6ActionPerformed

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num7ActionPerformed
        appendTopinField("7");
    }//GEN-LAST:event_Num7ActionPerformed

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num8ActionPerformed
        appendTopinField("8");
    }//GEN-LAST:event_Num8ActionPerformed

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num9ActionPerformed
        appendTopinField("9");
    }//GEN-LAST:event_Num9ActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Made by:Lorenzo Brent Reed C. Varca ITE232");
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed

        String pin = pinField.getText(); // Assuming pinField is your JTextField for entering the PIN

        if(pin.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out the PIN field");
        } else if(pin.equals("1234")) {
            ATM atm = new ATM();
            atm.setVisible(true);

            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect PIN");
        }
        pinField.setText("");
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void MinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinusButtonActionPerformed

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num0ActionPerformed
        appendTopinField("0");
    }//GEN-LAST:event_Num0ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Lorenzo Brent Reed C. Varca, ITE - 232");
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        pinField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void pinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinFieldActionPerformed

    }//GEN-LAST:event_pinFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton EnterButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton MinusButton;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pinField;
    // End of variables declaration//GEN-END:variables

      private void appendTopinField(String digit) {
 pinField.setText(pinField.getText() + digit);
}

}
