/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class KeyHandler implements ActionListener{
    private char key;
    private JTextField jTextField1;
    
    public KeyHandler(char key, JTextField jTextField1){
        this.key = key;
        this.jTextField1 = jTextField1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = jTextField1.getText();
        str += key;
        jTextField1.setText(str);
    }
    
}
