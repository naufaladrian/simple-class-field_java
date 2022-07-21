import java.util.Date;

public class Field {
    private int id;
    private String atasNama;
    private String noTelpon;
    private String alamat;
    private String merek;
    private String numberPlat;
    private String liter;
    private String biayaLayanan;
    private int totalPembayaran;
    private Date createDate;
    private String users;

    public Field() {
    }

    public Field(int id, String atasNama, String noTelpon, String alamat, String merek, String numberPlat, String liter, String biayaLayanan, int totalPembayaran, Date createDate, String users) {
        this.id = id;
        this.atasNama = atasNama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
        this.merek = merek;
        this.numberPlat = numberPlat;
        this.liter = liter;
        this.biayaLayanan = biayaLayanan;
        this.totalPembayaran = totalPembayaran;
        this.createDate = createDate;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNumberPlat() {
        return numberPlat;
    }

    public void setNumberPlat(String numberPlat) {
        this.numberPlat = numberPlat;
    }

    public String getLiter() {
        return liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public String getBiayaLayanan() {
        return biayaLayanan;
    }

    public void setBiayaLayanan(String biayaLayanan) {
        this.biayaLayanan = biayaLayanan;
    }

    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", atasNama='" + atasNama + '\'' +
                ", noTelpon='" + noTelpon + '\'' +
                ", alamat='" + alamat + '\'' +
                ", merek='" + merek + '\'' +
                ", numberPlat='" + numberPlat + '\'' +
                ", liter='" + liter + '\'' +
                ", biayaLayanan='" + biayaLayanan + '\'' +
                ", totalPembayaran=" + totalPembayaran +
                ", createDate=" + createDate +
                ", users='" + users + '\'' +
                '}';
    }
}
