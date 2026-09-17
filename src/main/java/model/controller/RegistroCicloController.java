package model.controller;

import model.entity.RegistroCiclo;
import model.services.RegistroCicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// @RestController avisa ao Spring que esta classe é um controlador REST (API)
@RestController
@RequestMapping("/ciclos") // Define que todas as rotas aqui começam com /ciclos
public class RegistroCicloController {

    // Injetamos o serviço para usar as regras de negócio
    @Autowired
    private RegistroCicloService service;

    // Rota POST para salvar ou atualizar um ciclo (/ciclos)
    @PostMapping
    public RegistroCiclo salvar(@RequestBody RegistroCiclo ciclo) {
        return service.salvar(ciclo);
    }

    // Rota GET para listar todos os ciclos (/ciclos)
    @GetMapping
    public List<RegistroCiclo> listarTodos() {
        return service.listarTodos();
    }

    // Rota GET para buscar um ciclo específico pelo ID (/ciclos/{id})
    @GetMapping("/{id}")
    public Optional<RegistroCiclo> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Rota DELETE para remover um ciclo pelo ID (/ciclos/{id})
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}