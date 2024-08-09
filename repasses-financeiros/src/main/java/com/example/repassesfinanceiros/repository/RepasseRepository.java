package com.example.repassesfinanceiros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.repassesfinanceiros.model.Repasse;
import com.example.repassesfinanceiros.model.TipoRepasso;

import java.util.List;

public interface RepasseRepository extends JpaRepository<Repasse, Long> {

    List<Repasse> findByTipoRepasso(@Param("tipoRepasso") TipoRepasso tipoRepasso);

    @Query("SELECT r FROM Repasse r ORDER BY r.dataVencimento ASC")
    List<Repasse> findAllOrderedByDataVencimento();
}
