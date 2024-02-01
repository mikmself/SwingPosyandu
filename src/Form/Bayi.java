package Form;
import Form.Master.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posyandu.CRUD;

public class Bayi extends javax.swing.JFrame {
    CRUD bayi = new CRUD();
    String status = "";
    public Bayi() {
        initComponents();
        bayi.koneksi();
        TampilBayi();
    }
    public void TampilBayi(){
        String namaTable = "bayi";
        String daftarField[]  = {
            "id_bayi",
            "nama_bayi",
            "nama_ayah",
            "nama_ibu",
            "tempat_lahir",            
            "jenis_kelamin",
            "anak_ke",
            "alamat"
        };
        String judulKolom[] = {
            "ID",            
            "Nama Bayi",
            "Nama Ayah",
            "Nama Ibu",
            "Tempat Lahir",
            "Jenis Kelamin",            
            "Anak Ke",
            "Alamat"
        };
        tableBayi.setModel(bayi.TampilData(namaTable, daftarField, judulKolom));
    }
    public void TableBayiClick(){
        DefaultTableModel tabelModel = (DefaultTableModel) tableBayi.getModel();
        int indexTerpilih =  tableBayi.getSelectedRow();
        txtId.setText(tabelModel.getValueAt(indexTerpilih, 0).toString());
        txtNama.setText(tabelModel.getValueAt(indexTerpilih, 1).toString());
        txtAyah.setText(tabelModel.getValueAt(indexTerpilih, 2).toString());
        txtIbu.setText(tabelModel.getValueAt(indexTerpilih, 3).toString());
        txtTempat.setText(tabelModel.getValueAt(indexTerpilih, 4).toString());        
        txtKelamin.setText(tabelModel.getValueAt(indexTerpilih, 5).toString());
        txtUrutan.setText(tabelModel.getValueAt(indexTerpilih, 6).toString());
        txtAlamat.setText(tabelModel.getValueAt(indexTerpilih, 7).toString());
    }
    public void TambahBayi() {
        status = bayi.tambah("bayi", "id_bayi,nama_bayi,nama_ayah,nama_ibu,tempat_lahir,jenis_kelamin,anak_ke,alamat", 
            "'" + txtId.getText() + "',"+
            "'" + txtNama.getText() + "',"+
            "'" + txtAyah.getText() + "',"+
            "'" + txtIbu.getText() + "'," +              
            "'" + txtTempat.getText() + "'," + 
            "'" + txtKelamin.getText() + "'," + 
            "'" + txtUrutan.getText() + "'," + 
            "'" + txtAlamat.getText() + "'"
        );
        JOptionPane.showMessageDialog(null, status);
        TampilBayi();
        kosongkan();
    }
    public void EditBayi(){
        status = bayi.ubah("bayi", 
                "id_bayi = '" + txtId.getText() + "'," + 
                "nama_bayi = '" + txtNama.getText() + "'," + 
                "nama_ayah = '" + txtAyah.getText() + "'," + 
                "nama_ibu = '" + txtIbu.getText() + "'," +                                
                "tempat_lahir = '" + txtTempat.getText() + "'," +                
                "jenis_kelamin = '" + txtKelamin.getText() + "'," +                
                "anak_ke = '" + txtUrutan.getText() + "'," +                               
                "alamat = '" + txtAlamat.getText() + "'"          
        , "id_bayi=" + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilBayi();
        kosongkan();
    }
    public void HapusBayi(){
        status = bayi.hapus("bayi", " id_bayi= " + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilBayi();
        kosongkan();
    }
    public void kosongkan(){
        txtId.setText("");
        txtNama.setText("");
        txtAyah.setText("");
        txtIbu.setText("");        
        txtTempat.setText("");        
        txtKelamin.setText("");
        txtUrutan.setText("");
        txtAlamat.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        txtAyah = new javax.swing.JTextField();
        labelAyah = new javax.swing.JLabel();
        labelIbu = new javax.swing.JLabel();
        txtIbu = new javax.swing.JTextField();
        labelTempat = new javax.swing.JLabel();
        txtTempat = new javax.swing.JTextField();
        txtKelamin = new javax.swing.JTextField();
        labelKelamin = new javax.swing.JLabel();
        labelUrutan = new javax.swing.JLabel();
        txtUrutan = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKosongkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBayi = new javax.swing.JTable();

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

        labelNama.setText("Nama Bayi");

        labelAyah.setText("Nama Ayah");

        labelIbu.setText("Nama Ibu");

        labelTempat.setText("Tempat lahir");

        labelKelamin.setText("Jenis Kelamin");

        labelUrutan.setText("Anak Ke");

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
        jLabel9.setText("DATA BAYI");

        tableBayi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBayiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBayi);

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
                                    .addComponent(labelAyah)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelIbu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelTempat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelAlamat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelUrutan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUrutan, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelKelamin)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKosongkan)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)))
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
                            .addComponent(labelAyah)
                            .addComponent(txtAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIbu)
                            .addComponent(txtIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(labelUrutan)
                            .addComponent(txtUrutan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
        TambahBayi();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditBayi();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusBayi();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBayiMouseClicked
        TableBayiClick();
    }//GEN-LAST:event_tableBayiMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bayi().setVisible(true);
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
    private javax.swing.JLabel labelAyah;
    private javax.swing.JLabel labelIbu;
    private javax.swing.JLabel labelKelamin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTempat;
    private javax.swing.JLabel labelUrutan;
    private javax.swing.JTable tableBayi;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAyah;
    private javax.swing.JTextField txtIbu;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKelamin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempat;
    private javax.swing.JTextField txtUrutan;
    // End of variables declaration//GEN-END:variables
}
