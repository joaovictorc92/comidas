import java.util.List;

public class Comida {
    private String nome;
    private List<Comida> subtipos;

    Comida(String nome, List<Comida> subtipos){
        this.nome = nome;
        this.subtipos = subtipos;
    }

    public String getNome() {
        return nome;
    }

    public List<Comida> getSubtipos() {
        return subtipos;
    }

    public void adicionaFilho(Comida subtipo){
        int tamanho = subtipos.size();
        int posicao = tamanho > 0 ? tamanho - 1 : 0;
        subtipos.add(posicao, subtipo);
    }

    public boolean naoTemSubtipos(){
        return subtipos.isEmpty();
    }
}
