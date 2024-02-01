package Form;
import Form.Master.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posyandu.CRUD;

public class Kader extends javax.swing.JFrame {
    CRUD kader = new CRUD();
    String status = "";
    public Kader() {
        initComponents();
        kader.koneksi();
        TampilKader();
    }
    public void TampilKader(){
        String namaTable = "kader";
        String daftarField[]  = {
            "id_kader",
            "nama_kader",
            "tempat",
            "jenis_kelamin",
            "alamat",            
            "no_telp"
        };
        String judulKolom[] = {
            "ID",            
            "Nama",
            "Tempat",
            "Jenis Kelamin",
            "Alamat",
            "No Telephone"
        };
        tableKader.setModel(kader.TampilData(namaTable, daftarField, judulKolom));
    }
    public void TableKaderClick(){
        DefaultTableModel tabelModel = (DefaultTableModel) tableKader.getModel();
        int indexTerpilih =  tableKader.getSelectedRow();
        txtId.setText(tabelModel.getValueAt(indexTerpilih, 0).toString());
        txtNama.setText(tabelModel.getValueAt(indexTerpilih, 1).toString());
        txtTempat.setText(tabelModel.getValueAt(indexTerpilih, 2).toString());
        txtKelamin.setText(tabelModel.getValueAt(indexTerpilih, 3).toString());
        txtAlamat.setText(tabelModel.getValueAt(indexTerpilih, 4).toString());        
        txtTelephone.setText(tabelModel.getValueAt(indexTerpilih, 5).toString());
    }
    public void TambahKader() {
        status = kader.tambah("kader", "id_kader,nama_kader,tempat,jenis_kelamin,alamat,no_telp", 
            "'" + txtId.getText() + "',"+
            "'" + txtNama.getText() + "',"+
            "'" + txtTempat.getText() + "',"+
            "'" + txtKelamin.getText() + "'," +              
            "'" + txtAlamat.getText() + "'," + 
            "'" + txtTelephone.getText() + "'"
        );
        JOptionPane.showMessageDialog(null, status);
        TampilKader();
        kosongkan();
    }
    public void EditKader(){
        status = kader.ubah("kader", 
                "id_kader = '" + txtId.getText() + "'," + 
                "nama_kader = '" + txtNama.getText() + "'," + 
                "tempat = '" + txtTempat.getText() + "'," + 
                "jenis_kelamin = '" + txtKelamin.getText() + "'," +                                
                "alamat = '" + txtAlamat.getText() + "'," +                
                "no_telp = '" + txtTelephone.getText() + "'"                
        , "id_kader=" + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilKader();
        kosongkan();
    }
    public void HapusKader(){
        status = kader.hapus("kader", " id_kader= " + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilKader();
        kosongkan();
    }
    public void kosongkan(){
        txtId.setText("");
        txtNama.setText("");
        txtTempat.setText("");
        txtKelamin.setText("");        
        txtAlamat.setText("");        
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
        txtTempat = new javax.swing.JTextField();
        labelTempat = new javax.swing.JLabel();
        labelKelamin = new javax.swing.JLabel();
        txtKelamin = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKosongkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKader = new javax.swing.JTable();
        txtTelephone = new javax.swing.JTextField();
        labelTelephone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 600));

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        labelNama.setText("Nama ");

        labelTempat.setText("Tempat");

        labelKelamin.setText("Jenis Kelamin");

        labelAlamat.setText("Alamat");

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
        jLabel9.setText("DATA KADER");

        tableKader.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKaderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKader);

        labelTelephone.setText("Telephone");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelTempat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelKelamin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                    .addComponent(txtKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelAlamat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelTelephone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKosongkan)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTempat)
                            .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKelamin)
                            .addComponent(txtKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelephone)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus)
                            .addComponent(btnKosongkan)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
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
        TambahKader();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditKader();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusKader();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableKaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKaderMouseClicked
        TableKaderClick();
    }//GEN-LAST:event_tableKaderMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kader().setVisible(true);
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
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelTempat;
    private javax.swing.JTable tableKader;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKelamin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables
}
