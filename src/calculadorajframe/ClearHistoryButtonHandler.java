/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;


/**
 *
 * @author alex
 */
public class ClearHistoryButtonHandler implements ActionListener{
    private ArrayList arrayList1;
    private DefaultListModel<String> model;
    private JTextField jTextField1;
    
    public ClearHistoryButtonHandler(ArrayList arrayList1, DefaultListModel model, JTextField jTextField1){
        this.arrayList1 = arrayList1;
        this.model = model;
        this.jTextField1 = jTextField1;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FileOutput.ClearHistory();
            arrayList1.clear();
            model.clear();
            jTextField1.setText("Historial borrado");
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        jTextField1.setText("");
                    }
                }, 
                2000 
            );

            
        } catch (IOException ex) {
            System.out.println("Historial borrado");
        }
    }
    
}
