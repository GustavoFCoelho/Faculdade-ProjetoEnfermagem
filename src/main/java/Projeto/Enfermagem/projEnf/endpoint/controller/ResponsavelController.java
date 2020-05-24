package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.models.converter.dto.ResponsavelDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.ResponsavelDTO;
import Projeto.Enfermagem.projEnf.resource.service.PessoaService;
import Projeto.Enfermagem.projEnf.resource.service.ResponsavelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("resp")
@RequiredArgsConstructor
public class ResponsavelController {
    private final ResponsavelService resService;
    private final PessoaService pessoaService;
    private final ResponsavelDTOConverter converter;

    @GetMapping
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("idosos", pessoaService.getAllIdososPessoas());
        modelMap.addAttribute("responsavel", new ResponsavelDTO());
        modelMap.addAttribute("conteudo", "/res/cadastro");
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid ResponsavelDTO responsavel, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "/res/cadastro");
            map.addAttribute("responsavel", responsavel);
            map.addAttribute("idosos", pessoaService.getAllIdososPessoas());
            return new ModelAndView("layout", map);
        }
        resService.save(converter.toModel(responsavel));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @GetMapping("/listaresponsavel")
    public ModelAndView buscar(ModelMap map) {
        map.addAttribute("listaresponsavel", converter.toDTOList(resService.buscarTodos()));
        map.addAttribute("conteudo", "/res/lista");
        return new ModelAndView("layout", map);
    }

    @GetMapping("/alteraresposavel/{id}")
    public ModelAndView buscarRel(@PathVariable Long id, ModelMap map) {
        map.addAttribute("idosos", pessoaService.getAllIdososPessoas());
        map.addAttribute("responsavel", converter.toDTO(resService.buscar(id)));
        map.addAttribute("conteudo", "/res/cadastro");
        return new ModelAndView("layout", map);
    }
}
