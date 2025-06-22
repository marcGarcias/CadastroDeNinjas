package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissionController {

    private MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    // Post -- Criar
    @PostMapping("/criar")
    public MissionModel criarMissao(@RequestBody MissionModel mission){
        return missionService.criarMissao(mission);
    }

    // Get -- Mostrar
    @GetMapping("/listar")
    public List<MissionModel> listarMissoes(){
        return missionService.listarMissoes();
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
