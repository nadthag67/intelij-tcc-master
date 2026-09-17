package model.controller;

import model.entity.RegistroAntconcepcional;
import model.services.RegistroAntconcepcionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registro-anticoncepcionais")
public class RegistroAntconcepcionalController {

    @Autowired
    private RegistroAntconcepcionalService service;

    @PostMapping
    public RegistroAntconcepcional salvar(@RequestBody RegistroAntconcepcional registroAntconcepcional) {
        return service.salvar(registroAntconcepcional);
    }

    @GetMapping
    public List<RegistroAntconcepcional> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<RegistroAntconcepcional> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}