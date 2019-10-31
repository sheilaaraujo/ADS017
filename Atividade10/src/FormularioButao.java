
import javafx.scene.control.CheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17114290006
 */
public class FormularioButao extends JFrame {
  JButton botaoSavar =  new JButton("Salvar");
  JButton botaoFechar = new JButton("Fechar");
  
  CheckBox checkCursoAds = new CheckBox("Análise e Desenvolvimento de Sistemas"); 
  CheckBox checkCursoSegInf = new CheckBox("Segurança da Informação"); 
  CheckBox checkCursoJogos = new CheckBox("Jogos Digitais"); 
  CheckBox checkCursoRedes= new CheckBox(); 
 
  JRadioButton  radioBolsaIntegral100 = new JRadioButton();
  JRadioButton  radioBolsaParcial75 =new JRadioButton();
  JRadioButton  radioBolsaParcial50 =new JRadioButton();
  JRadioButton  radioBolsaParcial25  =new JRadioButton();
  JRadioButton  radioSemBolsa  =new JRadioButton();

   
}
