import java.util.ArrayList;
import java.util.Arrays;

public class Service {

    public static void percorrer(Comida comida) {

        Comida ultimaComida = null;

        for (Comida c : comida.getSubtipos()) {
            int resposta = Dialog.getConfirmOption(c, Constantes.OPTIONS_SIM_NAO);
            if (resposta == 0) {
                if (c.naoTemSubtipos()) {
                    Dialog.showMessage("Acertei de novo", Constantes.JOGO_GOURMET);
                } else {
                    percorrer(c);
                }
                return;
            }
            ultimaComida = c;
        }
        String prato = Dialog.getInputDialog("Qual prato você pensou?");
        String tipoPrato = Dialog.getInputDialog(String.format("%s é _____ mas %s não.", prato, ultimaComida.getNome()));

        adicionaNovoPrato(comida, prato, tipoPrato);

    }

    private static void adicionaNovoPrato(Comida comida, String prato, String tipoPrato) {
        Comida comidaPrato = new Comida(prato, new ArrayList<>());
        Comida comidaTipoPrato = new Comida(tipoPrato, new ArrayList<Comida>(Arrays.asList(comidaPrato)));
        comida.adicionaFilho(comidaTipoPrato);
    }
}
