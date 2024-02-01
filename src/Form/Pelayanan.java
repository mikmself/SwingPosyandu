package Form;
import Form.Master.Menu;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posyandu.CRUD;

public class Pelayanan extends javax.swing.JFrame {
    CRUD pelayanan = new CRUD();
    String status = "";
    public Pelayanan() {
        initComponents();
        pelayanan.koneksi();
        TampilBayi();
    }
    public void TampilBayi(){
        String namaTable = "pelayanan_bayi";
        String daftarField[]  = {
            "id_pelayanan",
            "id_bayi",
            "id_kader",
            "id_bidan",
            "tanggal_pelayanan",            
            "berat_bayi",
            "tinggi_bayi",
            "jenis_imunisasi",
            "jenis_vitamin"
        };
        String judulKolom[] = {
            "ID",            
            "ID Bayi",
            "ID Kader",
            "ID Bidan",
            "Tanggal Pelayanan",
            "Berat Bayi",            
            "Tinggi Bayi",
            "Jenis Imunisasi",
            "Jenis Vitamin"
        };
        tablePelayanan.setModel(pelayanan.TampilData(namaTable, daftarField, judulKolom));
    }
    public void TambahBayi() {
        Date selectedDate = txtTanggal.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(selectedDate);
        String idBayi = "1";
        String idKader = "1";
        String idBidan = "1";
        
//        Bayi
        try {
            String namaBayi = txtBayi.getSelectedItem().toString();
            Bayi_1 bayi = Bayi_1.findByNamaBayi(namaBayi);
            if (bayi != null) {
                idBayi = bayi.getIdBayi();
            } else {
                idBayi = "1";
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
            return;
        }
//        Kader
        try {
            String namaKader = txtKader.getSelectedItem().toString();
            Kader_1 kader = Kader_1.findByNamaKader(namaKader);
            if (kader != null) {
                idKader = kader.getIdKader();
            } else {
                idKader = "1";
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
            return;
        }
//        Bidan
        try {
            String namaBidan = txtBidan.getSelectedItem().toString();
            Bidan_1 bidan = Bidan_1.findByNamaBidan(namaBidan);
            if (bidan != null) {
                idBidan = bidan.getIdBidan();
            } else {
                idBidan = "1";
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
            return;
        }
        
        status = pelayanan.tambah("pelayanan_bayi", "id_pelayanan,id_bayi,id_kader,id_bidan,tanggal_pelayanan,berat_bayi,tinggi_bayi,jenis_imunisasi,jenis_vitamin", 
            "'" + txtId.getText() + "',"+
            "'" + idBayi + "',"+
            "'" + idKader + "',"+
            "'" + idBidan + "'," +              
            "'" + formattedDate + "'," + 
            "'" + txtBerat.getText() + "'," + 
            "'" + txtTinggi.getText() + "'," + 
            "'" + txtImunisasi.getText() + "',"+
            "'" + txtVitamin.getText() + "'"
        );
        JOptionPane.showMessageDialog(null, status);
        TampilBayi();
        kosongkan();
    }
    public void HapusBayi(){
        status = pelayanan.hapus("pelayanan_bayi", " id_pelayanan= " + txtId.getText());
        JOptionPane.showMessageDialog(null, status);
        TampilBayi();
        kosongkan();
    }
    public void kosongkan(){
        txtId.setText("");
        txtTanggal.setDate(new java.util.Date());       
        txtBerat.setText("");
        txtTinggi.setText("");
        txtImunisasi.setText("");        
        txtVitamin.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("posyandu?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bayi_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bayi_1 b");
        bayi_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bayi_1Query.getResultList();
        kader_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT k FROM Kader_1 k");
        kader_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kader_1Query.getResultList();
        bidan_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bidan_1 b");
        bidan_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bidan_1Query.getResultList();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelBayi = new javax.swing.JLabel();
        labelKader = new javax.swing.JLabel();
        labelBidan = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        labelBerat = new javax.swing.JLabel();
        labelTinggi = new javax.swing.JLabel();
        txtTinggi = new javax.swing.JTextField();
        labelImunisasi = new javax.swing.JLabel();
        txtImunisasi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKosongkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePelayanan = new javax.swing.JTable();
        txtVitamin = new javax.swing.JTextField();
        labelVitamin = new javax.swing.JLabel();
        txtBayi = new javax.swing.JComboBox<>();
        txtKader = new javax.swing.JComboBox<>();
        txtBidan = new javax.swing.JComboBox<>();
        txtTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 600));

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        labelBayi.setText("Bayi");

        labelKader.setText("Kader");

        labelBidan.setText("Bidan");

        labelTanggal.setText("Tanggal Pelayanan");

        labelBerat.setText("Berat Bayi");

        labelTinggi.setText("Tinggi Bayi");

        labelImunisasi.setText("Jenis Imunisasi");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
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
        jLabel9.setText("DATA Pelayanan");

        tablePelayanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePelayanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePelayananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePelayanan);

        labelVitamin.setText("Jenis Vitamin");

        txtBayi.setPreferredSize(new java.awt.Dimension(56, 33));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bayi_1List, txtBayi);
        bindingGroup.addBinding(jComboBoxBinding);

        txtKader.setPreferredSize(new java.awt.Dimension(56, 33));

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, kader_1List, txtKader);
        bindingGroup.addBinding(jComboBoxBinding);

        txtBidan.setPreferredSize(new java.awt.Dimension(56, 33));

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bidan_1List, txtBidan);
        bindingGroup.addBinding(jComboBoxBinding);

        txtTanggal.setPreferredSize(new java.awt.Dimension(91, 33));

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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelImunisasi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(txtImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelTinggi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelBerat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelBayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelKader)
                                    .addComponent(labelBidan)
                                    .addComponent(labelTanggal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(txtBayi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKader, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBidan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelVitamin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtVitamin, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKosongkan)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)))
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
                            .addComponent(labelBayi)
                            .addComponent(txtBayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKader))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBidan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBidan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBerat)
                            .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTinggi)
                            .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelImunisasi)
                            .addComponent(txtImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVitamin)
                            .addComponent(txtVitamin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnHapus)
                            .addComponent(btnKosongkan)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        bindingGroup.bind();

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

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusBayi();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tablePelayananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePelayananMouseClicked
        DefaultTableModel tabelModel = (DefaultTableModel) tablePelayanan.getModel();
        int indexTerpilih =  tablePelayanan.getSelectedRow();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat.parse(tabelModel.getValueAt(indexTerpilih, 4).toString());
            txtId.setText(tabelModel.getValueAt(indexTerpilih, 0).toString());
            txtTanggal.setDate(parsedDate);
            txtBerat.setText(tabelModel.getValueAt(indexTerpilih, 5).toString());
            txtTinggi.setText(tabelModel.getValueAt(indexTerpilih, 6).toString());
            txtImunisasi.setText(tabelModel.getValueAt(indexTerpilih, 7).toString());        
            txtVitamin.setText(tabelModel.getValueAt(indexTerpilih, 8).toString());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tablePelayananMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelayanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<Form.Bayi_1> bayi_1List;
    private javax.persistence.Query bayi_1Query;
    private java.util.List<Form.Bidan_1> bidan_1List;
    private javax.persistence.Query bidan_1Query;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKosongkan;
    private javax.swing.JButton btnTambah;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Form.Kader_1> kader_1List;
    private javax.persistence.Query kader_1Query;
    private javax.swing.JLabel labelBayi;
    private javax.swing.JLabel labelBerat;
    private javax.swing.JLabel labelBidan;
    private javax.swing.JLabel labelImunisasi;
    private javax.swing.JLabel labelKader;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTinggi;
    private javax.swing.JLabel labelVitamin;
    private javax.swing.JTable tablePelayanan;
    private javax.swing.JComboBox<String> txtBayi;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JComboBox<String> txtBidan;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImunisasi;
    private javax.swing.JComboBox<String> txtKader;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtTinggi;
    private javax.swing.JTextField txtVitamin;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
