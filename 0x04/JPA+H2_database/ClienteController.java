package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isPresent()) {
            clienteAtualizado.setId(id);
            return clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
*/

 @RestController
        public class ClienteController {

          @Autowired
          private ClienteRepository clienteRepository;

          @PostMapping("/addClient")
          public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
            // TODO
          }

          @GetMapping("/findAllClients")
          public ResponseEntity<List<Cliente>> findAllClients() {
            // TODO
          }

          @GetMapping("/findClientById/{id}")
          public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
            // TODO
          }

          @DeleteMapping("/removeClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void removerCliente(@PathVariable("id") Long idClient){
            // TODO
            }

          @PutMapping("/updateClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
            // TODO
            }
        }