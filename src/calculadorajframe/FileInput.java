/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajframe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class FileInput {
    private ArrayList al;
    
    public ArrayList Read() throws FileNotFoundException{
        al = new ArrayList();
        File f = new File("Historial");
        Scanner s =  new Scanner(f);
        s.useDelimiter("\n");

        while(s.hasNext()){
            al.add(s.next());
        }
        return al;
    }
}
