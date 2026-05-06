package com.senai.backend.riscos_petropolis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.riscos_petropolis.models.AreaRisco;
import com.senai.backend.riscos_petropolis.repositories.AreaRiscoRepository;

@Service
public class AreaRiscoService {
    
    @Autowired
    private AreaRiscoRepository areaRiscoRepository;

    public Long contarAreaRisco() {
        return areaRiscoRepository.count();
    }

    public AreaRisco buscarAreaRisco(Integer id) {
        return areaRiscoRepository.findById(id).get();
    }

    public List<AreaRisco> listarAreasrisco() {
        return areasRiscoRepository.findAll();
    }

    public Boolean deletarAreaRisco(Integer id) {
        if(areaRiscoRepository.existsById(id)) {
            areaRiscoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public AreaRisco cadastrarOcorrencia(AreaRisco arearisco) {
        return areaRiscoRepository.save(arearisco);
    }

}