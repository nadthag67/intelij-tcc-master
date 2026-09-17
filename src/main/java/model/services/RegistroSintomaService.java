package model.services;

import model.entity.RegistroSintoma;
import model.repository.RegistroSintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroSintomaService {

    @Autowired
    private RegistroSintomaRepository repository;

    public RegistroSintoma salvar(RegistroSintoma registroSintoma) {
        return repository.save(registroSintoma);
    }

    public List<RegistroSintoma> listarTodos() {
        return repository.findAll();
    }

    public Optional<RegistroSintoma> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}