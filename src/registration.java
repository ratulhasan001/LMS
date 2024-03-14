
import java.sql.*;
import java.awt.*;
import javax.swing.*;

public class registration extends javax.swing.JFrame {
    Connection con=null;

 
    public registration() {
        initComponents();
        con=dbConnection.con();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2_email = new javax.swing.JTextField();
        jPasswordField1_pass = new javax.swing.JPasswordField();
        signupbutton = new javax.swing.JButton();
        jTextField1_name = new javax.swing.JTextField();
        jTextField3_designation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField2_pass2 = new javax.swing.JPasswordField();
        haveaccount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jTextField2_email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField2_email.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2_email.setText("Email");
        jTextField2_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2_emailFocusLost(evt);
            }
        });
        jTextField2_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_emailActionPerformed(evt);
            }
        });

        jPasswordField1_pass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPasswordField1_pass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1_pass.setText("Password");
        jPasswordField1_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1_passFocusLost(evt);
            }
        });
        jPasswordField1_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1_passActionPerformed(evt);
            }
        });

        signupbutton.setBackground(new java.awt.Color(204, 204, 204));
        signupbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signupbutton.setText("Sign Up");
        signupbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });

        jTextField1_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1_name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1_name.setText("Full Name");
        jTextField1_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_nameFocusLost(evt);
            }
        });
        jTextField1_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nameActionPerformed(evt);
            }
        });

        jTextField3_designation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField3_designation.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3_designation.setText("Designation");
        jTextField3_designation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3_designationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3_designationFocusLost(evt);
            }
        });
        jTextField3_designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_designationActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Designation");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Full Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Confirm Password");
        jLabel11.setAutoscrolls(true);

        jPasswordField2_pass2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField2_pass2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField2_pass2.setText("Password");
        jPasswordField2_pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2_pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2_pass2FocusLost(evt);
            }
        });
        jPasswordField2_pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2_pass2ActionPerformed(evt);
            }
        });

        haveaccount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        haveaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        haveaccount.setText(">> Have an Account? Then Sign In");
        haveaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haveaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                haveaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                haveaccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3_designation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jPasswordField1_pass)
                    .addComponent(jTextField1_name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2_email)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField2_pass2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(haveaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(haveaccount)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN UP");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3_designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_designationActionPerformed

    private void jTextField3_designationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3_designationFocusLost
        // TODO add your handling code here:
         if(jTextField3_designation.getText().trim().equals("")||
            jTextField3_designation.getText().trim().toLowerCase().equals("Designation"))
        {
            jTextField3_designation.setText("Designation");
            jTextField3_designation.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3_designationFocusLost

    private void jTextField3_designationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3_designationFocusGained
        // TODO add your handling code here:
        if(jTextField3_designation.getText().trim().toLowerCase().equals("designation")){
            jTextField3_designation.setText("");
            jTextField3_designation.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField3_designationFocusGained

    private void jTextField1_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nameActionPerformed

    private void jTextField1_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_nameFocusLost
        // TODO add your handling code here:
        if(jTextField1_name.getText().trim().equals("")||
            jTextField1_name.getText().trim().toLowerCase().equals("Full Name"))
        {
            jTextField1_name.setText("Full Name");
            jTextField1_name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1_nameFocusLost

    private void jTextField1_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_nameFocusGained
        // TODO add your handling code here:
        if(jTextField1_name.getText().trim().toLowerCase().equals("full name")){
            jTextField1_name.setText("");
            jTextField1_name.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1_nameFocusGained

    private void jPasswordField1_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1_passActionPerformed

    private void jPasswordField1_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1_passFocusLost
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField1_pass.getPassword());
        if(pass.trim().equals("")||
            pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1_pass.setText("Password");
            jPasswordField1_pass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1_passFocusLost

    private void jPasswordField1_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1_passFocusGained
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField1_pass.getPassword());
        if(pass.trim().toLowerCase().equals("password")){
            jPasswordField1_pass.setText("");
            jPasswordField1_pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField1_passFocusGained

    private void jTextField2_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_emailActionPerformed

    private void jTextField2_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_emailFocusLost
        if(jTextField2_email.getText().trim().equals("")||
            jTextField2_email.getText().trim().toLowerCase().equals("Email"))
        {
            jTextField2_email.setText("Email");
            jTextField2_email.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2_emailFocusLost

    private void jTextField2_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2_emailFocusGained
        // TODO add your handling code here:
        if(jTextField2_email.getText().trim().toLowerCase().equals("email")){
            jTextField2_email.setText("");
            jTextField2_email.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField2_emailFocusGained

    private void jPasswordField2_pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2_pass2FocusGained
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField2_pass2.getPassword());
        if(pass.trim().toLowerCase().equals("password")){
            jPasswordField2_pass2.setText("");
            jPasswordField2_pass2.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField2_pass2FocusGained

    private void jPasswordField2_pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2_pass2FocusLost
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField2_pass2.getPassword());
        if(pass.trim().equals("")||
            pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField2_pass2.setText("Password");
            jPasswordField2_pass2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField2_pass2FocusLost

    private void jPasswordField2_pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2_pass2ActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed

        // TODO add your handling code here:
        String fname = jTextField1_name.getText();
        String email = jTextField2_email.getText();
        String designation = jTextField3_designation.getText();
        String pass1 = String.valueOf(jPasswordField1_pass.getPassword());
        String pass2 = String.valueOf(jPasswordField2_pass2.getPassword());
        
        if(verifyFields())
        {
            if(!checkEmail(email))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery="INSERT INTO `user`(`name`, `email`, `Designation`, `password`) VALUES (?,?,?,?)";
            
                
        try{
        ps=dbConnection.con().prepareStatement(registerUserQuery);
        
        ps.setString(1, fname);
        ps.setString(2, email);
        ps.setString(3, designation);
        ps.setString(4, pass1 );
       // rs=st.executeQuery();
       
       if(ps.executeUpdate()!=0){
           JOptionPane.showMessageDialog(null,"Your Account has been Created");
            signin form= new signin();
            form.setVisible(true);
            form.pack();
            form.setLocationRelativeTo(null);
            //close the curret form/lsignin form
            this.dispose();
       } else{
           JOptionPane.showMessageDialog(null,"Error: Cheak your Information");
       }
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            }
        }
        
    }//GEN-LAST:event_signupbuttonActionPerformed

    private void haveaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveaccountMouseEntered

    }//GEN-LAST:event_haveaccountMouseEntered

    private void haveaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveaccountMouseExited

    }//GEN-LAST:event_haveaccountMouseExited

    private void haveaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveaccountMouseClicked
        // TODO add your handling code here:
        signin form= new signin();
            form.setVisible(true);
            form.pack();
            form.setLocationRelativeTo(null);
            //close the curret form/lsignin form
            this.dispose();
    }//GEN-LAST:event_haveaccountMouseClicked

    public boolean verifyFields(){
        String fname = jTextField1_name.getText();
        String email = jTextField2_email.getText();
        String designation = jTextField3_designation.getText();
        String pass1 = String.valueOf(jPasswordField1_pass.getPassword());
        String pass2 = String.valueOf(jPasswordField2_pass2.getPassword());
        
        
        if(fname.isEmpty()||email.isEmpty()||designation.isEmpty()||pass1.isEmpty()||pass2.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"One or More Fields are Empty","Empty Field",2);
            return false;
        }
        else if(!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null,"Password doesn't Match","Confirm Password",2);
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public boolean checkEmail(String email){
        PreparedStatement st;
        ResultSet rs;
        boolean email_exist= false;
        
        String query= "SELECT * FROM `user` WHERE `email`=?";
        
        
        try{
        st=dbConnection.con().prepareStatement(query);
        
        st.setString(1, email);
        rs=st.executeQuery();
        
        if(rs.next()){
            //show a new form 
            email_exist=true;
            JOptionPane.showMessageDialog(null,"This Email is already used","Enter another one",2);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
    
        return email_exist;
    } 
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel haveaccount;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1_pass;
    private javax.swing.JPasswordField jPasswordField2_pass2;
    private javax.swing.JTextField jTextField1_name;
    private javax.swing.JTextField jTextField2_email;
    private javax.swing.JTextField jTextField3_designation;
    private javax.swing.JButton signupbutton;
    // End of variables declaration//GEN-END:variables
}
