package com.empresa.model;

import java.time.LocalDate;

public class Usuario {
    private Long id;
    private String nome;
    private LocalDate nacimiento; // Data de nascimento do usuário.

    // Construtor padrão (obrigatório para o Jackson converter JSON em Objeto)
    public Usuario() {
    }

    public Usuario(Long id, String nome, LocalDate nacimiento) {
        this.id = id;
        this.nome = nome;
        this.nacimiento = nacimiento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}