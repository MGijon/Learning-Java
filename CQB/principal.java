import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class principal{

  public static void main (String[] args){

    Operator oper = new Operator("test", 1, 100, 11.5, 90);
    /* creamos la ventana con nombre 'Scenario' */
    JFrame frame = new JFrame("Scenario");
    frame.setVisible(true);
    frame.setSize(750,750);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    /* JPanel */
    JPanel panel = new JPanel();
    frame.add(panel);

    /* Botón 1 */
    JButton button = new JButton("Add");
    panel.add(button);
    button.addActionListener (new Action1());

    /* Botón 2 */
    JButton button2 = new JButton("Configuration");
    panel.add(button2);
    button.addActionListener (new Action2());

    /* Botón 3 */
    JButton button3 = new JButton("Play");
    panel.add(button3);
    button.addActionListener (new Action3());
  }




  /*                                            */
  static class Action1 implements ActionListener {

    public void actionPerformed (ActionEvent e) {
      /* crea una nueva ventana */
      JFrame frame2 = new JFrame("Add");
      frame2.setVisible(true);
      frame2.setSize(200,200);

      /* Añadimos cosas en ella usando un panel y una etiqueta */
      JLabel label = new JLabel("adding shit");
      JPanel panel = new JPanel();

      frame2.add(panel);
      panel.add(label);
    }

  }

  static class Action2 implements ActionListener {

    public void actionPerformed (ActionEvent e) {
      /* crea una nueva ventana */
      JFrame frame3 = new JFrame("Configuration");
      frame3.setVisible(true);
      frame3.setSize(200,200);

      /* Añadimos cosas en ella usando un panel y una etiqueta */
      JLabel label = new JLabel("kabum kabum");
      JPanel panel = new JPanel();

      frame3.add(panel);
      panel.add(label);
    }

  }

  static class Action3 implements ActionListener {

    public void actionPerformed (ActionEvent e) {
      /* crea una nueva ventana */
      JFrame frame3 = new JFrame("Play window");
      frame3.setVisible(true);
      frame3.setSize(200,200);

      /* Añadimos cosas en ella usando un panel y una etiqueta */
      JLabel label = new JLabel("bla bla bla bla");
      JPanel panel = new JPanel();

      frame3.add(panel);
      panel.add(label);
    }

  }


}

/* javac main.java
   java main */
