package model.services;

import model.entity.Usuario;
import model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service indica que esta classe gerencia as operações para Usuário
@Service
public class UsuarioService {

    // Injetamos o repositório específico de Usuário
    @Autowired
    private UsuarioRepository repository;

    // Salva ou atualiza um usuário
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    // Retorna todos os usuários cadastrados
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    // Busca um usuário pelo ID
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deleta um usuário pelo ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}