import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    private static Comida carregarComidas() {
        Comida lasanha = new Comida("Lasanha", new ArrayList<>());
        Comida massa = new Comida("massa", new ArrayList<Comida>(Arrays.asList(lasanha)));
        Comida boloChocolate = new Comida("Bolo de Chocolate", new ArrayList<>());
        List<Comida> tiposComida = Arrays.asList(massa, boloChocolate);
        Comida comida = new Comida("", new ArrayList<Comida>(tiposComida));
        return comida;
    }

    public static void main(String args[]) {
        int jogoGourmet = 0;
        Comida comida = carregarComidas();

        while (jogoGourmet == 0) {
            jogoGourmet = Dialog.getShowConfirmDialog("Pense em um prato que gosta",
                    Constantes.JOGO_GOURMET);
            if (jogoGourmet == 0)
                Service.percorrer(comida);
        }

    }

}
