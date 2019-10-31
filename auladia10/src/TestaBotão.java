import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class TestaBotão {
    
    public static void main(String[] args) {
        JButton ok = new JButton();
        ok.setText("Ok");
        JButton cancelar = new JButton("Cancelar"); //setText
        cancelar.setMnemonic('C'); //Atalhos
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
               

            }
        });
       
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painel.add(ok);
        painel.add(cancelar);
       
        JFrame janela = new JFrame();
        janela.add(painel,BorderLayout.SOUTH);
        janela.setSize(600,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
   
}