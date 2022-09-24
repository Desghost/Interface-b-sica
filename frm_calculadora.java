package interfacegrafica;

import javax.swing.JOptionPane;

public class frm_calculadora extends javax.swing.JFrame {

    public frm_calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNum01 = new javax.swing.JTextField();
        txtNum02 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        rbSomar = new javax.swing.JRadioButton();
        rbSubtrair = new javax.swing.JRadioButton();
        rbMultiplicar = new javax.swing.JRadioButton();
        rbDividir = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campo de texto");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Senac");

        jLabel2.setText("Valor A:");

        jLabel3.setText("Valor B:");

        txtNum02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum02ActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado:");

        txtResultado.setEditable(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSomar);
        rbSomar.setText("Somar");

        buttonGroup1.add(rbSubtrair);
        rbSubtrair.setText("Subtrair");

        buttonGroup1.add(rbMultiplicar);
        rbMultiplicar.setText("Multiplicar");

        buttonGroup1.add(rbDividir);
        rbDividir.setText("Dividir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCalcular))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNum01, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtResultado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSomar)
                            .addComponent(rbSubtrair)
                            .addComponent(rbDividir))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbMultiplicar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(rbSomar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNum02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDividir))
                .addGap(89, 89, 89)
                .addComponent(btnCalcular)
                .addGap(0, 126, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNum02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum02ActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String a = txtNum01.getText();
        String b = txtNum02.getText();
        
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        
        if(rbSomar.isSelected()){
            int calculo = n1+n2;    
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        }else if(rbSubtrair.isSelected()){
            int calculo = n1-n2;    
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        }else if(rbDividir.isSelected()){
            int calculo = n1/n2;    
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        }else if(rbMultiplicar.isSelected()){
            int calculo = n1*n2;    
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione uma operação!");
        }
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbDividir;
    private javax.swing.JRadioButton rbMultiplicar;
    private javax.swing.JRadioButton rbSomar;
    private javax.swing.JRadioButton rbSubtrair;
    private javax.swing.JTextField txtNum01;
    private javax.swing.JTextField txtNum02;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
