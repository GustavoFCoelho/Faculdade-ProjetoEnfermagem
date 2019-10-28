package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Responsaveis;
import Projeto.Enfermagem.projEnf.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/resp")
public class ResponsavelController {
    @Autowired
    private ResponsavelService resService;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("pacientes", resService.getPacService().callPacs());
        modelMap.addAttribute("responsavel", new Responsaveis());
        modelMap.addAttribute("conteudo", "/res/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(Responsaveis responsaveis, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("layout", "conteudo", "/res/cadastro");
        }

        resService.save(responsaveis);
        return new ModelAndView("redirect:/resp");
    }
}
