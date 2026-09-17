package model.services;

import model.entity.RegistroHumor;
import model.repository.RegistroHumorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroHumorService {

    @Autowired
    private RegistroHumorRepository repository;

    public RegistroHumor salvar(RegistroHumor registroHumor) {
        return repository.save(registroHumor);
    }

    public List<RegistroHumor> listarTodos() {
        return repository.findAll();
    }

    public Optional<RegistroHumor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}