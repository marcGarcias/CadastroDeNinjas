package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Procurar ninja por id (READ)
    @GetMapping("/listar-id")
    public String listarNinjaPorId() {
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
