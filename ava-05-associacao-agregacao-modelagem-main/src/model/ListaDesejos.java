package model;

import java.util.ArrayList;

public class ListaDesejos {

    private boolean publico;
    private String nome;
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    public ListaDesejos(String nome, boolean publico){
        this.nome = nome;
        this.publico = publico;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isPublica() {
        if(publico == true){
            return true;
        }else{
            return false;
        }
    }

    public void adicionar(Livro livro) {
        this.livros.add(livro);
    }

    public ArrayList getLivros() {
        return this.livros;
    }

    public Livro getLivro(int i) {
        if(i > livros.size() - 1){
            return null;
        }
        return this.livros.get(i);
    }

    public boolean isPrivada() {
        if(publico == false){
            return true;
        }else{
            return false;
        }
    }

    public int getQuantidade() {
        return this.livros.size();
    }

    public boolean isVazia() {
        return this.livros.isEmpty();
    }
    
}
