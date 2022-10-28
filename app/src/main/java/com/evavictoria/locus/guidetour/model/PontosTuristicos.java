package com.evavictoria.locus.guidetour.model;

import android.location.Geocoder;
import android.media.Image;

public class PontosTuristicos {

    String nome;
    String descricao;
    Image foto;
    Geocoder localizacao;
    CategoriaPontoTuristico categoria;


    public PontosTuristicos(String nome, String descricao, Image foto, Geocoder localizacao, CategoriaPontoTuristico categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.localizacao = localizacao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public Geocoder getLocalizacao() { return localizacao; }

    public void setLocalizacao(Geocoder localizacao) {
        this.localizacao = localizacao;
    }

    public CategoriaPontoTuristico getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPontoTuristico categoria) {
        this.categoria = categoria;
    }
}
