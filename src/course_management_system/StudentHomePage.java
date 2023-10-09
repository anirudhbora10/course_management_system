/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management_system;


import java.sql.*;
import javax.swing.JOptionPane;


public class StudentHomePage extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;

    public StudentHomePage() {
        initComponents();
        conn = db.database_db();
        getSubject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_comment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Load = new javax.swing.JButton();
        txt_mark = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_subject = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        LOGOUT_BUTTON = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 5));

        txt_comment.setEditable(false);
        txt_comment.setBackground(new java.awt.Color(255, 255, 255));
        txt_comment.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        txt_comment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_commentActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel4.setText("COMMENT : ");

        Load.setBackground(new java.awt.Color(153, 0, 153));
        Load.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        Load.setForeground(new java.awt.Color(255, 255, 255));
        Load.setText("LOAD MY RESULT");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        txt_mark.setEditable(false);
        txt_mark.setBackground(new java.awt.Color(255, 255, 255));
        txt_mark.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        txt_mark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel3.setText("MARK : ");

        txt_subject.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        txt_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject..." }));
        txt_subject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_subject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_subjectKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel2.setText("SUBJECT :");

        LOGOUT_BUTTON.setBackground(new java.awt.Color(153, 0, 153));
        LOGOUT_BUTTON.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        LOGOUT_BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT_BUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFolder/logout.png"))); // NOI18N
        LOGOUT_BUTTON.setText("LOGOUT");
        LOGOUT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUT_BUTTONActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_id.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel5.setText("ID");

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel1.setText("USER NAME");

        txt_name.setEditable(false);
        txt_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_name.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("STUDENT HOME PAGE");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFolder/1a.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 441, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Load)
                        .addGap(411, 411, 411))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(LOGOUT_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_mark, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LOGOUT_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mark, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
     void getSubject() {
        try {

            String sql = "Select *from Course_Table ";

            pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                String sub = rs.getString("course_name");

                txt_subject.addItem(sub);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load subjects  " + e.getMessage());
        }
    }
    
    
    
    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed

        conn = db.database_db();
        try {
            String sql = "SELECT *FROM Marks_Table where id = '" + txt_id.getText() + "' and subject ='" + txt_subject.getSelectedItem().toString() + "'";

            pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
     
            if (rs.isBeforeFirst()) {
                rs.next();
                txt_mark.setText(rs.getString(3));
                txt_comment.setText(rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null, "Mark Record not found please contact your "+txt_subject.getSelectedItem()+ " Instructor");
                 txt_mark.setText(null);
                 txt_comment.setText(null);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Search failed  " + e.getMessage());
        }


    }//GEN-LAST:event_LoadActionPerformed

    private void txt_subjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_subjectKeyPressed
              
    }//GEN-LAST:event_txt_subjectKeyPressed

    private void LOGOUT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUT_BUTTONActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, txt_name.getText().toUpperCase()+" Are you sure you want to LogOut?", "LogOut", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
       this.dispose();
       
       StudentLogIn StudentLogIn = new StudentLogIn();
       StudentLogIn.setVisible(true);
        }
    }//GEN-LAST:event_LOGOUT_BUTTONActionPerformed

    private void txt_commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_commentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_commentActionPerformed
 /*if (rs.isBeforeFirst()) {
                rs.next();

                if (rs.getString(3).equals("")) {
                    JOptionPane.showMessageDialog(this, "You don't have any marks please contact your instructor");
                    txt_mark.setText(null);
                }
            }
           else if (rs.isBeforeFirst()) {
                rs.next();
                if (rs.getString(4).equals("")) {
                    JOptionPane.showMessageDialog(this, "You don't have any comments please contact your instructor");
                    txt_comment.setText(null);
                }
            }
            if (rs.isBeforeFirst()) {
                rs.next();
                if (rs.getString(3).equals("") && rs.getString(4).equals("")) {
                    JOptionPane.showMessageDialog(this, " please contact your instructor to get your marks and comment");
                    txt_mark.setText(null);
                    txt_comment.setText(null);
                }
            }
            */
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
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGOUT_BUTTON;
    private javax.swing.JButton Load;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_comment;
    public static javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_mark;
    public static javax.swing.JTextField txt_name;
    private javax.swing.JComboBox<String> txt_subject;
    // End of variables declaration//GEN-END:variables
}
