package model.services;

import model.entity.Sintoma;
import model.repository.SintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SintomaService {

    @Autowired
    private SintomaRepository repository;

    public Sintoma salvar(Sintoma sintoma) {
        return repository.save(sintoma);
    }

    public List<Sintoma> listarTodos() {
        return repository.findAll();
    }

    public Optional<Sintoma> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}