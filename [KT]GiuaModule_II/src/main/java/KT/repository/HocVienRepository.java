package KT.repository;

import KT.model.HocVien;
import KT.model.Lop;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.beans.Customizer;

public interface HocVienRepository extends PagingAndSortingRepository<HocVien, Long>{
    Iterable<HocVien> findAllByLop(Lop lop);

    Page<HocVien> findAllByTen(String ten, Pageable pageable);
}
