package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.models.converter.dto.MedicamentoDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.MedicamentoDTO;
import Projeto.Enfermagem.projEnf.resource.service.MedicamentoService;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class MedicamentoController {
    private final MedicamentoService medicamentoService;
    private final MedicamentoDTOConverter converter;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("medicamento", new MedicamentoDTO());
        modelMap.addAttribute("conteudo", "/med/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid MedicamentoDTO medicamento, BindingResult result, ModelMap map){
        if(result.hasErrors())
            return new ModelAndView("layout","conteudo","/med/cadastro");

        medicamentoService.save(converter.toModel(medicamento));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }
}
