import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TestaRadio {
    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Escolha uma titulação");
        
        JRadioButton radioNivelMedio = new JRadioButton("Nível Médio");
        JRadioButton radioNivelSuperior = new JRadioButton("Nível Superior");
        JRadioButton radioNivelEspecialista = new JRadioButton("Nível Especialista");
        JRadioButton radioNivelMestre = new JRadioButton("Nível Meste");
        JRadioButton radioNivelDoutor = new JRadioButton("Nível Doutor");
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioNivelMedio); 
        grupo.add(radioNivelSuperior);
        grupo.add(radioNivelEspecialista);
        grupo.add(radioNivelMestre);
        grupo.add(radioNivelDoutor);
        
        
        JPanel painel = new JPanel( new GridLayout(10,5));
        painel.add(rotulo);
        painel.add(radioNivelMedio);
        painel.add(radioNivelSuperior);
        painel.add(radioNivelEspecialista);
        painel.add(radioNivelMestre);
        painel.add(radioNivelDoutor);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
}
    
}
