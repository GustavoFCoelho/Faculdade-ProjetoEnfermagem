package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.models.converter.dto.AnotacoesDTOConverter;
import Projeto.Enfermagem.projEnf.models.converter.dto.PessoaDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.AnotacoesDTO;
import Projeto.Enfermagem.projEnf.resource.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ano")
@RequiredArgsConstructor
public class AnotacoesController {
    private final PessoaService service;
    private final AnotacoesDTOConverter converter;
    private final PessoaDTOConverter pessoaDTOConverter;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("ErroLista");
        modelMap.addAttribute("idosos", pessoaDTOConverter.toDTOList(service.getAllIdososPessoas()));
        modelMap.addAttribute("anotacoes", new AnotacoesDTO());
        modelMap.addAttribute("conteudo","/ano/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid AnotacoesDTO anotacoes, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("pacientes", service.getAllIdososPessoas());
            map.addAttribute("anotacoes", anotacoes);
            map.addAttribute("conteudo","/ano/cadastro");
            return new ModelAndView("layout", map);
        }

        service.saveAnotacoes(converter.toModel(anotacoes));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }
}
