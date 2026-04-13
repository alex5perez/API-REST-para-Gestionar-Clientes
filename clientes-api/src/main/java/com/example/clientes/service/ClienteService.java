package com.example.clientes.service;

import com.example.clientes.model.Cliente;
import com.example.clientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> update(Long id, Cliente clienteActualizado) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setEmail(clienteActualizado.getEmail());
            cliente.setTelefono(clienteActualizado.getTelefono());
            cliente.setDireccion(clienteActualizado.getDireccion());
            return clienteRepository.save(cliente);
        });
    }

    public boolean delete(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
