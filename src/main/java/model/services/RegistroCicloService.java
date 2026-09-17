package model.services;

import model.entity.RegistroCiclo;
import model.repository.RegistroCicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service avisa ao Spring que esta classe contém as regras de negócio
@Service
public class RegistroCicloService {

    // @Autowired injeta o repositório automaticamente para podermos usar os comandos do banco
    @Autowired
    private RegistroCicloRepository repository;

    // Método para salvar um novo ciclo ou atualizar um existente
    public RegistroCiclo salvar(RegistroCiclo ciclo) {
        return repository.save(ciclo);
    }

    // Método para buscar uma lista com todos os ciclos já cadastrados
    public List<RegistroCiclo> listarTodos() {
        return repository.findAll();
    }

    // Método para buscar um ciclo específico pelo seu número de ID
    // Usamos Optional porque o ciclo pode ou não existir no banco de dados
    public Optional<RegistroCiclo> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Método para deletar um ciclo do banco de dados
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}