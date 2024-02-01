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
@Table(name = "kader", catalog = "posyandu", schema = "")
@NamedQueries({
    @NamedQuery(name = "Kader_1.findAll", query = "SELECT k FROM Kader_1 k")
    , @NamedQuery(name = "Kader_1.findByIdKader", query = "SELECT k FROM Kader_1 k WHERE k.idKader = :idKader")
    , @NamedQuery(name = "Kader_1.findByNamaKader", query = "SELECT k FROM Kader_1 k WHERE k.namaKader = :namaKader")
    , @NamedQuery(name = "Kader_1.findByTempat", query = "SELECT k FROM Kader_1 k WHERE k.tempat = :tempat")
    , @NamedQuery(name = "Kader_1.findByJenisKelamin", query = "SELECT k FROM Kader_1 k WHERE k.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Kader_1.findByAlamat", query = "SELECT k FROM Kader_1 k WHERE k.alamat = :alamat")
    , @NamedQuery(name = "Kader_1.findByNoTelp", query = "SELECT k FROM Kader_1 k WHERE k.noTelp = :noTelp")})
public class Kader_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kader")
    private String idKader;
    @Column(name = "nama_kader")
    private String namaKader;
    @Column(name = "tempat")
    private String tempat;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "no_telp")
    private String noTelp;
    public Kader_1() {
    }
    public Kader_1(String idKader) {
        this.idKader = idKader;
    }
    public String getIdKader() {
        return idKader;
    }
    public void setIdKader(String idKader) {
        String oldIdKader = this.idKader;
        this.idKader = idKader;
        changeSupport.firePropertyChange("idKader", oldIdKader, idKader);
    }
    public String getNamaKader() {
        return namaKader;
    }
    public void setNamaKader(String namaKader) {
        String oldNamaKader = this.namaKader;
        this.namaKader = namaKader;
        changeSupport.firePropertyChange("namaKader", oldNamaKader, namaKader);
    }
    public String getTempat() {
        return tempat;
    }
    public void setTempat(String tempat) {
        String oldTempat = this.tempat;
        this.tempat = tempat;
        changeSupport.firePropertyChange("tempat", oldTempat, tempat);
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }
    public String getNoTelp() {
        return noTelp;
    }
    public void setNoTelp(String noTelp) {
        String oldNoTelp = this.noTelp;
        this.noTelp = noTelp;
        changeSupport.firePropertyChange("noTelp", oldNoTelp, noTelp);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKader != null ? idKader.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Kader_1)) {
            return false;
        }
        Kader_1 other = (Kader_1) object;
        if ((this.idKader == null && other.idKader != null) || (this.idKader != null && !this.idKader.equals(other.idKader))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return namaKader;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    public static Kader_1 findByNamaKader(String namaKader) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Kader_1 kader = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posyandu", "root", "");
            pst = conn.prepareStatement("SELECT * FROM kader WHERE nama_kader = ?");
            pst.setString(1, namaKader);
            rs = pst.executeQuery();

            if (rs.next()) {
                kader = new Kader_1();
                kader.setIdKader(rs.getString("id_kader"));
                kader.setNamaKader(rs.getString("nama_kader"));
                kader.setTempat(rs.getString("tempat"));
                kader.setJenisKelamin(rs.getString("jenis_kelamin"));
                kader.setAlamat(rs.getString("alamat"));
                kader.setNoTelp(rs.getString("no_telp"));
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

        return kader;
    }
}
