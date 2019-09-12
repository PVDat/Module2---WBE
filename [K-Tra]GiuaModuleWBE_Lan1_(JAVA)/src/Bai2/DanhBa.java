package Bai2;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.LinkedList;

public class DanhBa {
    private LinkedList<LienHe> danhBa = new LinkedList<LienHe>();

    public void hienDanhSach() {
        for (LienHe tatCa : danhBa) {
            System.out.print(tatCa);
        }
    }

    public void themLienHe(LienHe lienHe) {
        danhBa.add(lienHe);
    }

    public void chinhSuaLienHe(int index, LienHe lienHe) {
        danhBa.set(index, lienHe);
    }

    public void xoaLienHe(String soDienThoai) {
        for (int index = 0; index < danhBa.size(); index++) {
            if (danhBa.get(index).getPhoneNumber() == soDienThoai) {
                danhBa.remove(index);
            }
        }
    }

    public void timTheoFirstName(String firstName) {
        boolean coTonTai = false;
        for (int index = 0; index < danhBa.size(); index++) {
            if (danhBa.get(index).getFirstName() == firstName) {
                coTonTai = true;
                System.out.print(danhBa.get(index));
            } else {
                System.out.println("ten khong ton tai");
            }
        }

    }

    public void timTheoLastName(String lastName) {
        boolean coTonTai = false;
        for (int index = 0; index < danhBa.size(); index++) {
            if (danhBa.get(index).getFirstName() == lastName) {
                coTonTai = true;
                System.out.print(danhBa.get(index));
            } else {
                System.out.println("ten khong ton tai");
            }


        }
    }

    public void timTheoSodienthoai(String soDienThoai) {
        boolean coTonTai = false;
        for (int index = 0; index < danhBa.size(); index++) {
            if (danhBa.get(index).getFirstName() == soDienThoai) {
                coTonTai = true;
                System.out.print(danhBa.get(index));
            } else {
                System.out.println("So khong ton tai");
            }

        }

    }

    public static void main(String[] args) {


        LienHe PP1 = new LienHe("To","Nguyen","001");
        LienHe PP2 = new LienHe("Vi","Tran","002");
        LienHe PP3 = new LienHe("Da","Pham","003");
        LienHe PP4 = new LienHe("Ro","Phan","004");
        LienHe PP5 = new LienHe("Me","Vu","005");

        DanhBa DanhBa = new DanhBa();
        DanhBa.themLienHe(PP1);
        DanhBa.themLienHe(PP2);
        DanhBa.themLienHe(PP3);
        DanhBa.themLienHe(PP4);
        DanhBa.themLienHe(PP5);

        DanhBa.hienDanhSach();

        DanhBa.chinhSuaLienHe(0, PP3);

        DanhBa.xoaLienHe("002");

        DanhBa.timTheoFirstName("Me");
        DanhBa.timTheoLastName("Phan");
        DanhBa.timTheoSodienthoai("005");
    }
}