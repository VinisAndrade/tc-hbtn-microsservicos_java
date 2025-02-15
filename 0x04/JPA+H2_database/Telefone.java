package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String DDD;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Getters e Setters
}
