package model;

import java.util.ArrayList;

public class Perfil {

    private String nome;
    private ArrayList<ListaDesejos> listasDesejos = new ArrayList<ListaDesejos>();
    
    public Perfil(String string) {
        this.nome = string;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<ListaDesejos> getListasDeDesejos() {
        return this.listasDesejos;
    }

    public ListaDesejos novaListaDesejos(String string, boolean b) {
        ListaDesejos temp1 = new ListaDesejos(string, b);
        listasDesejos.add(temp1);
        return temp1;
    }

    public ListaDesejos getListaDeDesejos(String string) {
        for (ListaDesejos listaDesejos : listasDesejos) {
            if(string.equals(listaDesejos.getNome())){
                return listaDesejos;
            }
        }
        return null;
    }

    public ListaDesejos getListaDeDesejos(int i) {
        if(i > listasDesejos.size() - 1){
            return null;
        }
        return listasDesejos.get(i);
    }

    public ListaDesejos getListaDesejos(String string) {
        for (ListaDesejos listaDesejos : listasDesejos) {
            if(string.equals(listaDesejos.getNome())){
                return listaDesejos;
            }
        }
        return null;
    }

    public ListaDesejos getListaDesejos(int i) {
        if(i > listasDesejos.size() - 1){
            return null;
        }
        return listasDesejos.get(i);    
    }

    
}
