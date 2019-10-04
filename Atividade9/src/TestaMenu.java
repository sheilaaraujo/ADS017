
import java.awt.Menu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17114290006
 */
public class TestaMenu {
    public static void main(String[] args) {
        JMenuItem menu1 = new JMenuItem();
        menu1.setText("item menu 1");
        JMenuItem menu2 = new JMenuItem();
        menu2.setText("Item menu 2");
        menu2.setEnabled(false);
        JMenu menu = new JMenu();
        menu.setText("Menu");
        menu.add(menu1);
        menu.add(menu2);
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        JFrame janela = new JFrame();
        
        
        janela.setJMenuBar(barraMenu);
        janela.setSize(800,600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        
    }
}
