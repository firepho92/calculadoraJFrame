/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class CalculadoraJFrame extends JFrame{
    private JButton suma, resta, multiplicacion, division, igual, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, parentesisAbierto, parentesisCerrado;
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JList jList1;
    private JPanel jPanel1, jPanel2;
    
    private void initialize(){
        jPanel2 = new JPanel(new GridLayout(5, 4));
        
        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("*");
        division = new JButton("/");
        igual = new JButton("=");
        punto = new JButton(".");
        parentesisAbierto = new JButton("(");
        parentesisCerrado = new JButton(")");
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        cero = new JButton("0");
        
        jPanel1 = new JPanel(new BorderLayout());
        
        jTextField1 = new JTextField("");
        
        jList1 = new JList();
        
    }
    
    private void add(){
        jPanel2.add(parentesisAbierto);
        jPanel2.add(parentesisCerrado);
        jPanel2.add(punto);
        jPanel2.add(division);
        jPanel2.add(uno);
        jPanel2.add(dos);
        jPanel2.add(tres);
        jPanel2.add(suma);
        jPanel2.add(cuatro);
        jPanel2.add(cinco);
        jPanel2.add(seis);
        jPanel2.add(resta);
        jPanel2.add(siete);
        jPanel2.add(ocho);
        jPanel2.add(nueve);
        jPanel2.add(multiplicacion);
        jPanel2.add(cero);
        jPanel1.add(jTextField1, BorderLayout.NORTH);
        jPanel1.add(jList1, BorderLayout.CENTER);
        jPanel1.add(punto, BorderLayout.SOUTH);
    }
    
    private void addEvents(){
        
    }
    
    public CalculadoraJFrame(){
        super("Calculadora");
        initialize();
        add();
        //addEvents();
        pack();
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraJFrame calc = new CalculadoraJFrame();
    }
    
}
