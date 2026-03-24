package com.Att.Gerenciamento.de.Clientes.service;

import com.Att.Gerenciamento.de.Clientes.entity.Cliente;
import com.Att.Gerenciamento.de.Clientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    // Criar cliente
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    // Listar todos
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}