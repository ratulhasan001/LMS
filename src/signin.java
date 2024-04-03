import java.sql.*;
import java.awt.*;
import javax.swing.*;

public class signin extends javax.swing.JFrame {
    Connection con=null;

 
    public signin() {
        initComponents();
        con=dbConnection.con();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_pass = new javax.swing.JLabel();
        jTextField1_email = new javax.swing.JTextField();
        jPasswordField1_pass = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jButton1_login1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN IN");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jTextField1_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1_email.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1_email.setText("Email");
        jTextField1_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_emailFocusLost(evt);
            }
        });
        jTextField1_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_emailActionPerformed(evt);
            }
        });

        jPasswordField1_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        jButton_login.setBackground(new java.awt.Color(204, 204, 204));
        jButton_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Sign In");
        jButton_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jButton1_login1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1_login1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1_login1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_login1.setText("Register");
        jButton1_login1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_login1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jTextField1_email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        //set icon to the jlebel
        jLabel_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images.png")));
        jLabel_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pass.png")));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("System");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Management");

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Library");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(67, 67, 67))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_emailActionPerformed

    private void jTextField1_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_emailFocusGained
        // TODO add your handling code here:
        if(jTextField1_email.getText().trim().toLowerCase().equals("email")){
            jTextField1_email.setText("");
            jTextField1_email.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1_emailFocusGained

    private void jPasswordField1_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1_passActionPerformed

    private void jTextField1_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_emailFocusLost
        if(jTextField1_email.getText().trim().equals("")|| 
                jTextField1_email.getText().trim().toLowerCase().equals("Email"))
        {
            jTextField1_email.setText("Email");
            jTextField1_email.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1_emailFocusLost

    private void jPasswordField1_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1_passFocusGained
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField1_pass.getPassword());
        if(pass.trim().toLowerCase().equals("password")){
            jPasswordField1_pass.setText("");
            jPasswordField1_pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField1_passFocusGained

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

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs; 
        
        // get the email and password
        String email = jTextField1_email.getText();
        String password = String.valueOf(jPasswordField1_pass.getPassword());
        
        String query= "SELECT * FROM `user` WHERE `email`= ? AND`password`=?";
        
        try{
        st=dbConnection.con().prepareStatement(query);
        
        st.setString(1, email);
        st.setString(2, password);
        rs=st.executeQuery();
        
        if(rs.next()){
            //show a new form 
            mainmenu form= new mainmenu();
            form.setVisible(true);
            form.pack();
            form.setLocationRelativeTo(null);
            //close the curret form/lsignin form
            this.dispose();
        }else{
            //error massage
            JOptionPane.showMessageDialog(null,"Invalid Email / Password","Login Error",2);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton1_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_login1ActionPerformed
        // TODO add your handling code here:
        registration form= new registration();
            form.setVisible(true);
            form.pack();
            form.setLocationRelativeTo(null);
            //close the curret form/lsignin form
            this.dispose();
    }//GEN-LAST:event_jButton1_login1ActionPerformed

    

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_login1;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1_pass;
    private javax.swing.JTextField jTextField1_email;
    // End of variables declaration//GEN-END:variables
}
