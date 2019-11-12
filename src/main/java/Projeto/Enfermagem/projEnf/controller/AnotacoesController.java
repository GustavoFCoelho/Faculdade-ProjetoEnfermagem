package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Anotacoes;
import Projeto.Enfermagem.projEnf.service.AnotacoesService;
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
@RequestMapping("/ano")
public class AnotacoesController {
    @Autowired
    private AnotacoesService anotacoesService;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("pacientes", anotacoesService.getPacService().callPacs());
        modelMap.addAttribute("anotacoes", new Anotacoes());
        modelMap.addAttribute("conteudo","/ano/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Anotacoes anotacoes, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            map.addAttribute("pacientes", anotacoesService.getPacService().callPacs());
            map.addAttribute("conteudo","/ano/cadastro");
            return new ModelAndView("layout", map);
        }

        anotacoesService.save(anotacoes);
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }
}
