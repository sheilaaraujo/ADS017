import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestaCaixaVerificação {
    static int qtdAssunto = 0;
    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Escolha um ou mais assuntos;");
        JLabel total = new JLabel("0 selecionado(s)");
          
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox caixaVerificacao = (JCheckBox) e.getSource();
                if(caixaVerificacao.isSelected()){
                    qtdAssunto++;
                }else{
                    qtdAssunto--;
                }
                if (qtdAssunto > 2){
                    qtdAssunto--;
                    caixaVerificacao.setSelected(false);
                
            }
                total.setText("" + qtdAssunto + " selecionado(s)");
        }
        };
        
        JCheckBox assuntoEsporte = new JCheckBox("Esporte");
        JCheckBox assuntoEconomia = new JCheckBox("Ecônomia");
        JCheckBox assuntoPolitica = new JCheckBox("Política");
        JCheckBox assuntoLazer = new JCheckBox("Lazer");
        JCheckBox assuntoReligiao = new JCheckBox("Religião");
        JCheckBox assuntoTecnologia = new JCheckBox("Tecnologia");
        
        assuntoEsporte.addActionListener(ouvinte);
        assuntoEconomia.addActionListener(ouvinte);
        assuntoPolitica.addActionListener(ouvinte);
        assuntoLazer.addActionListener(ouvinte);
        assuntoReligiao.addActionListener(ouvinte);
        assuntoTecnologia.addActionListener(ouvinte);

        GridLayout leiaute = new GridLayout(10, 5);
        JPanel painel = new JPanel(leiaute);
        painel.add(rotulo);
        painel.add(assuntoEsporte);
        painel.add(assuntoEconomia);
        painel.add(assuntoPolitica);
        painel.add(assuntoLazer);
        painel.add(assuntoReligiao);
        painel.add(assuntoTecnologia);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.add(total, BorderLayout.SOUTH);
        janela.setSize(600,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
}
    
}
