
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17114290006
 */
public class Janela extends JFrame {
    private JMenuBar barraMenu;
    private JMenu menuArquivo;
    private JMenu menuAjuda;
    private JMenuItem menuArquivoSair;
    private JMenuItem menuAjudaSobre;

    public Janela() throws HeadlessException {
        barraMenu=new JMenuBar();
        menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('J');
        menuArquivoSair = new JMenuItem("Sair");
        menuArquivoSair.setMnemonic('R');
        menuArquivoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
        });
        menuAjudaSobre = new JMenuItem("Sobre");
        menuAjudaSobre.setMnemonic('S');
        menuAjudaSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplicação 1.0");
            }
        });
        menuArquivo.add(menuArquivoSair);
        menuAjuda.add(menuAjudaSobre);
        barraMenu.add(menuArquivo);
        barraMenu.add(menuAjuda);
        setJMenuBar(barraMenu);
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        




        
    }
    
    
}
