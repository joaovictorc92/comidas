import javax.swing.*;

public class Dialog {
    public static String getInputDialog(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public static int getConfirmOption(Comida c, Object[] options) {

        return JOptionPane.showOptionDialog(null,
                String.format("O prato que você pensou é %s?", c.getNome()),
                "confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }

    public static void showMessage(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null,
                mensagem,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }

    public static int getShowConfirmDialog(String mensagem, String titulo) {
        return JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
    }
}
