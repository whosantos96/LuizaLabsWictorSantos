package com.example.repassesfinanceiros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
public class Repasse {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoRepasso tipoRepasso;

    @Positive
    @NotNull
    private Double valor;

    @Future
    @NotNull
    private LocalDateTime dataVencimento;

    @Enumerated(EnumType.STRING)
    @NotNull
    private FormaPagamento formaPagamento;

    @Enumerated(EnumType.STRING)
    @NotNull
    private SistemaOrigem sistemaOrigem;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    
    public Repasse() {
    	
    }
    
	public Repasse(Long id, @NotNull TipoRepasso tipoRepasso, @Positive @NotNull Double valor,
			@Future @NotNull LocalDateTime dataVencimento, @NotNull FormaPagamento formaPagamento,
			@NotNull SistemaOrigem sistemaOrigem, LocalDateTime dataCriacao, LocalDateTime dataAtualizacao) {
		super();
		this.id = id;
		this.tipoRepasso = tipoRepasso;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.formaPagamento = formaPagamento;
		this.sistemaOrigem = sistemaOrigem;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}

	 // Getters e Setters

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public TipoRepasso getTipoRepasso() {
		return tipoRepasso;
	}



	public void setTipoRepasso(TipoRepasso tipoRepasso) {
		this.tipoRepasso = tipoRepasso;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}



	public void setDataVencimento(LocalDateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}



	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}



	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}



	public SistemaOrigem getSistemaOrigem() {
		return sistemaOrigem;
	}



	public void setSistemaOrigem(SistemaOrigem sistemaOrigem) {
		this.sistemaOrigem = sistemaOrigem;
	}



	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}



	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}



	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}



	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
    
    
	

   
}

