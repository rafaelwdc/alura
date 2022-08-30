package br.com.alura.agenda.model;

import androidx.annotation.NonNull;

public class Aluno {
    private String nome;
    private String telefone;
    private String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
