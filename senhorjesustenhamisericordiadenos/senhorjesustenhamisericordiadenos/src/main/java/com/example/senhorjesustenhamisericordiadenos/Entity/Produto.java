package com.example.senhorjesustenhamisericordiadenos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double precoDeCompra;
    private Double precoDeVenda;
    private String fornecedor;
    private String status;

    public Produto(Double precoDeCompra) {

    }

    public void setId(Long id) {
        
    }
}