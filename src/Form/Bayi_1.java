package Form;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "bayi", catalog = "posyandu", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bayi_1.findAll", query = "SELECT b FROM Bayi_1 b")
    , @NamedQuery(name = "Bayi_1.findByIdBayi", query = "SELECT b FROM Bayi_1 b WHERE b.idBayi = :idBayi")
    , @NamedQuery(name = "Bayi_1.findByNamaBayi", query = "SELECT b FROM Bayi_1 b WHERE b.namaBayi = :namaBayi")
    , @NamedQuery(name = "Bayi_1.findByNamaAyah", query = "SELECT b FROM Bayi_1 b WHERE b.namaAyah = :namaAyah")
    , @NamedQuery(name = "Bayi_1.findByNamaIbu", query = "SELECT b FROM Bayi_1 b WHERE b.namaIbu = :namaIbu")
    , @NamedQuery(name = "Bayi_1.findByTempatLahir", query = "SELECT b FROM Bayi_1 b WHERE b.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "Bayi_1.findByJenisKelamin", query = "SELECT b FROM Bayi_1 b WHERE b.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Bayi_1.findByAnakKe", query = "SELECT b FROM Bayi_1 b WHERE b.anakKe = :anakKe")
    , @NamedQuery(name = "Bayi_1.findByAlamat", query = "SELECT b FROM Bayi_1 b WHERE b.alamat = :alamat")})
public class Bayi_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bayi")
    private String idBayi;
    @Column(name = "nama_bayi")
    private String namaBayi;
    @Column(name = "nama_ayah")
    private String namaAyah;
    @Column(name = "nama_ibu")
    private String namaIbu;
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "anak_ke")
    private Integer anakKe;
    @Column(name = "alamat")
    private String alamat;
    public Bayi_1() {
    }
    public Bayi_1(String idBayi) {
        this.idBayi = idBayi;
    }
    public String getIdBayi() {
        return idBayi;
    }
    public void setIdBayi(String idBayi) {
        String oldIdBayi = this.idBayi;
        this.idBayi = idBayi;
        changeSupport.firePropertyChange("idBayi", oldIdBayi, idBayi);
    }
    public String getNamaBayi() {
        return namaBayi;
    }
    public void setNamaBayi(String namaBayi) {
        String oldNamaBayi = this.namaBayi;
        this.namaBayi = namaBayi;
        changeSupport.firePropertyChange("namaBayi", oldNamaBayi, namaBayi);
    }
    public String getNamaAyah() {
        return namaAyah;
    }
    public void setNamaAyah(String namaAyah) {
        String oldNamaAyah = this.namaAyah;
        this.namaAyah = namaAyah;
        changeSupport.firePropertyChange("namaAyah", oldNamaAyah, namaAyah);
    }
    public String getNamaIbu() {
        return namaIbu;
    }
    public void setNamaIbu(String namaIbu) {
        String oldNamaIbu = this.namaIbu;
        this.namaIbu = namaIbu;
        changeSupport.firePropertyChange("namaIbu", oldNamaIbu, namaIbu);
    }
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        String oldTempatLahir = this.tempatLahir;
        this.tempatLahir = tempatLahir;
        changeSupport.firePropertyChange("tempatLahir", oldTempatLahir, tempatLahir);
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }
    public Integer getAnakKe() {
        return anakKe;
    }
    public void setAnakKe(Integer anakKe) {
        Integer oldAnakKe = this.anakKe;
        this.anakKe = anakKe;
        changeSupport.firePropertyChange("anakKe", oldAnakKe, anakKe);
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBayi != null ? idBayi.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Bayi_1)) {
            return false;
        }
        Bayi_1 other = (Bayi_1) object;
        if ((this.idBayi == null && other.idBayi != null) || (this.idBayi != null && !this.idBayi.equals(other.idBayi))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return namaBayi;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    public static Bayi_1 findByNamaBayi(String namaBayi) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bayi_1 bayi = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posyandu", "root", "");
            pst = conn.prepareStatement("SELECT * FROM bayi WHERE nama_bayi = ?");
            pst.setString(1, namaBayi);
            rs = pst.executeQuery();
            if (rs.next()) {
                bayi = new Bayi_1();
                bayi.setIdBayi(rs.getString("id_bayi"));
                bayi.setNamaBayi(rs.getString("nama_bayi"));
                bayi.setNamaAyah(rs.getString("nama_ayah"));
                bayi.setNamaIbu(rs.getString("nama_ibu"));
                bayi.setTempatLahir(rs.getString("tempat_lahir"));
                bayi.setJenisKelamin(rs.getString("jenis_kelamin"));
                bayi.setAnakKe(rs.getInt("anak_ke"));
                bayi.setAlamat(rs.getString("alamat"));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return bayi;
    }
}
