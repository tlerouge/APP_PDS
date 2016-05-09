/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hubanato.forms;

import edu.hubanato.entities.RateVariable;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Baptiste
 */
public class PanelStableRate extends javax.swing.JPanel implements Observer {

    RateVariable rateVariable;
    
    /**
     * Creates new form PanelStableRate
     */
    public PanelStableRate(RateVariable rateVariable) {
        this.rateVariable = rateVariable;
        initComponents();
        
        System.out.println("Add RateStable Object to observer");
        rateVariable.addObserver(this);
    }
    
    public PanelStableRate() {
        this(new RateVariable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelStableRate = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStableRate = new javax.swing.JTable();

        TableStableRate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Year", "Index", "NewRate", "Monthly", "Remaining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableStableRate);
        TableStableRate.getAccessibleContext().setAccessibleName("");
        TableStableRate.getAccessibleContext().setAccessibleParent(PanelStableRate);

        javax.swing.GroupLayout PanelStableRateLayout = new javax.swing.GroupLayout(PanelStableRate);
        PanelStableRate.setLayout(PanelStableRateLayout);
        PanelStableRateLayout.setHorizontalGroup(
            PanelStableRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStableRateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelStableRateLayout.setVerticalGroup(
            PanelStableRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStableRateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelStableRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelStableRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        PanelStableRate.getAccessibleContext().setAccessibleName("StableRate");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelStableRate;
    private javax.swing.JTable TableStableRate;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        ((javax.swing.table.DefaultTableModel)TableStableRate.getModel()).addRow(new Object[]{""});

        System.out.println("Rentre update StableRate");

        TableStableRate.setValueAt("1", 1, 0);
        TableStableRate.setValueAt("3.45", 1, 1);
        TableStableRate.setValueAt("4", 1, 2);
        TableStableRate.setValueAt("1563.98", 1, 3);
        TableStableRate.setValueAt("89689", 1, 4);
    }
}
