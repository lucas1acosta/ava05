package model;

public class Autor {

    private final String nome;
    private final String sobrenome;

    public Autor(String sobrenome, String nome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        String temp = this.nome + " " + this.sobrenome;
        return temp;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString(){
        String temp = this.sobrenome + ", " + this.nome;
        return temp;
    }
    
}
