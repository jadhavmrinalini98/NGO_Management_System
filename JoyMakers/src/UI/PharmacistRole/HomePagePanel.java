/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacistRole;

import UI.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrg;
import Business.Organization.HealthOrg;
import Business.Organization.Organisation;
import Business.Organization.PharmacyOrg;
import Business.Organization.TransportOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TutorVolunteerWorkReq;
import Business.WorkQueue.HospitalDoctorWorkReq;
import Business.WorkQueue.HospitalPharmacyWorkReq;
import Business.WorkQueue.LaboratoryTestWorkReq;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class HomePagePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PharmacyOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    /**
     * Creates new form HomePagePanel
     */
    public HomePagePanel(JPanel userProcessContainer, UserAccount acc, PharmacyOrg org,Network net, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = (PharmacyOrg)org;
        this.ent = ent;
        this.ua = acc;
        this.net=net;
        autoPopAssignedReq();
    }
    
    public void autoPopAssignedReq() {
        DefaultTableModel mdl = (DefaultTableModel)tblAssignReq.getModel();
        mdl.setRowCount(0);   
        
        for (Iterator<WorkRequest> wr = ua.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
             WorkRequest workRequest = wr.next();
           if(workRequest instanceof HospitalPharmacyWorkReq){
                HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq)workRequest;
                Object[] row = new Object[6];
                row[0] = req;
                row[1]=req.getNgo();
                row[3]=req.getMedList();
                row[2]=req.getSender();
                row[4] = req.getReqDate();
                row[5]=req.getStatus();
                mdl.addRow(row);
           }
           
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

        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssignReq = new javax.swing.JTable();
        btnViewMedList = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnBacks = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        btnRefresh.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 153, 153));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(102, 0, 102));

        tblAssignReq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblAssignReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NGO", "Sender", "Medicine List", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAssignReq.setPreferredSize(new java.awt.Dimension(375, 64));
        jScrollPane1.setViewportView(tblAssignReq);

        btnViewMedList.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        btnViewMedList.setForeground(new java.awt.Color(0, 153, 153));
        btnViewMedList.setText("View Medicine List");
        btnViewMedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedListActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(0, 153, 153));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jScrollPane3.setForeground(new java.awt.Color(102, 0, 102));

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtMessage.setRows(5);
        jScrollPane3.setViewportView(txtMessage);

        btnBacks.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        btnBacks.setForeground(new java.awt.Color(0, 153, 153));
        btnBacks.setText("<<<Back");
        btnBacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacksActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HomePage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewMedList))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBacks)))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBacks)
                .addGap(20, 20, 20)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewMedList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        autoPopAssignedReq();
        txtMessage.setText("");   
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewMedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedListActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblAssignReq.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Make row selection");
            return;
        }
        HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq)tblAssignReq.getValueAt(selectedRow, 0);
        txtMessage.setText(req.getMedList()+" ");
        txtMessage.setEditable(false);
    }//GEN-LAST:event_btnViewMedListActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblAssignReq.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "");
            return;
        }

        HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq)tblAssignReq.getValueAt(selectedRow, 0);
        if(req.getStatus().equalsIgnoreCase("Accepted")){
            JOptionPane.showMessageDialog(null, "Successfully processed and accepted request");
            return;
        }
        req.setStatus("Processing");

        ProcessMedReq processMedReq = new ProcessMedReq(userProcessContainer,ent, ua, req);
        userProcessContainer.add("processMedReq", processMedReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnBacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacksActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBacksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacks;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewMedList;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAssignReq;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
