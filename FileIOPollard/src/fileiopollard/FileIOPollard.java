/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiopollard;

/**
 *
 * @author dp006
 */
public class FileIOPollard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        FileIOChooser FileIOTest = new FileIOChooser();
        FileIOTest.writeToFile("Hello");
        FileIOTest.readFromFile();
        
        
        
        
    }
}
