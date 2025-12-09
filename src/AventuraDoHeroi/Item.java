package AventuraDoHeroi;

public class Item {
    String nome;
    String descricao;
    String poder;

    public Item(String nome, String descricao, String poder) {
        this.nome = nome;
        this.descricao = descricao;
        this.poder = poder;
    }

    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
}
