package KT.controller;

import KT.model.Lop;
import KT.model.HocVien;
import KT.service.LopService;
import KT.service.HocVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

public class HocVienController {
    @Autowired
    private HocVienService HocVienService;

    @Autowired
    private LopService lopService;

    @ModelAttribute("provinces")
    public Iterable<Lop> provinces(){
        return LopService.findAll();
    }

    @GetMapping("/HocViens")
    public ModelAndView listHocViens(@RequestParam("s") Optional<String> s, Pageable pageable){
        Page<HocVien> HocViens;
        if(s.isPresent()){
            HocViens = HocVienService.findAllByTen(s.get(), pageable);
        } else {
            HocViens = HocVienService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/HocVien/DanhSach");
        modelAndView.addObject("HocViens", HocViens);
        return modelAndView;
    }

    @GetMapping("/them-HocVien")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/HocVien/them");
        modelAndView.addObject("HocVien", new HocVien());
        return modelAndView;
    }

    @PostMapping("/them-HocVien")
    public ModelAndView saveHocVien(@ModelAttribute("HocVien") HocVien HocVien){
        HocVienService.luu(HocVien);
        ModelAndView modelAndView = new ModelAndView("/HocVien/them");
        modelAndView.addObject("HocVien", new HocVien());
        modelAndView.addObject("loinhan", "HocVien moi da duoc them");
        return modelAndView;
    }

    @GetMapping("/sua-HocVien/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        HocVien HocVien = HocVienService.findById(id);
        if(HocVien != null) {
            ModelAndView modelAndView = new ModelAndView("/HocVien/sua");
            modelAndView.addObject("HocVien", HocVien);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/sua-HocVien")
    public ModelAndView updateHocVien(@ModelAttribute("HocVien") HocVien HocVien){
        HocVienService.luu(HocVien);
        ModelAndView modelAndView = new ModelAndView("/HocVien/sua");
        modelAndView.addObject("HocVien", HocVien);
        modelAndView.addObject("loinhan", "HocVien da duoc cap nhat");
        return modelAndView;
    }

    @GetMapping("/xoa-HocVien/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        HocVien HocVien = HocVienService.findById(id);
        if(HocVien != null) {
            ModelAndView modelAndView = new ModelAndView("/HocVien/xoa");
            modelAndView.addObject("HocVien", HocVien);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/xoa-HocVien")
    public String deleteHocVien(@ModelAttribute("HocVien") HocVien HocVien){
        HocVienService.xoa(HocVien.getId());
        return "redirect:HocViens";
    }
}
