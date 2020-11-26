package controller;


import model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.PacienteService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping("/listarpacientes")
    public String listar_paciete(Model model){
        List<Paciente>pacientes = service.listar();
        model.addAttribute("pacientes",pacientes);
        return "index";
    }

    @GetMapping("/nuevopaciente")
    public String agregar_paciente(Model model){
        model.addAttribute("paciente", new Paciente());
        return "paciente";
    }
    @PostMapping("/guardarpaciente")
    public String guardar_paciente(@Valid Paciente p, Model model){
        service.save(p);
        return "redirect:/listarpacientes";
    }

    @GetMapping("/editar/{run}")
    public String editar_paciente(@PathVariable String run, Model model){
        Optional<Paciente> paciente = service.listarRun(run);
        model.addAttribute("paciente",paciente);
        return "paciente";
    }

    @GetMapping("/borrarpaciente/{run}")
    public String borrar_paciente(Model model, @PathVariable String run){
        service.delete(run);
        return "redirect:/listar";
    }

}
