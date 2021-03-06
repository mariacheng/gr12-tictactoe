import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tictac implements ActionListener{
  //Properties
  public JButton but1;
  public JButton but2;
  public JButton but3;
  public JButton but4;
  public JButton but5;
  public JButton but6;
  public JButton but7;
  public JButton but8;
  public JButton but9;
  public JFrame theframe;
  public JPanel thepanel;
  public String strTurn = "X";
  public JButton reset;
  public boolean win = false;
  public int intCount = 0;
  //Methods
  public void actionPerformed(ActionEvent evt){
    intCount++;
    if(evt.getSource() == but1){
      but1.setText(strTurn);
      but1.setEnabled(false);
    }else if(evt.getSource() == but2){
      but2.setText(strTurn);
      but2.setEnabled(false);
    }else if(evt.getSource() == but3){
      but3.setText(strTurn);
      but3.setEnabled(false);
    }else if(evt.getSource() == but4){
      but4.setText(strTurn);
      but4.setEnabled(false);
    }else if(evt.getSource() == but5){
      but5.setText(strTurn);
      but5.setEnabled(false);
    }else if(evt.getSource() == but6){
      but6.setText(strTurn);
      but6.setEnabled(false);
    }else if(evt.getSource() == but7){
      but7.setText(strTurn);
      but7.setEnabled(false);
    }else if(evt.getSource() == but8){
      but8.setText(strTurn);
      but8.setEnabled(false);
    }else if(evt.getSource() == but9){
      but9.setText(strTurn);
      but9.setEnabled(false);
    }
    if(strTurn.equals("X")){
      strTurn = "O";
    }else{
      strTurn = "X";
    }
    if(evt.getSource() == reset){
      but1.setText("");
      but1.setEnabled(true);
      but2.setText("");
      but2.setEnabled(true);
      but3.setText("");
      but3.setEnabled(true);
      but4.setText("");
      but4.setEnabled(true);
      but5.setText("");
      but5.setEnabled(true);
      but6.setText("");
      but6.setEnabled(true);
      but7.setText("");
      but7.setEnabled(true);
      but8.setText("");
      but8.setEnabled(true);
      but9.setText("");
      but9.setEnabled(true);
      strTurn = "X";
      intCount = 0;
    }
    //Horizontal
    if(but1.getText() == but2.getText() && but2.getText() == but3.getText() && but1.getText() != ""){
      win = true;
    }else if(but4.getText() == but5.getText() && but5.getText() == but6.getText() && but4.getText() != ""){
      win = true;
    } else if(but7.getText() == but8.getText() && but8.getText() == but9.getText() && but7.getText() != ""){
      win = true;
    }
    //Vertical
    else if(but1.getText() == but4.getText() && but4.getText() == but7.getText() && but1.getText() != ""){
      win = true;
    }else if(but2.getText() == but5.getText() && but5.getText() == but8.getText() && but2.getText() != ""){
      win = true;
    }else if(but3.getText() == but6.getText() && but6.getText() == but9.getText() && but3.getText() != ""){
      win = true;
    }
    //Diagonal
    else if(but1.getText() == but5.getText() && but5.getText() == but9.getText() && but1.getText() != ""){
      win = true;
    }else if(but3.getText() == but5.getText() && but5.getText() == but7.getText() && but3.getText() != ""){
      win = true;
    }else{
      win = false;
    }
    if(win == true){
      but1.setText("");
      but1.setEnabled(false);
      but2.setText("");
      but2.setEnabled(false);
      but3.setText("");
      but3.setEnabled(false);
      but4.setText("");
      but4.setEnabled(false);
      but5.setText("");
      but5.setEnabled(false);
      but6.setText("");
      but6.setEnabled(false);
      but7.setText("");
      but7.setEnabled(false);
      but8.setText("");
      but8.setEnabled(false);
      but9.setText("");
      but9.setEnabled(false);
      but4.setText("W");
      but5.setText("I");
      but6.setText("N");
    }else if(win == false && intCount == 9){
      but1.setText("");
      but1.setEnabled(false);
      but2.setText("");
      but2.setEnabled(false);
      but3.setText("");
      but3.setEnabled(false);
      but4.setText("");
      but4.setEnabled(false);
      but5.setText("");
      but5.setEnabled(false);
      but6.setText("");
      but6.setEnabled(false);
      but7.setText("");
      but7.setEnabled(false);
      but8.setText("");
      but8.setEnabled(false);
      but9.setText("");
      but9.setEnabled(false);
      but4.setText("T");
      but5.setText("I");
      but6.setText("E");
    }
  }
  //Constructor
  public tictac(){
    theframe = new JFrame("Tic Tac Toe");
    theframe.setSize(200, 275);
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    thepanel = new JPanel();
    thepanel.setLayout(null);
    theframe.setContentPane(thepanel);
    thepanel.setBackground(Color.GREEN);

    reset = new JButton("Reset");
    reset.setSize(100, 50);
    reset.setLocation(0, 175);
    reset.addActionListener(this);
    thepanel.add(reset);


    but1 = new JButton("");
    but1.setSize(50,50);
    but1.setLocation(0,0);
    but1.addActionListener(this);
    thepanel.add(but1);

    but2 = new JButton("");
    but2.setSize(50,50);
    but2.setLocation(50,0);
    but2.addActionListener(this);
    thepanel.add(but2);

    but3 = new JButton("");
    but3.setSize(50,50);
    but3.setLocation(100,0);
    but3.addActionListener(this);
    thepanel.add(but3);

    but4 = new JButton("");
    but4.setSize(50,50);
    but4.setLocation(0,50);
    but4.addActionListener(this);
    thepanel.add(but4);

    but5 = new JButton("");
    but5.setSize(50,50);
    but5.setLocation(50,50);
    but5.addActionListener(this);
    thepanel.add(but5);

    but6 = new JButton("");
    but6.setSize(50,50);
    but6.setLocation(100,50);
    but6.addActionListener(this);
    thepanel.add(but6);

    but7 = new JButton("");
    but7.setSize(50,50);
    but7.setLocation(0,100);
    but7.addActionListener(this);
    thepanel.add(but7);

    but8 = new JButton("");
    but8.setSize(50,50);
    but8.setLocation(50,100);
    but8.addActionListener(this);
    thepanel.add(but8);

    but9 = new JButton("");
    but9.setSize(50,50);
    but9.setLocation(100,100);
    but9.addActionListener(this);
    thepanel.add(but9);

    theframe.setVisible(true);
  }
  public static void main(String[]args){
    tictac thegame = new tictac();
  }
}
