package KT.controller;

import KT.model.Lop;
import KT.model.HocVien;
import KT.service.LopService;
import KT.service.HocVienService;
import KT.repository.HocVienRepository;
import KT.repository.LopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class LopController {
    @Autowired
    private LopService LopService;

    @Autowired
    private HocVienService HocVienService;

    @GetMapping("/Lops")
    public ModelAndView listLops(){
        Iterable<Lop> Lops = LopService.findAll();
        ModelAndView modelAndView = new ModelAndView("/Lop/list");
        modelAndView.addObject("Lops", Lops);
        return modelAndView;
    }

    @GetMapping("/create-Lop")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/Lop/create");
        modelAndView.addObject("Lop", new Lop());
        return modelAndView;
    }

    @PostMapping("/create-Lop")
    public ModelAndView saveLop(@ModelAttribute("Lop") Lop Lop){
        LopService.save(Lop);

        ModelAndView modelAndView = new ModelAndView("/Lop/create");
        modelAndView.addObject("Lop", new Lop());
        modelAndView.addObject("message", "New Lop created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-Lop/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Lop Lop = LopService.findById(id);
        if(Lop != null) {
            ModelAndView modelAndView = new ModelAndView("/Lop/edit");
            modelAndView.addObject("Lop", Lop);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-Lop")
    public ModelAndView updateLop(@ModelAttribute("Lop") Lop Lop){
        LopService.save(Lop);
        ModelAndView modelAndView = new ModelAndView("/Lop/edit");
        modelAndView.addObject("Lop", Lop);
        modelAndView.addObject("message", "Lop updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-Lop/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Lop Lop = LopService.findById(id);
        if(Lop != null) {
            ModelAndView modelAndView = new ModelAndView("/Lop/delete");
            modelAndView.addObject("Lop", Lop);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-Lop")
    public String deleteLop(@ModelAttribute("Lop") Lop Lop){
        LopService.remove((long) Lop.getId());
        return "redirect:Lops";
    }

    @GetMapping("/view-Lop/{id}")
    public ModelAndView viewLop(@PathVariable("id") Long id){
        Lop Lop = LopService.findById(id);
        if(Lop == null){
            return new ModelAndView("/error.404");
        }

        Iterable<HocVien> HocViens = HocVienService.findAllByLop(Lop);

        ModelAndView modelAndView = new ModelAndView("/Lop/view");
        modelAndView.addObject("Lop", Lop);
        modelAndView.addObject("HocViens", HocViens);
        return modelAndView;
    }
}
