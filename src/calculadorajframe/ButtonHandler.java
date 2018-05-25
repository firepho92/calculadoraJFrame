/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class ButtonHandler implements ActionListener {
    private JTextField jTextField1;
    private DefaultListModel<String> model;
    private JList<String> l;
    private ArrayList al;
	
    public ButtonHandler (JTextField jTextField1, JList l, DefaultListModel model, ArrayList al){
        this.jTextField1 = jTextField1;
        this.l = l;
        this.model = model;
        this.al = al;
    }
    
    public void readHistory(){
        try {
            FileInput fi = new FileInput();
            al = fi.Read();
            model.clear();
            al.forEach((o) -> {
                model.addElement((String) o);
            });
        } catch (FileNotFoundException ex) {
            jTextField1.setText("Historial no encontrado");
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jTextField1.setText("");
                    }
                }, 
                2000 
            );
        } catch(IOException ex) {
            jTextField1.setText("Error de escritura");
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jTextField1.setText("");
                    }
                }, 
                2000 
            );
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = jTextField1.getText(), response;
        if((response = ExpEval.eval(str)) != null){
            jTextField1.setText(response);
            try {
                FileOutput.Write(str);
            } catch (IOException ex) {
                Logger.getLogger(ButtonHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            readHistory();
            l.setVisible(true);
        }else{
            jTextField1.setText("Ingresa una expresión válida");
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jTextField1.setText("");
                    }
                }, 
                2000 
            );
        }
    }
}
