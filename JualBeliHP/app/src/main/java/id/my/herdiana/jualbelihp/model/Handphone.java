package id.my.herdiana.jualbelihp.model;

public class Handphone {
    private Integer id;
    private String nama;
    private String harga;

    public Handphone() {
        super();
    }

    public Handphone(Integer id, String nama)
        super();
        this.id =id;
        this.nama =nama;
        this.harga =harga;
}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(){
        this.harga = harga;
    }
}
