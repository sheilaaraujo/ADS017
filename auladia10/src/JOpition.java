import javax.swing.JOptionPane;

public class JOpition {
   
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "Olá pessoal!");
        String matricula = JOptionPane.showInputDialog("Entre com a sua matricula");
        int opcao = JOptionPane.showConfirmDialog(null, "Sua matricula é essa " + matricula + "?", "Pergunta", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showConfirmDialog(null, "Voce digitou errado", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Voce escolheu" + opcao);
       
        JOptionPane.showConfirmDialog(null, "Deu ruim", "Erro", JOptionPane.ERROR_MESSAGE);
    }

   
}