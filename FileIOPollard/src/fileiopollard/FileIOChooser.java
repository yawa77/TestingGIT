/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiopollard;

/**
 *
 * @author dp006
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileIOChooser {

    PrintWriter myOutPut;
    FileWriter myFile;
   Scanner fileInput;
    public void readFromFile()
    {
        //open file
        JFileChooser fileLookUp = new JFileChooser();
        int result = fileLookUp.showOpenDialog(null);

if(result == JFileChooser.CANCEL_OPTION)
{
    return;
}
        try {
            
        Scanner fileInput = new Scanner(fileLookUp.getSelectedFile()); 
                      
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIOChooser.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(fileInput.hasNext())
        {
            JOptionPane.showMessageDialog(null, fileInput.nextLine());
        }
        fileInput.close();
    }
    
    
    
    
    public void writeToFile(String myStr)
    {
        
    
    String input = "";
    
    JFileChooser fileLookUp = new JFileChooser();

int result = fileLookUp.showOpenDialog(null);

if(result == JFileChooser.CANCEL_OPTION)
{
    return;
}
        try {
           // myOutPut = new PrintWriter(fileLookUp.getSelectedFile());
            FileWriter myFile = new FileWriter(fileLookUp.getSelectedFile(),true);//true appends, flase does not
            myOutPut = new PrintWriter(myFile);
            for(int i = 0; i<10; i++)
{
input = JOptionPane.showInputDialog("Enter text to write here");
//myOutPut.println(input);

}
        myOutPut.close();    
      } 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
       
catch (IOException ex)
{
 JOptionPane.showMessageDialog(null,ex.getMessage());   
}




    }

}
