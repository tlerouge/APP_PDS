/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hubanato.forms;

import edu.hubanato.controlers.CalcRateControl;

/**
 *
 * @author Nadia Randria
 */
public class CalcRateForm extends javax.swing.JFrame {

    /**
     * Creates new form CalcInteretForm
     */
    public CalcRateForm() {
        initComponents();
        btnCalculate.addActionListener(new CalcRateControl(cmbLoanType, txtRateDirector, txtAge, txtAmount, spnDuration, txtDeposit, txtRateMonth, txtRateYear, btnCalculate, lblInfo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmount = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        lblRateAppliedMonth = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        txtDeposit = new javax.swing.JTextField();
        txtRateMonth = new javax.swing.JTextField();
        spnDuration = new javax.swing.JSpinner();
        lblMonths = new javax.swing.JLabel();
        lblRateDirector = new javax.swing.JLabel();
        txtRateDirector = new javax.swing.JTextField();
        lblRateAppliedYear = new javax.swing.JLabel();
        txtRateYear = new javax.swing.JTextField();
        lblLoanType = new javax.swing.JLabel();
        cmbLoanType = new javax.swing.JComboBox();
        lblInfo = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interest Rate");

        lblAmount.setText("Montant de l'emprunt :");

        lblDuration.setText("Durée de remboursement :");

        lblDeposit.setText("Apport personnel :");

        lblRateAppliedMonth.setText("Taux d'intérêt appliqué (mensuel) :");

        btnCalculate.setText("Calculer");

        txtRateMonth.setEnabled(false);

        lblMonths.setText("months");

        lblRateDirector.setText("Taux directeur :");

        txtRateDirector.setEditable(false);

        lblRateAppliedYear.setText("Taux d'intérêt appliqué (annuel) :");

        txtRateYear.setEditable(false);

        lblLoanType.setText("Type de prêt :");

        cmbLoanType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prêt à la consommation", "Prêt automobile", "Prêt immobilier" }));

        lblAge.setText("Age :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDuration)
                            .addComponent(lblAmount)
                            .addComponent(lblDeposit)
                            .addComponent(lblRateAppliedMonth)
                            .addComponent(lblRateDirector)
                            .addComponent(lblRateAppliedYear)
                            .addComponent(lblLoanType)
                            .addComponent(lblAge))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeposit)
                            .addComponent(txtRateMonth)
                            .addComponent(txtAmount)
                            .addComponent(txtRateDirector)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMonths))
                            .addComponent(txtRateYear)
                            .addComponent(cmbLoanType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoanType)
                    .addComponent(cmbLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRateDirector)
                    .addComponent(txtRateDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonths))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeposit)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRateAppliedMonth)
                    .addComponent(txtRateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRateAppliedYear)
                    .addComponent(txtRateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CalcRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcRateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JComboBox cmbLoanType;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLoanType;
    private javax.swing.JLabel lblMonths;
    private javax.swing.JLabel lblRateAppliedMonth;
    private javax.swing.JLabel lblRateAppliedYear;
    private javax.swing.JLabel lblRateDirector;
    private javax.swing.JSpinner spnDuration;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtRateDirector;
    private javax.swing.JTextField txtRateMonth;
    private javax.swing.JTextField txtRateYear;
    // End of variables declaration//GEN-END:variables
}
