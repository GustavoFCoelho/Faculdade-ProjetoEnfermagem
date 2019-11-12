package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Medicamento;
import Projeto.Enfermagem.projEnf.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/med")
public class MedicamentoController {
    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("medicamento", new Medicamento());
        modelMap.addAttribute("conteudo", "/med/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Medicamento medicamento, BindingResult result, ModelMap map){
        if(result.hasErrors())
            return new ModelAndView("layout","conteudo","/med/cadastro");

        medicamentoService.saveMedicamento(medicamento);
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }
}
