/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author georkirm
 */
public class NiceClass {
    public static String aem, onoma, eponumo;
    
    public NiceClass(){

    }
    
    public void save(String neoAem, String neoOnoma, String neoEponumo){
        try(PrintWriter theFile = new PrintWriter(new BufferedWriter(new FileWriter("Info.txt", false)))) {
            theFile.println(neoAem+" "+neoOnoma+" "+neoEponumo);
            JOptionPane.showMessageDialog(null, "The account has been saved.", 
                    "Nice message", JOptionPane.PLAIN_MESSAGE);
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong.", 
                    "Error message", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void show(){
        try (BufferedReader theFile = new BufferedReader(new FileReader("Info.txt"))) {
            String LineFromFile;
            while ((LineFromFile = theFile.readLine()) != null) {
                String[] InfoFromFile = LineFromFile.split(" ");
                aem = InfoFromFile[2];
                onoma = InfoFromFile[0];
                eponumo = InfoFromFile[1];
            }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "The \"Info.txt\" file is empy.", "Error message", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
