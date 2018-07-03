//quiz

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Aprender extends JFrame implements ChangeListener  {
 private JRadioButton rt1, rt2, rt3 , rs1,rs2,rs3,a1,a2,a3;
 private ButtonGroup qt1,qt2,qt3;
    private JLabel texto, texto2,texto3;
    private JButton botao;
public void Inicio (){
 setLayout(null);
 texto = new JLabel("Desses nomes abaixo. Qual você gosta mais?");
 texto.setBounds(10,10,400,30);
    add(texto);
    qt1 = new ButtonGroup();
    rt1 = new JRadioButton("Millenium Falcon");
    rt1.setBounds(10,40,150,30);
    add(rt1);
    qt1.add(rt1);
    rt2 = new JRadioButton("Enterprise");
    rt2.setBounds(10,70,100,30);
    add(rt2);
    qt1.add(rt2);
    rt3 = new JRadioButton("Astronautas");
    rt3.setBounds(10,100,120,30);
    add(rt3);
    qt1.add(rt3);
    //=========================================
    texto2 = new JLabel("Qual é o melhor gênero de filme do mundo?");
    texto2.setBounds(10,140,400,30);
    add(texto2);
    qt2 = new ButtonGroup();
    rs1 = new JRadioButton("Fantasia");
    rs1.setBounds(10,170,100,30);
    add(rs1);
    qt2.add(rs1);
    rs2 = new JRadioButton("Ficção científica");
    rs2.setBounds(10,200,200,30);
    add(rs2);
    qt2.add(rs2);
    rs3 = new JRadioButton("Ficção mais próxima da atual realidade");
    rs3.setBounds(10,230,350,30);
    add(rs3);
    qt2.add(rs3);
    //=========================================
    texto3 = new JLabel ("Qual é o melhor personagem do mundo?");
    texto3.setBounds(10,260,400,30);
    add(texto3);
    qt3 = new ButtonGroup();
    a1 = new JRadioButton("ObiWanKenobi");
    a1.setBounds(10,290,150,30);
    add(a1);
    qt3.add(a1);
    a2 = new JRadioButton("Spock");
    a2.setBounds(10,320,100,30);
    add(a2);
    qt3.add(a2);
    a3 = new JRadioButton("Tars");
    a3.setBounds(10,350,100,30);
    add(a3);
    qt3.add(a3);
    //=====================================
    botao = new JButton("Eu gosto");
    botao.setBounds(10,380,120,30);
    add(botao);
    //=====================================
    rt1.addChangeListener(this);
    rt2.addChangeListener(this);
    rt3.addChangeListener(this);
    rs1.addChangeListener(this);
    rs2.addChangeListener(this);
    rs3.addChangeListener(this);
    a1.addChangeListener(this);
    a2.addChangeListener(this);
    a3.addChangeListener(this);
    botao.addActionListener( new ActionListener(){
     public void actionPerformed(ActionEvent w){
           if(rt1.isSelected() && rs1.isSelected() && a1.isSelected()){
           JOptionPane.showMessageDialog(null, "Você gosta mais de Star Wars");
           }
           if(rt2.isSelected() && rs2.isSelected() && a2.isSelected()){
           JOptionPane.showMessageDialog(null, "Você gosta mais de Star Trek");
           }
           if(rt3.isSelected() && rs3.isSelected() && a3.isSelected()){
           JOptionPane.showMessageDialog(null, "Você gosta mais de Interestelar");
           }
           if(rt1.isSelected() && rs2.isSelected() && a2.isSelected()){
           JOptionPane.showMessageDialog(null, "Você gosta mais de Star Trek");
           }
           if(rt1.isSelected() && rs2.isSelected() && a3.isSelected()){
           JOptionPane.showMessageDialog(null, "Você deve gostar mais de Interestelar");
           }
           if(rt2.isSelected() && rs1.isSelected() && a1.isSelected()){
           JOptionPane.showMessageDialog(null, "Você deve gostar mais de Star Wars");
           }
           if(rt2.isSelected() && rs2.isSelected() && a1.isSelected() ){
           JOptionPane.showMessageDialog(null, "Você deve gostar mais de Star Trek");
           }
           // é por assim vai...
     }
    });
}
public void stateChanged(ChangeEvent w){
         }
   
public static void main(String[] ar){
 Aprender aprender = new Aprender();
 aprender.Inicio();
 aprender.setSize(400,460);
 aprender.setResizable(false);
 aprender.setDefaultCloseOperation(EXIT_ON_CLOSE);
 aprender.setVisible(true);
   
}
}
