package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService {

    private MissionRepository missionRepository;

    public MissionService(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    //Criar Missao
    public MissionModel criarMissao(MissionModel mission){
        return missionRepository.save(mission);
    }

    //Listar Missoes
    public List<MissionModel> listarMissoes(){
        return missionRepository.findAll();
    }

}

