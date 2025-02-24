package models;

public class Pessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
