package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissionController {

    // Post -- Criar
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    // Get -- Mostrar
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso";
    }

    // Put -- Atualizar
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    // Delete -- Deletar
    @DeleteMapping("/delete")
    public String DeletarMissao(){
        return "Missão deletada com sucesso";
    }
}
