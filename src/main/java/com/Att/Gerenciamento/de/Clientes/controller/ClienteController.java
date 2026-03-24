package com.Att.Gerenciamento.de.Clientes.controller;

import com.Att.Gerenciamento.de.Clientes.entity.Cliente;
import com.Att.Gerenciamento.de.Clientes.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // POST /clientes
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    // GET /clientes
    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    // GET /clientes/{id}
    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // DELETE /clientes/{id}
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}