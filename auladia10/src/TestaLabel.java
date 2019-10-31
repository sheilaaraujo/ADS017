import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class TestaLabel {
    public static void main(String[] args) {
       
        JLabel rotulo = new JLabel();   //Rótulo
        rotulo.setText("Um texto não editável");
        rotulo.setToolTipText("Esta é a dica"); //Caixa de dialogo escondida
       
        JPanel painel = new JPanel();
        painel.add(rotulo); //Divide por linha e centraliza
       
        JMenuItem menuArquivoNovo = new JMenuItem("Novo...");
        JMenuItem menuArquivoSalvar = new JMenuItem("Salvar");
        JMenuItem menuArquivoSair = new JMenuItem("Sair");
       
        JMenu menuArquivo = new JMenu("Arquivo");   //Opções do menu
        menuArquivo.setMnemonic ('a');  //Atalhos com ALT
        menuArquivo.add(menuArquivoNovo);
        menuArquivo.add(menuArquivoSalvar);
        menuArquivo.add(menuArquivoSair);
       
        JMenu menuEditar = new JMenu("Editar"); //Opções do menu
        menuEditar.setMnemonic ('e');//Atalhos com ALT
        JMenu menuAjuda = new JMenu("Ajuda");   //Opções do menu
        menuAjuda.setMnemonic ('j');//Atalhos com ALT'
       
       
        JMenuBar barraMenu = new JMenuBar();    //Barra de menu
        barraMenu.add(menuArquivo); //Adição das opções no menu
        barraMenu.add(menuEditar);  //Adição das opções no menu
        barraMenu.add(menuAjuda);   //Adição das opções no menu
       
       
       
       
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setJMenuBar(barraMenu);
        janela.setSize(600, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
   
}