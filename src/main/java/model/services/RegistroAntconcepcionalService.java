package model.services;

import model.entity.RegistroAntconcepcional;
import model.repository.RegistroAntconcepcionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAntconcepcionalService {

    @Autowired
    private RegistroAntconcepcionalRepository repository;

    public RegistroAntconcepcional salvar(RegistroAntconcepcional registroAnticoncepcional) {
        return repository.save(registroAnticoncepcional);
    }

    public List<RegistroAntconcepcional> listarTodos() {
        return repository.findAll();
    }

    public Optional<RegistroAntconcepcional> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}