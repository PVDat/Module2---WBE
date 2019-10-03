package KT.service;


import KT.model.Lop;

public interface LopService {
    Iterable<Lop> findAll();

    Lop findById(Long id);

    void save(Lop lop);

    void remove(Long id);
}
