package model.controller;

import model.entity.RegistroHumor;
import model.services.RegistroHumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registro-humores")
public class RegistroHumorController {

    @Autowired
    private RegistroHumorService service;

    @PostMapping
    public RegistroHumor salvar(@RequestBody RegistroHumor registroHumor) {
        return service.salvar(registroHumor);
    }

    @GetMapping
    public List<RegistroHumor> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<RegistroHumor> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}