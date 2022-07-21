import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Field field=new Field();
        field.setId(1);
        field.setAtasNama("qwerty");
        field.setNoTelpon("000000");
        field.setAlamat("smg");
        field.setMerek("asd");
        field.setNumberPlat("123456");
        field.setLiter("12");
        field.setBiayaLayanan("120000000");
        field.setTotalPembayaran(120000000);
        field.setCreateDate(new Date());
        field.setUsers("zxcvb");

        System.out.println(field);
    }
}
