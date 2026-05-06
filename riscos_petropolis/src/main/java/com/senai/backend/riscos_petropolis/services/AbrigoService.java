package com.senai.backend.riscos_petropolis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.riscos_petropolis.models.Abrigo;
import com.senai.backend.riscos_petropolis.repositories.OcorrenciaRepository;

@Service
public class AbrigoService {
    
    @Autowired
    private AbrigoRepository abrigoRepository;

    public Long contarAbrigos() {
        return abrigoRepository.count();
    }

    public Abrigo buscarOcorrencia(Integer id) {
        return ocorrenciaRepository.findById(id).get();
    }

    public List<Ocorrencia> listarUsuarios() {
        return ocorrenciaRepository.findAll();
    }

    public Boolean deletarOcorrencia(Integer id) {
        if(ocorrenciaRepository.existsById(id)) {
            ocorrenciaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Ocorrencia cadastrarOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

}
