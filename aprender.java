import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class aprender extends JFrame implements ActionListener  {
   private JButton bot1,bot2,bot3,bot4,bot5,bot6,bot7,bot8,bot9,bot0,botlimpar,botapagar,igual,soma,divi,multi,sub;
   private JTextField campo;
   private String a;
   private char operacao;
   private double num1, num2, resultado;
 public void Interface(){
  //Posicionando todos os componentes necessários  em nossa calculadora.
  campo = new JTextField();
  campo.setBounds(10,10,200,50);
  add(campo);
  bot1 = new JButton("1");
  bot1.setBounds(10,65,45,45);
  add(bot1);
  bot2 = new JButton("2");
  bot2.setBounds(60,65,45,45);
  add(bot2);
  bot3 = new JButton("3");
  bot3.setBounds(110,65,45,45);
  add(bot3);
  bot4 = new JButton("4");
  bot4.setBounds(10,115,45,45);
  add(bot4);
  bot5 = new JButton("5");
  bot5.setBounds(60,115,45,45);
  add(bot5);
  bot6 = new JButton("6");
  bot6.setBounds(110,115,45,45);
  add(bot6);
  bot7 = new JButton("7");
  bot7.setBounds(10,165,45,45);
  add(bot7);
  bot8 = new JButton("8");
  bot8.setBounds(60,165,45,45);
  add(bot8);
  bot9 = new JButton("9");
  bot9.setBounds(110,165,45,45);
  add(bot9);
  bot0 = new JButton("0");
  bot0.setBounds(160,165,45,45);
  add(bot0);
  botlimpar = new JButton("C");
  botlimpar.setBounds(160,65,45,45);
  botlimpar.setBackground(new Color(178,34,34));
  add(botlimpar);
  botapagar = new JButton("<");
  botapagar.setBounds(160,115,45,45);
  add(botapagar);
  soma = new JButton("+");
  soma.setBounds(10,215,45,45);
  add(soma);
  divi = new JButton("/");
  divi.setBounds(60,215,45,45);
  add(divi);
  multi = new JButton("x");
  multi.setBounds(110,215,45,45);
  add(multi);
  sub = new JButton("-");
  sub.setBounds(160,215,45,45);
  add(sub);
  igual = new JButton("=");
  igual.setBounds(60,265,90,50);
    add(igual);
 }
 public void InicioAcao(){
  //Adicionando o ActionListener em cada Botão.
  bot1.addActionListener(this);
  bot2.addActionListener(this);
  bot3.addActionListener(this);
  bot4.addActionListener(this);
  bot5.addActionListener(this);
  bot6.addActionListener(this);
  bot7.addActionListener(this);
  bot8.addActionListener(this);
  bot9.addActionListener(this);
  bot0.addActionListener(this);
  botlimpar.addActionListener(this);
  botapagar.addActionListener(this);
  soma.addActionListener(this);
  divi.addActionListener(this);
  multi.addActionListener(this);
  sub.addActionListener(this);
  igual.addActionListener(this);
 }
   public void actionPerformed(ActionEvent w) {
  //Colocando as funções de cada botão da calculadora
   if(w.getSource() == bot1){
   
         a = campo.getText();
         a = a + "1";
         campo.setText(a);
    
  }
  if(w.getSource() == bot2){
   
  a = campo.getText();
  a = a + "2";
  campo.setText(a);
  }
  if(w.getSource() == bot3){
   a =campo.getText();
   a = a + "3";
   campo.setText(a);
  }
  if(w.getSource() == bot4){
   a =campo.getText();
   a = a + "4";
   campo.setText(a);
  }
  if(w.getSource() == bot5){
   a =campo.getText();
   a = a + "5";
   campo.setText(a);
  }
  if(w.getSource()== bot6){
   a = campo.getText();
   a = a +"6";
   campo.setText(a);
  }
  if(w.getSource() == bot7){
   a = campo.getText();
   a = a +"7";
   campo.setText(a);
   }
  if(w.getSource()== bot8){
   a = campo.getText();
   a = a + "8";
   campo.setText(a);
   }
  if(w.getSource()== bot9){
   a = campo.getText();
   a = a + "9";
   campo.setText(a);
  }
  if(w.getSource()== bot0 ){
   a = campo.getText();
   a = a + "0";
   campo.setText(a);
  }
  if(w.getSource() == botlimpar){
   campo.setText("");
  }
  if(w.getSource()== botapagar){
   String teste = campo.getText();
   teste = teste.substring(0, teste.length() -1);
   campo.setText(teste);
  }
  //Botões das operações
  if(w.getSource() == soma){
   operacao = '+';
   num1 = Double.parseDouble(campo.getText());
   campo.setText("");
  }
  if(w.getSource() == divi){
   operacao = '/';
   num1 = Double.parseDouble(campo.getText());
   campo.setText("");
  }
  if(w.getSource() == multi){
   operacao = '*';
   num1 = Double.parseDouble(campo.getText());
   campo.setText("");
  }
  if(w.getSource() == sub){
   operacao = '-';
   num1 = Double.parseDouble(campo.getText());
   campo.setText("");
  }
  //Função do botão igual
  if(w.getSource() == igual){
   num2 = Double.parseDouble(campo.getText());
   switch(operacao){
   case '+':
    resultado = num1 + num2;
    break;
   case '-':
    resultado = num1 - num2;
    break;
   case '/':
    resultado = num1 / num2;
    break;
   case '*':
    resultado = num1 * num2;
    break;
   }
   campo.setText(String.valueOf(resultado));
  }
 }
 public static void  main(String[]ar){
  aprender novo = new aprender();
  novo.setLayout(null);
  novo.setTitle("Calculadora ");
  novo.Interface();
  novo.InicioAcao();
  novo.setSize(220,360);
  novo.setResizable(false);
  novo. setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  novo.setVisible(true);
 }
}


