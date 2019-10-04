
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17114290006
 */
public class TestaRotulo {
    public static void main(String[] args) {
        JLabel rotulo = new JLabel();
        rotulo.setText("Este rótulo está ativo");
        rotulo.setToolTipText("rotulo1");
        
        JLabel rotulo2 = new JLabel();
        rotulo2.setText("Este rótulo está inativo");
        rotulo2.setToolTipText("rotulo2");
        rotulo2.setEnabled(false);
        
        JFrame janela = new JFrame();
        janela.add(rotulo,BorderLayout.NORTH);
        janela.add(rotulo2,BorderLayout.SOUTH);
        janela.setSize(800,600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
    }
  
}
