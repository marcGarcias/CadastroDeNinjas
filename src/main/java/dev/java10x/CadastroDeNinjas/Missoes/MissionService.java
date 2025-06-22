package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Listar Missao por ID
    public MissionModel listarMissaoPorID(Long id){
        Optional<MissionModel> missionModel = missionRepository.findById(id);
                return missionModel.orElse(null);
    }

    //Deletar Missao Por ID
    public void deletarMissaoPorId(Long id){
        missionRepository.deleteById(id);
    }

}

