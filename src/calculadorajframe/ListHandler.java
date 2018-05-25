/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class ListHandler implements MouseListener {
    private JTextField display;
    private DefaultListModel model;
    private JList JList1;
    
    public ListHandler(JTextField display, DefaultListModel model, JList JList1){
        this.display = display;
        this.model = model;
        this.JList1 = JList1;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getClickCount() == 2){
            display.setText((String)model.getElementAt(JList1.getSelectedIndex()));
        }
    }
    
    public void mouseExited(MouseEvent e){
        
    }
    
    public void mouseEntered(MouseEvent e){
        
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    public void mousePressed(MouseEvent e){
        
    }
}
