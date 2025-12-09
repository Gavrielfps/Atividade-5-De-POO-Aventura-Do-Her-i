package AventuraDoHeroi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Heroi {
    private String nome;
    private int nivelForca;
    private int nivelVida;
    private ArrayList<Ferramenta>  Ferramentas = new ArrayList<Ferramenta>();
    private Map<String, Item> bolsa = new HashMap<>();

    public Heroi(String nome, int nivelForca, int nivelVida){
        this.nome = nome;
        this.nivelForca = nivelForca;
        this.nivelVida = nivelVida;
        this.Ferramentas = new ArrayList<>();
        this.bolsa = new HashMap<>();
    }

    public void adicionaFerramenta(Ferramenta ferramenta){
        this.Ferramentas.add(ferramenta);
        System.out.println(this.nome + " adquiriu a ferramenta:" + ferramenta.getNome() + " com sucesso!");
    }

    public void adicionaItem(String chave, Item item){
        this.bolsa.put(chave, item);
        System.out.println(this.nome + " guardou item: " + item.getNome() + " com a chave: " + chave);
    }

    public void removerItem(String chave){
        if(this.bolsa.containsKey(chave)){
            Item itemRemovido = this.bolsa.remove(chave);
            System.out.println(this.nome + " removeu o item: " + itemRemovido.getNome());
        } else {
            System.out.println("Não foi possível encontrar o item com a chave " + chave);
        }
    }
}
