
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class FormularioCampoSelecao extends JFrame {
    
    JComboBox comboUf;
    JList listaMunicipio;
    String[] arrayUF;
    String[][] arrayMunicipio;
    
    public FormularioCampoSelecao() throws HeadlessException {
        arrayUF = new String[]{"DF", "GO"};
        arrayMunicipio = new String[][]{{"Brasília", "Taguatinga", "Sobradinho"}, {"Formosa", "Planaltina", "Valparaiso"}};
        comboUf = new JComboBox(arrayUF);
        listaMunicipio = new JList(arrayMunicipio[0]);
        listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        comboUf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaMunicipio.setListData(arrayMunicipio[comboUf.getSelectedIndex()]);
            }
        });
        JLabel rotuloUF = new JLabel("Seleciona Uf");
        JLabel rotuloMunicipio = new JLabel("Seleciona Municipio");
        JPanel painel = new JPanel();
        painel.add(rotuloUF);
        painel.add(comboUf);
        painel.add(rotuloMunicipio);
        painel.add(listaMunicipio);
        add(painel);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
