package com.iftm.trabalho04.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "imoveis")
public class Imovel implements Serializable {
    @Id
    private String id;
    private String endereco;
    private String tipo;
    private String area;
    private String preco;

    public Imovel() {
    }

    public Imovel(String endereco, String tipo, String area, String preco) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.area = area;
        this.preco = preco;
    }

    public Imovel(String id, String endereco, String tipo, String area, String preco) {
        this.id = id;
        this.endereco = endereco;
        this.tipo = tipo;
        this.area = area;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Imovel [id=" + id + ", endereco=" + endereco + ", tipo=" + tipo + ", area=" + area + ", preco=" + preco
                + "]";
    }

    
    
}
