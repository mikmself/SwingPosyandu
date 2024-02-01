package Form;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name = "bidan", catalog = "posyandu", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bidan_1.findAll", query = "SELECT b FROM Bidan_1 b")
    , @NamedQuery(name = "Bidan_1.findByIdBidan", query = "SELECT b FROM Bidan_1 b WHERE b.idBidan = :idBidan")
    , @NamedQuery(name = "Bidan_1.findByNamaBidan", query = "SELECT b FROM Bidan_1 b WHERE b.namaBidan = :namaBidan")
    , @NamedQuery(name = "Bidan_1.findByTanggalLahir", query = "SELECT b FROM Bidan_1 b WHERE b.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "Bidan_1.findByAlamat", query = "SELECT b FROM Bidan_1 b WHERE b.alamat = :alamat")
    , @NamedQuery(name = "Bidan_1.findByJenisKelamin", query = "SELECT b FROM Bidan_1 b WHERE b.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Bidan_1.findByNoTelp", query = "SELECT b FROM Bidan_1 b WHERE b.noTelp = :noTelp")})
public class Bidan_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_bidan")
    private String idBidan;
    @Column(name = "nama_bidan")
    private String namaBidan;
    @Column(name = "tanggal_lahir")
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "no_telp")
    private String noTelp;
    public Bidan_1() {
    }
    public Bidan_1(String idBidan) {
        this.idBidan = idBidan;
    }
    public String getIdBidan() {
        return idBidan;
    }
    public void setIdBidan(String idBidan) {
        String oldIdBidan = this.idBidan;
        this.idBidan = idBidan;
        changeSupport.firePropertyChange("idBidan", oldIdBidan, idBidan);
    }
    public String getNamaBidan() {
        return namaBidan;
    }
    public void setNamaBidan(String namaBidan) {
        String oldNamaBidan = this.namaBidan;
        this.namaBidan = namaBidan;
        changeSupport.firePropertyChange("namaBidan", oldNamaBidan, namaBidan);
    }
    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(Date tanggalLahir) {
        Date oldTanggalLahir = this.tanggalLahir;
        this.tanggalLahir = tanggalLahir;
        changeSupport.firePropertyChange("tanggalLahir", oldTanggalLahir, tanggalLahir);
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
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
        hash += (idBidan != null ? idBidan.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Bidan_1)) {
            return false;
        }
        Bidan_1 other = (Bidan_1) object;
        if ((this.idBidan == null && other.idBidan != null) || (this.idBidan != null && !this.idBidan.equals(other.idBidan))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return namaBidan;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    public static Bidan_1 findByNamaBidan(String namaBidan) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bidan_1 bidan = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posyandu", "root", "");
            pst = conn.prepareStatement("SELECT * FROM bidan WHERE nama_bidan = ?");
            pst.setString(1, namaBidan);
            rs = pst.executeQuery();

            if (rs.next()) {
                bidan = new Bidan_1();
                bidan.setIdBidan(rs.getString("id_bidan"));
                bidan.setNamaBidan(rs.getString("nama_bidan"));
                bidan.setTanggalLahir(rs.getDate("tanggal_lahir"));
                bidan.setAlamat(rs.getString("alamat"));
                bidan.setJenisKelamin(rs.getString("jenis_kelamin"));
                bidan.setNoTelp(rs.getString("no_telp"));
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

        return bidan;
    }

}
