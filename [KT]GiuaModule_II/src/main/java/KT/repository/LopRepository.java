package KT.repository;

import KT.model.Lop;

public interface LopRepository {
    Iterable<Lop> findAll();

    Lop findById(Long id);

    void save(Lop lop);

    void remove(Long id);
}
