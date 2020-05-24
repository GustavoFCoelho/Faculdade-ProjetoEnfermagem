package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.models.converter.dto.ReligiaoDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.ReligiaoDTO;
import Projeto.Enfermagem.projEnf.resource.service.PessoaService;
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
@RequestMapping("rel")
@RequiredArgsConstructor
public class ReligiaoController {

    private final PessoaService service;
    private final ReligiaoDTOConverter converter;

    @GetMapping
    public ModelAndView index(ModelMap model) {
        model.addAttribute("religiao", new ReligiaoDTO());
        model.addAttribute("conteudo", "/religiao/cadastro");
        model.addAttribute("ErroLista");
        return new ModelAndView("layout", model);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid ReligiaoDTO reDTO, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "/religiao/cadastro");
            map.addAttribute("religiao", reDTO);
            return new ModelAndView("layout", map);
        }
        service.saveReligiao(converter.toModel(reDTO));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @GetMapping("/listareligiao")
    public ModelAndView buscar(ModelMap map) {
        map.addAttribute("listareligiao", converter.toDTOList(service.chamarReligoes()));
        map.addAttribute("conteudo", "/religiao/lista");
        return new ModelAndView("layout", map);
    }

    @GetMapping("/alterareligiao/{id}")
    public ModelAndView buscarRel(@PathVariable Long id, ModelMap map) {
        map.addAttribute("religiao", converter.toDTO(service.buscaReligiao(id)));
        map.addAttribute("conteudo", "/religiao/cadastro");
        return new ModelAndView("layout", map);
    }
}
