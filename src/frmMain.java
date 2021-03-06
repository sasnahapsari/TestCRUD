
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 580, 40);

        jLabel9.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("The Real Informatic Schools");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 60, 250, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 730, 110);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("ISIAN DATA SISWA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 0, 210, 30);

        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("NIS");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 40, 80, 20);
        jPanel3.add(txtNIS);
        txtNIS.setBounds(10, 60, 210, 30);

        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Nama");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 94, 60, 20);
        jPanel3.add(txtNama);
        txtNama.setBounds(10, 120, 210, 30);

        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Jenis Kelamin");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 160, 120, 20);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki-Laki");
        jPanel3.add(rdLaki);
        rdLaki.setBounds(10, 190, 65, 23);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        jPanel3.add(rdPerempuan);
        rdPerempuan.setBounds(110, 190, 79, 23);

        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Kelas");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 220, 70, 20);
        jPanel3.add(txtKelas);
        txtKelas.setBounds(10, 240, 200, 30);

        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Email");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 270, 120, 30);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(10, 300, 200, 30);
        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 350, 2, 2);

        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Alamat");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 340, 90, 20);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 250, 20);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 360, 220, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 120, 250, 460);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(17, 10, 60, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(100, 10, 63, 23);

        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset);
        Reset.setBounds(190, 10, 70, 23);

        btnRefresh.setText("Refres");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefresh);
        btnRefresh.setBounds(285, 10, 70, 23);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit);
        btnEdit.setBounds(380, 10, 73, 23);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 120, 470, 50);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(null);

        tblData.setBackground(new java.awt.Color(153, 255, 204));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(3).setResizable(false);
            tblData.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 450, 360);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(260, 180, 470, 400);

        setBounds(0, 0, 746, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) " + "VALUES('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"'," + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while (rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString (2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3))) {
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString (5);
                String Alamat = rs.getString(6);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        } catch (SQLException e) {
            Object ex = null;
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
                }
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
               // TODO add your handling code here:
               String JenisKelamin ="";
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this,"Harap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
        } else{
            if (rdLaki.isSelected()) {
                JenisKelamin = "L";
            } else{
                JenisKelamin = "P";
            }
        }
        
        String SQL = "UPDATE t_siswa SET "
                + "NamaSiswa='"+txtNama.getText()+"',"
                + "Kelas='"+txtKelas.getText()+"',"
                + "JenisKelamin='"+JenisKelamin+"',"
                + "Email='"+txtEmail.getText()+"',"
                + "Alamat='"+txtAlamat.getText()+"',"
                + "WHERE NIS='"+txtNIS.getText()+"',";
        int status = KoneksiDB.execute(SQL);
        if (status == 0) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Update","Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText(tblData.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(tblData.getValueAt(baris, 2).toString())) {
                rdLaki.setSelected(true);
        } else {
            rdPerempuan.setSelected(true);
        }
        txtKelas.setText(tblData.getValueAt(baris, 3).toString());
        txtEmail.setText(tblData.getValueAt(baris, 4).toString());
        txtAlamat.setText(tblData.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_tblDataMouseClicked
    }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    /**
     *
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
