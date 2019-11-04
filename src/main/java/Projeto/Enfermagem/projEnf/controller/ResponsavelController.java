package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Responsaveis;
import Projeto.Enfermagem.projEnf.service.ResponsavelService;
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
@RequestMapping("resp")
public class ResponsavelController {
    @Autowired
    private ResponsavelService resService;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("pacientes", resService.getPacService().callPacs());
        modelMap.addAttribute("responsaveis", new Responsaveis());
        modelMap.addAttribute("conteudo", "/res/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Responsaveis responsaveis, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            map.addAttribute("conteudo", "/res/cadastro");
            map.addAttribute("pacientes", resService.getPacService().callPacs());
            return new ModelAndView("layout", map);
        }
        resService.save(responsaveis);
        return new ModelAndView("redirect:/resp");
    }
}
