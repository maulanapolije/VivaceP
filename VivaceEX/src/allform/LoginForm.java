/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allform;

import static allform.Dashboard.idkaryawanfield;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static allform.Dashboard.userinfo;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Maulana Akbar
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm2
     */
    public LoginForm() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon icon = new ImageIcon("src/icon/favicon-32x32.png");
        setIconImage(icon.getImage());
        setExtendedState(MAXIMIZED_BOTH);
        LP.setVisible(false);
        hakakses.setVisible(false);
        eyehide.setVisible(false);
        pass.setEchoChar('•');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LP = new javax.swing.JPanel();
        lpbtn = new javax.swing.JPanel();
        bgLP = new javax.swing.JLabel();
        LOGIN = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        lupapaswordbtn = new javax.swing.JPanel();
        loginbtn = new javax.swing.JPanel();
        eyeshow = new javax.swing.JLabel();
        eyehide = new javax.swing.JLabel();
        bgLogin = new javax.swing.JLabel();
        hakakses = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vivace Music Application");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LP.setOpaque(false);
        LP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lpbtn.setOpaque(false);
        lpbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lpbtnLayout = new javax.swing.GroupLayout(lpbtn);
        lpbtn.setLayout(lpbtnLayout);
        lpbtnLayout.setHorizontalGroup(
            lpbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        lpbtnLayout.setVerticalGroup(
            lpbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        LP.add(lpbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 200, 60));

        bgLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LP1.png"))); // NOI18N
        LP.add(bgLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 900, 530));

        getContentPane().add(LP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LOGIN.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, 760, 40));

        pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LOGIN.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 710, 40));

        lupapaswordbtn.setOpaque(false);
        lupapaswordbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupapaswordbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lupapaswordbtnLayout = new javax.swing.GroupLayout(lupapaswordbtn);
        lupapaswordbtn.setLayout(lupapaswordbtnLayout);
        lupapaswordbtnLayout.setHorizontalGroup(
            lupapaswordbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        lupapaswordbtnLayout.setVerticalGroup(
            lupapaswordbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        LOGIN.add(lupapaswordbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 590, 190, 30));

        loginbtn.setOpaque(false);
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginbtnLayout = new javax.swing.GroupLayout(loginbtn);
        loginbtn.setLayout(loginbtnLayout);
        loginbtnLayout.setHorizontalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        loginbtnLayout.setVerticalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        LOGIN.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 640, 220, 90));

        eyeshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-eye-30.png"))); // NOI18N
        eyeshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeshowMouseClicked(evt);
            }
        });
        LOGIN.add(eyeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 540, 30, 40));

        eyehide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-hide-30.png"))); // NOI18N
        eyehide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyehideMouseClicked(evt);
            }
        });
        LOGIN.add(eyehide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 540, 30, 40));

        bgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LF.png"))); // NOI18N
        LOGIN.add(bgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1010));
        LOGIN.add(hakakses, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 400, 220, -1));

        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eyeshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeshowMouseClicked
        pass.setEchoChar((char)0);
        pass.setFont(new java.awt.Font("Segoe UI Bold", 2, 18));
        eyeshow.setVisible(false);
        eyehide.setVisible(true);
    }//GEN-LAST:event_eyeshowMouseClicked

    private void eyehideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyehideMouseClicked
        pass.setEchoChar('•');
        eyeshow.setVisible(true);
        eyehide.setVisible(false);
    }//GEN-LAST:event_eyehideMouseClicked

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        try {
        String sql1 = "SELECT * FROM user WHERE idkaryawan='"+user.getText()+"'AND password='"+pass.getText()+"'";
        java.sql.Connection conn = (Connection)Config.configDB();
        java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
        java.sql.ResultSet rs1 = pst1.executeQuery(sql1);
        if (rs1.next()){
                if (user.getText().equals(rs1.getString("idkaryawan"))&& pass.getText().equals(rs1.getString("password"))){
                hakakses.setText(rs1.getString(4));
                    if (hakakses.getText().equals("Pemilik")){
                        this.setVisible(false);
                        new Dashboard().setVisible(true);
                    } if (hakakses.getText().equals("Administrator")){
                        this.setVisible(false);
                        new Dashboard().setVisible(true);
                    } if (hakakses.getText().equals("Karyawan")){
                        this.setVisible(false);
                        new Dashboard().setVisible(true);
                    }
                userinfo.setText("     Hai, "+rs1.getString(2));
                idkaryawanfield.setText(rs1.getString(1));
        }
        
        } else {
            JOptionPane.showMessageDialog(null, "Username atau Password salah!\nHarap Cek Kembali\n "); 
        }
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_loginbtnMouseClicked

    private void lupapaswordbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupapaswordbtnMouseClicked
    LOGIN.setVisible(false);
    LP.setVisible(true);
    }//GEN-LAST:event_lupapaswordbtnMouseClicked

    private void lpbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpbtnMouseClicked
    LOGIN.setVisible(true);
    LP.setVisible(false);
    }//GEN-LAST:event_lpbtnMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LOGIN;
    private javax.swing.JPanel LP;
    private javax.swing.JLabel bgLP;
    private javax.swing.JLabel bgLogin;
    private javax.swing.JLabel eyehide;
    private javax.swing.JLabel eyeshow;
    private javax.swing.JTextField hakakses;
    private javax.swing.JPanel loginbtn;
    private javax.swing.JPanel lpbtn;
    private javax.swing.JPanel lupapaswordbtn;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
