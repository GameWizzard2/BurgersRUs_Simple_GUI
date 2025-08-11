/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burgersrus.app;
import burgersrus.ui.MainUI;

/**
 * Entry point for the BurgersRUS application.
 * Launches the main user interface.
 *
 * @author Chris
 */
public class BurgersRUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Launch the GUI on the Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> {
            new MainUI().setVisible(true);
        });
    }
    
}
