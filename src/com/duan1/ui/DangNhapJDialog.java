/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.ui;

import com.duan1.DAO.NguoiDungDAO;
import com.duan1.entity.NguoiDung;
import com.duan1.helper.Auth;
import com.duan1.helper.ImageHelper;
import com.duan1.helper.MsgBox;
import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class DangNhapJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangNhapJDialog
     */
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        init();
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btonLogin = new javax.swing.JButton();
        btonExit = new javax.swing.JButton();
        lblForgot = new javax.swing.JLabel();
        lblQR = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Librarian");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/boos.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUser.setText("BaoBD");
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 380, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtPass.setText("songlong");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 380, 40));

        btonLogin.setBackground(new java.awt.Color(255, 255, 255));
        btonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/icons8-login-50.png"))); // NOI18N
        btonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btonExit.setBackground(new java.awt.Color(255, 255, 255));
        btonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/icons8-power-off-button-50.png"))); // NOI18N
        btonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonExitActionPerformed(evt);
            }
        });
        jPanel2.add(btonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblForgot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblForgot.setForeground(new java.awt.Color(255, 153, 153));
        lblForgot.setText("Forgot PassWord ?");
        lblForgot.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblForgotMouseMoved(evt);
            }
        });
        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotMousePressed(evt);
            }
        });
        jPanel2.add(lblForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/qr_code_500px.png"))); // NOI18N
        lblQR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblQRMouseMoved(evt);
            }
        });
        lblQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQRMouseClicked(evt);
            }
        });
        jPanel2.add(lblQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Or Login With");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLoginActionPerformed
        // TODO add your handling code here:
        this.dangNhap();
    }//GEN-LAST:event_btonLoginActionPerformed

    private void btonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonExitActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_btonExitActionPerformed

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblForgotMouseClicked

    private void lblQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQRMouseClicked
        // TODO add your handling code here:
        
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        QRJDialog open = new QRJDialog(frame, true);
        open.setLocationRelativeTo(null);
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQRMouseClicked

    private void lblQRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQRMouseMoved
        // TODO add your handling code here:
        lblQR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblQRMouseMoved

    private void lblForgotMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseMoved
        // TODO add your handling code here:
        lblForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblForgotMouseMoved

    private void lblForgotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMousePressed
        // TODO add your handling code here:
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        QuenMatKhauJDiaglog open = new QuenMatKhauJDiaglog(frame, true);
        open.setLocationRelativeTo(null);
        open.setVisible(true);
    }//GEN-LAST:event_lblForgotMousePressed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonExit;
    private javax.swing.JButton btonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblQR;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    NguoiDungDAO dao = new NguoiDungDAO();

    void init() {
        this.setIconImage(ImageHelper.getAppIcon());
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn thoát khỏi ứng dụng ?")) {
            System.exit(0);
        }
    }

    void dangNhap() {
        String mand = txtUser.getText();
        String matKhau = new String(txtPass.getPassword());
        NguoiDung nguoiDung = dao.selectByID(mand);
        if (nguoiDung == null) {
            MsgBox.alert(this, "Sai tên đăng nhập !");
        } else if (!matKhau.equals(nguoiDung.getPassword())) {
            MsgBox.alert(this, "Sai mật khẩu !");
        } else {
            Auth.user = nguoiDung;
            MsgBox.alert(this, "Đăng nhập thành công !");
            this.dispose();
        }

    }
}
