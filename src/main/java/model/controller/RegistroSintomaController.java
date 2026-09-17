package model.controller;

import model.entity.Sintoma;
import model.services.SintomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sintomas")
public class RegistroSintomaController {

    @Autowired
    private SintomaService service;

    @PostMapping
    public Sintoma salvar(@RequestBody Sintoma sintoma) {
        return service.salvar(sintoma);
    }

    @GetMapping
    public List<Sintoma> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Sintoma> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}