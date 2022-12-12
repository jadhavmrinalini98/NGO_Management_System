/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantRole;

import UI.RestaurantRole.*;
import UI.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.RestaurantOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Mrinalini
 */
public class RestaurantPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private RestaurantOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    double price_Dal = 2.3;
    double price_Rice = 3.3;
    double price_Biscuit = 4.6;
    double price_Rajma = 6.2;
    double price_Chole = 7.1;
    double price_Chkn = 5.2;
    double price_Tea = 1.3;
    double price_Coffee = 2.3;
    double Tax_Rate = 1.7;
    double iTax,iTotal,iSubTotal,iChange,iCost;
    
    double [] itemcost = new double[22];
    
   
    
    
    
    /**
     * Creates new form PharmacistPanel
     */
    public RestaurantPanel(JPanel userProcessContainer, UserAccount acc, RestaurantOrg org,Network net, Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.org = (RestaurantOrg)org;
        this.ent = ent;
        this.ua = acc;
        this.net=net;
        
        txtchole.setEnabled(false);
        txtDal.setEnabled(false);
        txtRice.setEnabled(false);
        txtTea.setEnabled(false);
        txtCoffee.setEnabled(false);
        txtBiscuits.setEnabled(false);
        txtRajma.setEnabled(false);
        txtchkn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkDal = new javax.swing.JCheckBox();
        chkRice = new javax.swing.JCheckBox();
        chkBiscuit = new javax.swing.JCheckBox();
        txtBiscuits = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbltax = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtTax = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        chkCoffee = new javax.swing.JCheckBox();
        chkTea = new javax.swing.JCheckBox();
        txtTea = new javax.swing.JTextField();
        txtCoffee = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        chkRajma = new javax.swing.JCheckBox();
        chkBowl = new javax.swing.JCheckBox();
        chkChole = new javax.swing.JCheckBox();
        txtRajma = new javax.swing.JTextField();
        txtchkn = new javax.swing.JTextField();
        txtchole = new javax.swing.JTextField();
        txtDal = new javax.swing.JTextField();
        txtRice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(102, 0, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setText("FAST FOOD RESTAURANT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        chkDal.setText("Dal");
        chkDal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDalActionPerformed(evt);
            }
        });

        chkRice.setText("Rice");
        chkRice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRiceActionPerformed(evt);
            }
        });

        chkBiscuit.setText("Biscuits");
        chkBiscuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBiscuitActionPerformed(evt);
            }
        });

        txtBiscuits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBiscuitsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBiscuit)
                    .addComponent(chkRice)
                    .addComponent(chkDal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(txtBiscuits, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(chkDal)
                .addGap(18, 18, 18)
                .addComponent(chkRice)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBiscuit)
                    .addComponent(txtBiscuits, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "CreditCard", "Debit Card", "Visa" }));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Payment");

        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbltax.setText("Tax");

        lblsubtotal.setText("Sub Total");

        lbltotal.setText("Total");

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltax)
                            .addComponent(lblsubtotal)
                            .addComponent(lbltotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(txtSubTotal)
                            .addComponent(txtTax))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltax))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsubtotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        chkCoffee.setText("Coffe");
        chkCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCoffeeActionPerformed(evt);
            }
        });

        chkTea.setText("Tea");
        chkTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTeaActionPerformed(evt);
            }
        });

        txtTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeaKeyTyped(evt);
            }
        });

        txtCoffee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoffeeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkTea)
                    .addComponent(chkCoffee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTea, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtCoffee))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(454, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        chkRajma.setText("Rajma");
        chkRajma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRajmaActionPerformed(evt);
            }
        });

        chkBowl.setText("Chicken Bowl");
        chkBowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBowlActionPerformed(evt);
            }
        });

        chkChole.setText("Chole");
        chkChole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCholeActionPerformed(evt);
            }
        });

        txtRajma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRajmaKeyTyped(evt);
            }
        });

        txtchkn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtchknKeyTyped(evt);
            }
        });

        txtchole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcholeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chkRajma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRajma, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkChole)
                            .addComponent(chkBowl))
                        .addGap(190, 190, 190)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtchole, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtchkn))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRajma)
                    .addComponent(txtRajma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBowl)
                    .addComponent(txtchkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkChole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtchole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtDal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDalActionPerformed(evt);
            }
        });
        txtDal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDalKeyTyped(evt);
            }
        });

        txtRice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRiceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDal, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtRice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1112, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(txtDal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkRajmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRajmaActionPerformed
        // TODO add your handling code here:
        txtRajma.setEnabled(false);
        if (chkRajma.isSelected())
        {
           txtRajma.setEnabled(true);
            txtRajma.requestFocus();
            txtRajma.setText("");
        }
        else
        {
            txtRajma.setEnabled(false);
        }
    }//GEN-LAST:event_chkRajmaActionPerformed

    private void chkTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTeaActionPerformed
        // TODO add your handling code here:
        txtTea.setEnabled(false);
        if (chkTea.isSelected())
        {
           txtTea.setEnabled(true);
           txtTea.requestFocus();
           txtTea.setText("");
        }
        else
        {
            txtTea.setEnabled(false);
        }
    }//GEN-LAST:event_chkTeaActionPerformed

    private void txtDalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDalActionPerformed

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed
    private JFrame frame;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
          System.exit(0);  
        }
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDalKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtDalKeyTyped

    private void txtRiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRiceKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtRiceKeyTyped

    private void txtBiscuitsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBiscuitsKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtBiscuitsKeyTyped

    private void txtRajmaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRajmaKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtRajmaKeyTyped

    private void txtchknKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtchknKeyTyped
        // TODO add your handling code here:char iNumber = evt.getKeyChar();
       char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
        
    }//GEN-LAST:event_txtchknKeyTyped

    private void txtcholeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcholeKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtcholeKeyTyped

    private void txtTeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeaKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtTeaKeyTyped

    private void txtCoffeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoffeeKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))|| (iNumber == KeyEvent.VK_BACK_SPACE)|| (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
    }
    }//GEN-LAST:event_txtCoffeeKeyTyped
    
    private void chkDalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDalActionPerformed
        // TODO add your handling code here:
        txtDal.setEnabled(false);
        txtDal.setEnabled(false);
        if (chkDal.isSelected())
        {
           txtDal.setEnabled(true);
           txtDal.requestFocus();
           txtRice.setText("");
        }
        else
        {
            txtDal.setEnabled(false);
        }
    }//GEN-LAST:event_chkDalActionPerformed

    private void chkRiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRiceActionPerformed
        // TODO add your handling code here:
        txtRice.setEnabled(false);
        if (chkRice.isSelected())
        {
           txtRice.setEnabled(true);
           txtRice.requestFocus();
           txtRice.setText("");
        }
        else
        {
            txtRice.setEnabled(false);
        }
    }//GEN-LAST:event_chkRiceActionPerformed

    private void chkBiscuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBiscuitActionPerformed
        // TODO add your handling code here:
        txtBiscuits.setEnabled(false);
        if (chkBiscuit.isSelected())
        {
           txtBiscuits.setEnabled(true);
           txtBiscuits.requestFocus();
           txtBiscuits.setText("");
        }
        else
        {
            txtBiscuits.setEnabled(false);
        }
    }//GEN-LAST:event_chkBiscuitActionPerformed

    private void chkBowlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBowlActionPerformed
        // TODO add your handling code here:
        txtchkn.setEnabled(false);
        if (chkBowl.isSelected())
        {
           txtchkn.setEnabled(true);
            txtchkn.requestFocus();
            txtchkn.setText("");
        }
        else
        {
            txtchkn.setEnabled(false);
        }
    }//GEN-LAST:event_chkBowlActionPerformed

    private void chkCholeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCholeActionPerformed
        // TODO add your handling code here:
        
        if (chkChole.isSelected())
        {
           txtchole.setEnabled(true);
            txtchole.requestFocus();
            txtchole.setText("");
        }
        
        else
        {
            txtchole.setEnabled(false);
        }
    }//GEN-LAST:event_chkCholeActionPerformed

    private void chkCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCoffeeActionPerformed
        // TODO add your handling code here:
        txtCoffee.setEnabled(false);
        if (chkCoffee.isSelected())
        {
           txtCoffee.setEnabled(true);
            txtCoffee.requestFocus();
             txtCoffee.setText("");
        }
        else
        {
            txtCoffee.setEnabled(false);
        }
    }//GEN-LAST:event_chkCoffeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        itemcost[0] = Double.parseDouble(txtDal.getText());
        itemcost[1] = Double.parseDouble(txtRice.getText());
        itemcost[2] = Double.parseDouble(txtBiscuits.getText());
        itemcost[3] = Double.parseDouble(txtRajma.getText());
        itemcost[4] = Double.parseDouble(txtchole.getText());
        itemcost[5] = Double.parseDouble(txtchkn.getText());
        itemcost[6] = Double.parseDouble(txtTea.getText());
        itemcost[7] = Double.parseDouble(txtCoffee.getText());
        
        iSubTotal = itemcost[0] + itemcost[1]+ itemcost[2]+  itemcost[3]+ itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7];
        
        
        
        iTax = (iSubTotal * Tax_Rate)/100;
        
        String cTax = String.format("$%.2f", iTax);
        txtTax.setText(cTax);
        
        String cSubTotal = String.format("$%.2f", iSubTotal);
        txtSubTotal.setText(cSubTotal);
        
        String iAmount = String.format("$%.2f", iSubTotal+ iTax );
        txtTotal.setText(iAmount);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtDal.setText(null);
        txtRice.setText(null);
        txtBiscuits.setText(null);
        txtRajma.setText(null);
        txtchole.setText(null);
        txtTea.setText(null);
        txtCoffee.setText(null);
        txtchkn.setText(null);
        txtTax.setText(null);
        txtSubTotal.setText(null);
        txtTotal.setText(null);
        
        chkDal.setSelected(false);
        chkRice.setSelected(false);
        chkBiscuit.setSelected(false);
        chkRajma.setSelected(false);
        chkChole.setSelected(false);
        chkBowl.setSelected(false);
        chkTea.setSelected(false);
        chkCoffee.setSelected(false);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBiscuit;
    private javax.swing.JCheckBox chkBowl;
    private javax.swing.JCheckBox chkChole;
    private javax.swing.JCheckBox chkCoffee;
    private javax.swing.JCheckBox chkDal;
    private javax.swing.JCheckBox chkRajma;
    private javax.swing.JCheckBox chkRice;
    private javax.swing.JCheckBox chkTea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltax;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txtBiscuits;
    private javax.swing.JTextField txtCoffee;
    private javax.swing.JTextField txtDal;
    private javax.swing.JTextField txtRajma;
    private javax.swing.JTextField txtRice;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTea;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtchkn;
    private javax.swing.JTextField txtchole;
    // End of variables declaration//GEN-END:variables
}
