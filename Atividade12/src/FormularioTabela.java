import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class FormularioTabela extends JFrame{
    private JTextField campoFiltro;
    private JButton botaoFiltrar;
    private JButton botaoLimpar;
    private JTable tabela;
    private String[][] arrayDados;
    private String [] arrayColunas;
    private JLabel rotuloFiltrar;
    
     public FormularioTabela() throws HeadlessException {
           arrayDados = new String[][] {
               {"2015001", "Pedro", "joao@iesb.br"},
               {"2015002", "Sara", "ana@iesb.br"},
               {"2015003", "Andre", "duda@iesb.br"},
               {"2015004", "Sheila", "bianca@iesb.br"},
               {"2015005", "Arthur", "arthur@iesb.br"}
           
           };
           arrayColunas = new String[] {"Matrícula", "Nome", "E-mail"};
           botaoFiltrar = new JButton("Filtrar");
           botaoLimpar = new JButton("Limpar");
           campoFiltro = new JTextField(20);
           rotuloFiltrar = new JLabel("Informe um nome:");
           DefaultTableModel modelo =
                   new DefaultTableModel(arrayDados, arrayColunas);
           tabela = new JTable(modelo);
           JScrollPane rolagem = new JScrollPane();
           rolagem.setViewportView(tabela);
           JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
           painel.add(rotuloFiltrar);
           painel.add(botaoLimpar);
           painel.add(campoFiltro);
           painel.add(botaoFiltrar);
           
           botaoLimpar.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   DefaultTableModel modelo = 
                           new DefaultTableModel(arrayDados, arrayColunas);
                   tabela.setModel(modelo);
               }
           });
           
           botaoFiltrar.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   DefaultTableModel modelo = 
                           (DefaultTableModel) tabela.getModel();
                   modelo.setNumRows(0);
                   for (String[] linha : arrayDados) {
                       if (linha[1].contains(campoFiltro.getText()))
                           modelo.addRow(linha);
                   }
               }
           });
           add(painel, BorderLayout.NORTH);
           add(rolagem);
           setSize(640, 480);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}