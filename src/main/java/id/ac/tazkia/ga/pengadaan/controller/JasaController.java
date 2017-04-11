package id.ac.tazkia.ga.pengadaan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jasa")
public class JasaController {

    @GetMapping("/list")
    public void list(){

    }

    @GetMapping("/form")
    public void tampilkanForm(){

    }

    @PostMapping("/form")
    public String prosesForm(){
        return "redirect:kategori/list";
    }
}
