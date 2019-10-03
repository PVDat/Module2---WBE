package KT.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "danhSachLop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tenLop;

    @OneToMany(mappedBy = "lop")
    private Set<HocVien> cacHocVien;

    public Lop(){
    }

    public Lop(String tenLop){
        this.tenLop = tenLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Set<HocVien> getCacHocVien() {
        return cacHocVien;
    }

    public void setCacHocVien(Set<HocVien> cacHocVien) {
        this.cacHocVien = cacHocVien;
    }
}
