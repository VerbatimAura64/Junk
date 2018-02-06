/*
 * GUI 6 is like GUI 5 except that the KFrame6 is in another package
 * which we imported into the GUI6 class. Structural changes, Behavior remains the same.
 */
package GUI;

import frames.KFrame6;
import javax.swing.SwingUtilities;
//import javax.swing.SwingConstants;

/**
 *
 * @author walonzo
 */
public class GUI6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        public ThreadForGUI() {
        }

        @Override
        public void run() {
            GUI6 gui = new GUI6();
        }

    }

    public GUI6() {      
        KFrame6 frame = new KFrame6("GUI 6");
    }    
}