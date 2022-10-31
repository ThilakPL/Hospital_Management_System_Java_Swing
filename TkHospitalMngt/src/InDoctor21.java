
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAAVIASUDHAN
 */
public class InDoctor21 extends javax.swing.JFrame {

    /**
     * Creates new form InDoctor21
     */
    public InDoctor21(String username) {
        initComponents();
        LabUser.setText(username);
        String psd = JPassId.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabId = new javax.swing.JLabel();
        LabName = new javax.swing.JLabel();
        Labdob = new javax.swing.JLabel();
        LabGen = new javax.swing.JLabel();
        Labqual = new javax.swing.JLabel();
        LabTime = new javax.swing.JLabel();
        LabMail = new javax.swing.JLabel();
        LabUser = new javax.swing.JLabel();
        JPassId = new javax.swing.JPasswordField();
        LabOtpdis = new javax.swing.JLabel();
        btnverify = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T K HOSPITAL SERVICE AND CENTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 1500, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bg_Color.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1520, 90));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOCTOR - SECTION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 1500, 55));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFILE DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel3.setText("Profile Id No");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel6.setText("DOB");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel8.setText("Education Qualification");

        jLabel9.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel9.setText("Shift Timing");

        jLabel10.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel10.setText("Mail Id");

        jLabel11.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel11.setText("Username");

        jLabel12.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel12.setText("Password");

        LabId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabId.setText("Display_Id");

        LabName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabName.setText("Display_Name");

        Labdob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Labdob.setText("Display_DOB");

        LabGen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabGen.setText("Display_Gender");

        Labqual.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Labqual.setText("Display_Qualification");

        LabTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabTime.setText("Display_Timing");

        LabMail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabMail.setText("Display_Mail_Id");

        LabUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabUser.setText("Display_UserId");

        JPassId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JPassId.setText("jPasswordField1");

        LabOtpdis.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        LabOtpdis.setText("OTP_CAPCHA_Disp.");
        LabOtpdis.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LabOtpdisAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnverify.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnverify.setIcon(new javax.swing.ImageIcon("C:\\Users\\VARATHAMOHAN\\Pictures\\JAVA _ TK_LOGO\\Btn_Icon\\verify_34x.png")); // NOI18N
        btnverify.setText("View Password");
        btnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Labqual, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(LabId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabName, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(Labdob, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(LabGen, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(LabTime, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(LabMail, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(LabUser, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(JPassId))
                .addGap(18, 18, 18)
                .addComponent(LabOtpdis, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnverify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labdob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabGen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labqual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabMail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(JPassId))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnverify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabOtpdis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 236, 1100, -1));

        btnBack.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 186, 120, 39));

        btnExit.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnExit.setText("X EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1302, 186, 120, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String uname = LabUser.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tk_hms","root","");
                Statement stmt=con.createStatement();
                ResultSet bs=stmt.executeQuery("select * from doctor;");
                while(bs.next())  {
                    if (bs.getString(10).equals(uname)){
                        String id = bs.getString(1);
                        String name= bs.getString(2);
                        String dob= bs.getString(3);
                        String gender= bs.getString(4);
                        String eduqual= bs.getString(5);
                        String timing=bs.getString(7);
                        String mail= bs.getString(8);
                        String username= bs.getString(10);
                        String psd= bs.getString(11);
                        
                        LabId.setText(String.valueOf(id));
                        LabName.setText(String.valueOf(name));
                        Labdob.setText(String.valueOf(dob));      
                        LabGen.setText(String.valueOf(gender));
                        Labqual.setText(String.valueOf(eduqual));
                        LabTime.setText(String.valueOf(timing));
                        LabMail.setText(String.valueOf(mail));
                        LabUser.setText(String.valueOf(username));
                        JPassId.setText(String.valueOf(psd));
                                               
                        JOptionPane.showMessageDialog(this, "Successfully the given Id number "+uname+" Details are Display");
                        
                    }
                    else if(bs.getString(10) != uname){
                    
                        //JOptionPane.showMessageDialog(this, "The Given Register Id is " + regno + " is Not Found. \nTry again With other's Id");
                    } 
                }  
        }
        catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void LabOtpdisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LabOtpdisAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LabOtpdisAncestorAdded

    private void btnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyActionPerformed
        // TODO add your handling code here:
        String psd = JPassId.getText();

        String otp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(otp.length());

            // get character specified by index
            // from the string
            char randomChar = otp.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        //System.out.println("Random String is: " + randomString);
        LabOtpdis.setText(randomString);
        
        String name=JOptionPane.showInputDialog(this,"Enter Capcha : ");
        
        if(name.equals(randomString)){
            JOptionPane.showMessageDialog(this,"You Entered Correct Capcha");
            LabOtpdis.setText(psd);
        }else{
            JOptionPane.showMessageDialog(this,"You Wrongly Entered Correct Capcha!, Try Again");
        }
    }//GEN-LAST:event_btnverifyActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        String docname = LabName.getText();
        
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        InDoctorIndex ld1 = new InDoctorIndex(docname);
        ld1.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(InDoctor21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InDoctor21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InDoctor21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InDoctor21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InDoctor21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPassId;
    private javax.swing.JLabel LabGen;
    private javax.swing.JLabel LabId;
    private javax.swing.JLabel LabMail;
    private javax.swing.JLabel LabName;
    private javax.swing.JLabel LabOtpdis;
    private javax.swing.JLabel LabTime;
    private javax.swing.JLabel LabUser;
    private javax.swing.JLabel Labdob;
    private javax.swing.JLabel Labqual;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnverify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
