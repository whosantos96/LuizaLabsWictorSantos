package com.example.repassesfinanceiros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repassesfinanceiros.model.Repasse;
import com.example.repassesfinanceiros.model.TipoRepasso;
import com.example.repassesfinanceiros.repository.RepasseRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RepasseService {

    @Autowired
    private RepasseRepository repasseRepository;

    @Transactional
    public Repasse createRepasse(Repasse repasse) {
        repasse.setDataCriacao(LocalDateTime.now());
        repasse.setDataAtualizacao(LocalDateTime.now());
        return repasseRepository.save(repasse);
    }

    public List<Repasse> getAllRepasses() {
        return repasseRepository.findAllOrderedByDataVencimento();
    }

    public Optional<Repasse> getRepasseById(Long id) {
        return repasseRepository.findById(id);
    }

    @Transactional
    public Repasse updateRepasse(Long id, Repasse repasseDetails) {
        Repasse repasse = repasseRepository.findById(id).orElseThrow();
        repasse.setTipoRepasso(repasseDetails.getTipoRepasso());
        repasse.setValor(repasseDetails.getValor());
        repasse.setDataVencimento(repasseDetails.getDataVencimento());
        repasse.setFormaPagamento(repasseDetails.getFormaPagamento());
        repasse.setSistemaOrigem(repasseDetails.getSistemaOrigem());
        repasse.setDataAtualizacao(LocalDateTime.now());
        return repasseRepository.save(repasse);
    }

    @Transactional
    public void deleteRepasse(Long id) {
        repasseRepository.deleteById(id);
    }

    public List<Repasse> getRepassesByTipo(TipoRepasso tipoRepasso) {
        return repasseRepository.findByTipoRepasso(tipoRepasso);
    }
}

