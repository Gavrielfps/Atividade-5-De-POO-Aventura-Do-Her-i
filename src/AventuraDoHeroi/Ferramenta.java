package AventuraDoHeroi;

public class Ferramenta {
        String nome;
        String descricao;
        int nivelForca;

        public Ferramenta(String nome, int nivelForca){
            this.nome = nome;
            this.nivelForca = nivelForca;
            this.descricao = descricao;
        }

        public String getNome(){
            return nome;
        }
        public String getDescricao(){
            return descricao;
        }
    }