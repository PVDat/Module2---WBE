package KT.model;

import javax.persistence.*;

public class HocVien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ten;
    private String anhHoSo;

    @ManyToOne
    @JoinColumn(name = "lop_id")
    private Lop lop;

    public HocVien() {
    }

    public HocVien(String ten, String anhHoSo){
        this.ten = ten;
        this.anhHoSo = anhHoSo;
    }

    @Override
    public String toString() {
        return String.format("Hoc Vien [id=%d, Ten='%s', anhHoSo='%s']", id, ten, anhHoSo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getAnhHoSo() {
        return anhHoSo;
    }

    public void setAnhHoSo(String anhHoSo) {
        this.anhHoSo = anhHoSo;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
}
