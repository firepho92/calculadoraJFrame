/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class CalculadoraJFrame extends JFrame{
    private JButton suma, resta, multiplicacion, division, igual, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, parentesisAbierto, parentesisCerrado, CE, CH;
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JList<String> jList1;
    private JPanel jPanel1, jPanel2;
    private ArrayList arrayList1;
    DefaultListModel<String> model;
    JScrollPane jScrollPane1;
    ClearHistoryButtonHandler clearHistoryButtonHandler;
    ClearButtonHandler clearButtonHandler;
    KeyHandler keyHandler1;
    ButtonHandler buttonHandler1;
    ListHandler listHandler1;
    
    private void initialize(){
        arrayList1 = new ArrayList();
        
        jLabel1 = new JLabel("");
        jPanel1 = new JPanel(new BorderLayout());
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
        
        CE = new JButton("CE");
        CH = new JButton("CH");
        
        jTextField1 = new JTextField("");
        
        model = new DefaultListModel<>();
        jList1 = new JList<>(model);
        jScrollPane1 = new JScrollPane(jList1);
        
        buttonHandler1 = new ButtonHandler(jTextField1, jList1, model, arrayList1);
        listHandler1 = new ListHandler(jTextField1, model, jList1);
        clearButtonHandler = new ClearButtonHandler(jTextField1);
        clearHistoryButtonHandler = new ClearHistoryButtonHandler(arrayList1, model, jTextField1);
    }
    
    private void add(){
               
        jPanel2.add(parentesisAbierto);
        jPanel2.add(parentesisCerrado);
        jPanel2.add(punto);
        jPanel2.add(suma);
        jPanel2.add(uno);
        jPanel2.add(dos);
        jPanel2.add(tres);
        jPanel2.add(resta);
        jPanel2.add(cuatro);
        jPanel2.add(cinco);
        jPanel2.add(seis);
        jPanel2.add(multiplicacion);
        jPanel2.add(siete);
        jPanel2.add(ocho);
        jPanel2.add(nueve);
        jPanel2.add(division);
        jPanel2.add(cero);
        jPanel2.add(igual);
        jPanel2.add(CE);
        jPanel2.add(CH);
                
        jPanel1.add(jTextField1, BorderLayout.NORTH);
        jPanel1.add(jList1, BorderLayout.CENTER);
        jPanel1.add(jScrollPane1, BorderLayout.CENTER);
        jScrollPane1.getViewport().add(jList1);
        jPanel1.add(jPanel2, BorderLayout.SOUTH);
        
        add(jPanel1);
        
    }
    
    private void addEvents(){
        CH.addActionListener((ActionListener) clearHistoryButtonHandler);
        CE.addActionListener((ActionListener) clearButtonHandler);
        suma.addActionListener((ActionListener) new KeyHandler('+', jTextField1));
        resta.addActionListener((ActionListener) new KeyHandler('-', jTextField1));
        multiplicacion.addActionListener((ActionListener) new KeyHandler('*', jTextField1));
        division.addActionListener((ActionListener) new KeyHandler('/', jTextField1));
        punto.addActionListener((ActionListener) new KeyHandler('.', jTextField1));
        parentesisAbierto.addActionListener((ActionListener) new KeyHandler('(', jTextField1));
        parentesisCerrado.addActionListener((ActionListener) new KeyHandler(')', jTextField1));
        uno.addActionListener((ActionListener) new KeyHandler('1', jTextField1));
        dos.addActionListener((ActionListener) new KeyHandler('2', jTextField1));
        tres.addActionListener((ActionListener) new KeyHandler('3', jTextField1));
        cuatro.addActionListener((ActionListener) new KeyHandler('4', jTextField1));
        cinco.addActionListener((ActionListener) new KeyHandler('5', jTextField1));
        seis.addActionListener((ActionListener) new KeyHandler('6', jTextField1));
        siete.addActionListener((ActionListener) new KeyHandler('7', jTextField1));
        ocho.addActionListener((ActionListener) new KeyHandler('8', jTextField1));
        nueve.addActionListener((ActionListener) new KeyHandler('9', jTextField1));
        cero.addActionListener((ActionListener) new KeyHandler('0', jTextField1));
        jTextField1.addActionListener((ActionListener) buttonHandler1);
        igual.addActionListener((ActionListener) buttonHandler1);
        jList1.addMouseListener((MouseListener)listHandler1);
    }
    
    private void readHistory(){
        buttonHandler1.readHistory();
    }
    
    public CalculadoraJFrame(){
        super("Calculadora");
        initialize();
        add();
        addEvents();
        pack();
        setVisible(true);
        
        readHistory();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraJFrame calc = new CalculadoraJFrame();
    }
    
}
