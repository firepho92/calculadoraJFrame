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
public class ClearButtonHandler implements ActionListener{
    private JTextField jTextField1;
    
    public ClearButtonHandler(JTextField jTextField1){
        this.jTextField1 = jTextField1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField1.setText("");
    }
    
}
