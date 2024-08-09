package com.example.repassesfinanceiros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.repassesfinanceiros.model.Repasse;
import com.example.repassesfinanceiros.model.TipoRepasso;
import com.example.repassesfinanceiros.service.RepasseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/repasses")
@Validated
public class RepasseController {

    @Autowired
    private RepasseService repasseService;

    @PostMapping
    public ResponseEntity<Repasse> createRepasse(@Valid @RequestBody Repasse repasse) {
        Repasse createdRepasse = repasseService.createRepasse(repasse);
        return new ResponseEntity<>(createdRepasse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Repasse> getAllRepasses() {
        return repasseService.getAllRepasses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Repasse> getRepasseById(@PathVariable Long id) {
        Optional<Repasse> repasse = repasseService.getRepasseById(id);
        return repasse.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Repasse> updateRepasse(@PathVariable Long id, @Valid @RequestBody Repasse repasseDetails) {
        Repasse updatedRepasse = repasseService.updateRepasse(id, repasseDetails);
        return ResponseEntity.ok(updatedRepasse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRepasse(@PathVariable Long id) {
        repasseService.deleteRepasse(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/filter")
    public List<Repasse> getRepassesByTipo(@RequestParam TipoRepasso tipoRepasso) {
        return repasseService.getRepassesByTipo(tipoRepasso);
    }
    
    
}

