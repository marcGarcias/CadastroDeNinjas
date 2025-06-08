package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarNinja() {
        return "Mostrar Ninja";
    }

    // Procurar ninja por id (READ)
    @GetMapping("/todos-id")
    public String mostrarNinjaPorId() {
        return "Mostrar Ninja por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar-id")
    public String alterarNinjaporId() {
        return "Alterar Ninja por id";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar-id")
    public String deletarNinjaPorId() {
        return "Ninja deletado por ID";
    }

}
