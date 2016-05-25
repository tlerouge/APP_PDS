/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hubanato.controlers;

import edu.hubanato.entities.InterestRate;
import edu.hubanato.entities.RateParentCompany;
import edu.hubanato.entities.RiskInterestRate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class is used to define the interest rate
 *
 * @author Nadia Randria
 */
public class CalculateInterestRateControl implements ActionListener {
    
    private InterestRate intrate;
    private RateParentCompany ratedir;
    private RiskInterestRate risk;
    
    private JComboBox loanType;
    private JComboBox age;
    private JComboBox professionalSituation;
    private JComboBox loanTerm;
    private JComboBox personalContribution;
    private JComboBox debtRatio;
    
    private JTextField rateDirector;
    private JTextField interestRate;
    
    private JTextArea resultEvaluation;
    
    private JButton evaluate;
    private JButton saveInterestRate;
    
    public CalculateInterestRateControl(JComboBox loanType, JComboBox age, JComboBox proSituation,
            JComboBox loanTerm, JComboBox persoContribution, JComboBox debtRatio, JTextArea evaluation,
            JTextField rated, JTextField inrate, JButton evaluate, JButton saveInterestRate) {
        this.loanType = loanType;
        this.age = age;
        this.professionalSituation = proSituation;
        this.loanTerm = loanTerm;
        this.personalContribution = persoContribution;
        this.debtRatio = debtRatio;
        this.resultEvaluation = evaluation;
        this.rateDirector = rated;
        this.interestRate = inrate;
        this.evaluate = evaluate;
        this.saveInterestRate = saveInterestRate;
    }

    /**
     *
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        
        if (source == evaluate) {
            
            String type = loanType.getSelectedItem().toString();
            
            String str = age.getSelectedItem().toString();
            int ageMin = Integer.parseInt(str.substring(0, 2));
            int ageMax = Integer.parseInt(str.substring(5, 7));
            
            String profession = professionalSituation.getSelectedItem().toString();
            int term = Integer.parseInt(loanTerm.getSelectedItem().toString());
            int contribution = Integer.parseInt(personalContribution.getSelectedItem().toString());
            int ratio = Integer.parseInt(debtRatio.getSelectedItem().toString());
            
            
            
            this.ratedir = new RateParentCompany(term, type);
            this.risk = new RiskInterestRate(type, ageMin, ageMax, profession, term, contribution, ratio);
            
            try {
                float rate = ratedir.SelectRateDirector(type, term);
                rateDirector.setText(String.valueOf(rate));
                
                String viewRisk = risk.ViewRisk();
                
                resultEvaluation.setText("Type de prêt : " + type + "\n Age Min: " + ageMin + "\n Age Max : " + ageMax + "\n Situation Pro : " + profession + "\n Durée : "
                    + term + "\n Apport : " + contribution + "\n Taux d'endettement : " + ratio + "\n Risques : " + viewRisk);
                
            } catch (SQLException ex) {
                Logger.getLogger(CalculateInterestRateControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (source == saveInterestRate) {
            String type = loanType.getSelectedItem().toString();
            //int agePers = Integer.parseInt(age.getSelectedItem().toString());
            
            String str = age.getSelectedItem().toString();
            int ageMin = Integer.parseInt(str.substring(0, 2));
            int ageMax = Integer.parseInt(str.substring(5, 7));
            
            int term = Integer.parseInt(loanTerm.getSelectedItem().toString());
            float inRate = Float.parseFloat(interestRate.getText());
            
            resultEvaluation.setText("Taux d'intérêt : " + inRate + "\n Age Min: " + ageMin + "\n Age Max : " + ageMax + "\n Durée : "
                    + term + "\n Type de prêt : " + type );
            
            this.intrate = new InterestRate(inRate, ageMin, ageMax, term, type);
            
            try {
                intrate.SaveInterestRate();
            } catch (SQLException ex) {
                Logger.getLogger(CalculateInterestRateControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}