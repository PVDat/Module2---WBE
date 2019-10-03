package KT.service;

import KT.model.HocVien;
import KT.model.Lop;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HocVienService {


    Page<HocVien> findAll(Pageable pageable);

    HocVien findById(Long id);

    void luu(HocVien hocVien);

    void xoa(int id);

    Iterable<HocVien> findAllByLop(Lop lop);

    Page<HocVien> findAllByTen(String ten, Pageable pageable);
}
