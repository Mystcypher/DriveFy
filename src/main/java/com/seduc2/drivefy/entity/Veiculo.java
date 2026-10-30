package com.seduc2.drivefy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String modelo;
    private String tipoveiculo;
    private String marca;
    private Cambio cambio;
    private LocalDate dataFabricacao;
    private double quilometragem;
    private String cor;
    private StatusRevisao revisao;
    private boolean blindado;
    private String observacoes;

    public Veiculo() {}

    public Veiculo(String modelo, String tipoveiculo, String marca, Cambio cambio, LocalDate dataFabricacao, double quilometragem, String cor, StatusRevisao revisao, boolean blindado, String observacoes) {
        this.modelo = modelo;
        this.tipoveiculo = tipoveiculo;
        this.marca = marca;
        this.cambio = cambio;
        this.dataFabricacao = dataFabricacao;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.revisao = revisao;
        this.blindado = blindado;
        this.observacoes = observacoes;
    }

    public Veiculo(long id, String modelo, String tipoveiculo, String marca, Cambio cambio, LocalDate dataFabricacao, double quilometragem, String cor, StatusRevisao revisao, boolean blindado, String observacoes) {
        this.id = id;
        this.modelo = modelo;
        this.tipoveiculo = tipoveiculo;
        this.marca = marca;
        this.cambio = cambio;
        this.dataFabricacao = dataFabricacao;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.revisao = revisao;
        this.blindado = blindado;
        this.observacoes = observacoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoveiculo() {
        return tipoveiculo;
    }

    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public StatusRevisao getRevisao() {
        return revisao;
    }

    public void setRevisao(StatusRevisao revisao) {
        this.revisao = revisao;
    }

    public boolean isBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
