package entities;

import java.util.Objects;

public abstract class Pessoa {

    private final String nome;

    public Pessoa(String nome) {
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularImposto();
}
