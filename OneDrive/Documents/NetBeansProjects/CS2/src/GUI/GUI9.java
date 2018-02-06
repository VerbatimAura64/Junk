/*
 * GUI 9 is like GUI 8 except it adds functionality
 *
 */

package GUI;

import frames.KFrame8;
import frames.KFrame9;
import javax.swing.SwingUtilities;
//import javax.swing.SwingConstants;

/**
 *
 * @author walonzo
 */
public class GUI9 {

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
            GUI9 gui = new GUI9();
            
        }

    }

    public GUI9() {
        KFrame9 frame = new KFrame9("GUI 9");
    }
}