package model;

public class Editora {
    private String nome;

    public Editora(String string) {
        this.nome = string;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString(){
        return "Ed. " + this.nome;
    }
}
