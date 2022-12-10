/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;

import Business.WorkQueue.TutorVolunteerWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author krishna
 */
public class ViewReqDetailPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TutorVolunteerWorkReq req;
    /**
     * Creates new form ViewReqDetailPanel
     */
    public ViewReqDetailPanel(JPanel userProcessContainer, TutorVolunteerWorkReq req) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.req = req;
        autoPopReq();
    }
    
    private void autoPopReq(){
        
            txtTitle.setText(req.getTitle());
            dtChoser.setDate(req.getDate());

            Date time = null;
            String volTime = req.getTime();
            SimpleDateFormat defaultfmt = new SimpleDateFormat("HH:mm");

            try {
                time = defaultfmt.parse(volTime);
            } catch (ParseException ex) {

            }

            tsTime.setValue(time);

            txtNoOfVol.setText(String.valueOf(req.getNumOfVolunteers()));
            txtNoOfHrs.setText(req.getNumOfhours());
            txtRequirements.setText(req.getMessage());
            txtPlace.setText(req.getAddress());
            txtArea.setText(req.getArea());
            txtNoOfStud.setText(String.valueOf(req.getNumOfStudents()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtChoser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtNoOfHrs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNoOfStud = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtNoOfVol = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRequirements = new javax.swing.JTextArea();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        tsTime = new javax.swing.JSpinner(sm);
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(null);
        setForeground(new java.awt.Color(102, 0, 102));

        dtChoser.setEnabled(false);
        dtChoser.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel5.setBackground(null);
        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Number of Volunteers:");

        jLabel3.setBackground(null);
        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Date:");

        jLabel1.setBackground(null);
        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Requirements:");

        txtTitle.setEditable(false);
        txtTitle.setBackground(null);
        txtTitle.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(102, 0, 102));

        txtNoOfHrs.setEditable(false);
        txtNoOfHrs.setBackground(null);
        txtNoOfHrs.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfHrs.setForeground(new java.awt.Color(102, 0, 102));
        txtNoOfHrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfHrsActionPerformed(evt);
            }
        });

        jLabel2.setBackground(null);
        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Job Title:");

        txtNoOfStud.setEditable(false);
        txtNoOfStud.setBackground(null);
        txtNoOfStud.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfStud.setForeground(new java.awt.Color(102, 0, 102));
        txtNoOfStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfStudActionPerformed(evt);
            }
        });

        btnBack.setBackground(null);
        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setBackground(null);
        jLabel9.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Number of Students:");

        txtArea.setEditable(false);
        txtArea.setBackground(null);
        txtArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(102, 0, 102));

        txtNoOfVol.setEditable(false);
        txtNoOfVol.setBackground(null);
        txtNoOfVol.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNoOfVol.setForeground(new java.awt.Color(102, 0, 102));

        jLabel11.setBackground(null);
        jLabel11.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Area:");

        jLabel10.setBackground(null);
        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Education Department Work Area");

        jLabel4.setBackground(null);
        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Number of Hours:");

        jLabel8.setBackground(null);
        jLabel8.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Place:");

        txtPlace.setEditable(false);
        txtPlace.setBackground(null);
        txtPlace.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtPlace.setForeground(new java.awt.Color(102, 0, 102));

        txtRequirements.setEditable(false);
        txtRequirements.setBackground(null);
        txtRequirements.setColumns(20);
        txtRequirements.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtRequirements.setForeground(new java.awt.Color(102, 0, 102));
        txtRequirements.setRows(5);
        jScrollPane1.setViewportView(txtRequirements);

        JSpinner.DateEditor de = new JSpinner.DateEditor(tsTime, "HH:mm");
        tsTime.setEditor(de);
        tsTime.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        tsTime.setEnabled(false);

        btnSave.setBackground(null);
        btnSave.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 0, 102));
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setBackground(null);
        jLabel7.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Time: ");

        btnUpdate.setBackground(null);
        btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 0, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoOfHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tsTime, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPlace, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNoOfVol, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dtChoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNoOfStud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(15, 15, 15)
                                .addComponent(btnSave))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tsTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNoOfStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoOfHrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfHrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfHrsActionPerformed

    private void txtNoOfStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfStudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfStudActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TutorPanel tutorPanel = (TutorPanel) component;
        tutorPanel.autoPopReqTbl();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String title = txtTitle.getText();
        if(title == null || title.equals("")){
            JOptionPane.showMessageDialog(null, "Job Title mandatory.");
            return;
        }
        req.setTitle(title);

        Date dt = dtChoser.getDate();
        if(dt == null || dt.equals("")){
            JOptionPane.showMessageDialog(null, "Date mandatory.");
            return;
        }
        if(dt.before(new Date())){
            JOptionPane.showMessageDialog(null, "Date should be valid");
            return;
        }
        req.setDate(dt);

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");

        Date time =  (Date) tsTime.getValue();
        String volTime = fmt.format(time);
        if(volTime == null || volTime.equals("")){
            JOptionPane.showMessageDialog(null, "Time field mandatory");
            return;
        }
        req.setTime(volTime);

        String volPlace = txtPlace.getText();
        if(volPlace == null || volPlace.equals("")){
            JOptionPane.showMessageDialog(null, "Place field mandatory.");
            return;
        }
        req.setAddress(volPlace);

        String volArea = txtArea.getText();
        if(volArea == null || volArea.equals("")){
            JOptionPane.showMessageDialog(null, "Area field mandatory.");
            return;
        }
        req.setArea(volArea);

        String noOfHrs = txtNoOfHrs.getText();
        if(noOfHrs == null || noOfHrs.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Hours field mandatory");
            return;
        }
        req.setNumOfhours(noOfHrs);

        String stud = txtNoOfStud.getText();
        if(stud == null || stud.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Students field mandatory.");
            return;
        }

        try {

            Integer.parseInt(stud);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Students field.");
            return;
        }
        Integer noOfStud = Integer.parseInt(stud);
        if(noOfStud<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of students should not be less than or equal to zero.");
            return;
        }
        req.setNumOfStudents(noOfStud);

        String noOfVol = txtNoOfVol.getText();
        if(noOfVol == null || noOfVol.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Volunteers field mandatory");
            return;
        }

        try {

            Integer.parseInt(noOfVol);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Volunteers field");
            return;
        }
        Integer numbVol = Integer.parseInt(noOfVol);
        if(numbVol<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of volunteers should not be less than or equal to zero.");
            return;
        }

        int curVol = req.getNumOfVolunteers();
        int vacancy = req.getVacancy();

        int assigned = curVol - vacancy;
        if(numbVol < assigned){

            JOptionPane.showMessageDialog(null, "Number of volunteers should be greater than already assigned volunteers.");
            return;

        }

        req.setNumOfVolunteers(numbVol);
        req.setVacancy(req.getNumOfVolunteers()-curVol+vacancy);

        String requirements = txtRequirements.getText();
        if(requirements == null || requirements.equals("")){
            JOptionPane.showMessageDialog(null, "Requirements field mandatory.");
            return;
        }

        if(req.getVacancy()== 0){
            req.setStatus("Completed");
        }
        else if(req.getVacancy()== req.getNumOfVolunteers()){
            req.setStatus("Sent");
        }
        else{
            req.setStatus("Pending");
        }

        JOptionPane.showMessageDialog(null, "Successful updation of request details.");

        txtTitle.setEditable(false);
        txtPlace.setEditable(false);
        txtNoOfVol.setEditable(false);
        txtNoOfStud.setEditable(false);
        txtNoOfHrs.setEditable(false);
        txtRequirements.setEditable(false);
        dtChoser.setEnabled(false);
        tsTime.setEnabled(false);
        txtArea.setEditable(false);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtTitle.setEditable(true);
        txtPlace.setEditable(true);
        txtNoOfVol.setEditable(true);
        txtNoOfStud.setEditable(true);
        txtNoOfHrs.setEditable(true);
        txtRequirements.setEditable(true);
        dtChoser.setEnabled(true);
        tsTime.setEnabled(true);
        txtArea.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dtChoser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner tsTime;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtNoOfHrs;
    private javax.swing.JTextField txtNoOfStud;
    private javax.swing.JTextField txtNoOfVol;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextArea txtRequirements;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
