/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analyticsprog;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author patma
 */
public class Analyticsprog {
public static final String path = "jdbc:mysql://localhost:3306/analyticsdb";
public static final String user = "root";
public static final String pass = "Naiskongmagpakalasingdahilwalakana14";
static Connection con;  
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
             con = DriverManager.getConnection(path, user, pass);
        }
        catch(Exception e){
            System.err.println(e);
        }
       main formMain  = new main();
       formMain.setVisible(true);
       
    }
    
}
