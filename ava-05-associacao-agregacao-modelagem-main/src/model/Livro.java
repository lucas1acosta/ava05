package model;

public class Livro {

    private final String titulo;
    private final Autor autor;
    private int ano;
    private Editora editora;

    public Livro(String string, Autor autor, int i, Editora editora) {
        this.titulo = string;
        this.autor = autor;
        this.ano = i;
        this.editora = editora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    public Editora getEditora() {
        return this.editora;
    }
    
    public String toString(){
        String temp = "";
        temp = this.autor.toString()+ ". " +this.titulo + ". "
        + this.editora.toString() + ", " + this.ano + ".";
        return temp;
    }
}
