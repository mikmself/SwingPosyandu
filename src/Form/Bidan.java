package Form;
import Form.Master.Menu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posyandu.CRUD;

public class Bidan extends javax.swing.JFrame {
    CRUD bidan = new CRUD();
    String status = "";
    public Bidan() {
        initComponents();
        bidan.koneksi();
        TampilBidan();
    }
    public void TampilBidan(){
        String namaTable = "bidan";
        String daftarField[]  = {
            "id_bidan",
            "nama_bidan",
            "tanggal_lahir",
            "alamat",
            "jenis_kelamin",            
            "no_telp"
        };
        String judulKolom[] = {
            "ID",            
            "Nama",
            "Tanggal",
            "Alamat",
            "Jenis Kelamin",            
            "No Telephone"
        };
        tableBidan.setModel(bidan.TampilData(namaTable, daftarField, judulKolom));
    }
    public void TableBidanClick() {
        DefaultTableModel tabelModel = (DefaultTableModel) tableBidan.getModel();
        int indexTerpilih = tableBidan.getSelectedRow();
        if (indexTerpilih == -1) {
            return;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat.parse(tabelModel.getValueAt(indexTerpilih, 2).toString());
            txtId.setText(tabelModel.getValueAt(indexTerpilih, 0).toString());
            txtNama.setText(tabelModel.getValueAt(indexTerpilih, 1).toString());
            txtTanggal.setDate(parsedDate);
            txtAlamat.setText(tabelModel.getValueAt(indexTerpilih, 3).toString());
            txtKelamin.setText(tabelModel.getValueAt(indexTerpilih, 4).toString());        
            txtTelephone.setText(tabelModel.getValueAt(indexTerpilih, 5).toString());
        } catch (ParseException e) {
            e.printStackTrace(); 
        }
    }

    public void TambahBidan() {
        Date selectedDate = txtTanggal.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        status = bidan.tambah("bidan", "id_bidan,nama_bidan,tanggal_lahir,alamat,jenis_kelamin,no_telp", 
            "'" + txtId.getText() + "',"+
            "'" + txtNama.getText() + "',"+
            "'" + formattedDate + "',"+
            "'" + txtAlamat.getText() + "'," +              
            "'" + txtKelamin.getText() + "'," + 
            "'" + txtTelephone.getText() + "'"
        );
        JOptionPane.showMessageDialog(null, status);
        TampilBidan();
        kosongkan();
    }
    public void EditBidan(){
        Date selectedDate = txtTanggal.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        status = bidan.ubah("bidan", 
                "id_bidan = '" + txtId.getText() + "'," + 
                "nama_bidan = '" + txtNama.getText() + "'," + 
                "tanggal_lahir = '" + formattedDate + "'," + 
                "alamat = '" + txtAlamat.getText() + "'," +                                
                "jenis_kelamin = '" + txtKelamin.getText() + "'," +                
                "no_telp = '" + txtTelephone.getText() + "'"     
        , "id_bidan=" + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilBidan();
        kosongkan();
    }
    public void HapusBidan(){
        status = bidan.hapus("bidan", " id_bidan= " + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilBidan();
        kosongkan();
    }
    public void kosongkan(){
        txtId.setText("");
        txtNama.setText("");
        txtTanggal.setDate(new java.util.Date());
        txtAlamat.setText("");        
        txtKelamin.setText("");        
        txtTelephone.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        labelKelamin = new javax.swing.JLabel();
        txtKelamin = new javax.swing.JTextField();
        labelTelephone = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKosongkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBidan = new javax.swing.JTable();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        txtTelephone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(1200, 600));

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        labelNama.setText("Nama");

        labelTanggal.setText("Tanggal Lahir");

        labelAlamat.setText("Alamat");

        labelKelamin.setText("Jenis Kelamin");

        labelTelephone.setText("Telephone");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKosongkan.setText("Kosongkan");
        btnKosongkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKosongkanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("DATA BIDAN");

        tableBidan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBidan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBidanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBidan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKosongkan))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKelamin)
                                    .addComponent(labelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTanggal)
                                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKelamin)
                            .addComponent(txtKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus)
                            .addComponent(btnKosongkan)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKosongkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKosongkanActionPerformed
        kosongkan();
    }//GEN-LAST:event_btnKosongkanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahBidan();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditBidan();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusBidan();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableBidanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBidanMouseClicked
        TableBidanClick();
    }//GEN-LAST:event_tableBidanMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bidan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKosongkan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelKelamin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JTable tableBidan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKelamin;
    private javax.swing.JTextField txtNama;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
