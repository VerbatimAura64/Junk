/*
 * GUI 7 is like GUI 6 except for the layout and new components. Here we can type in a color
 * and we will get that color. Also introduces random color generator, so that's
 * pretty cool.
 * 
 */
package GUI;

import frames.KFrame7;
import javax.swing.SwingUtilities;
//import javax.swing.SwingConstants;

/**
 *
 * @author walonzo
 */
public class GUI7 {

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
            GUI7 gui = new GUI7();
        }

    }

    public GUI7() {      
        KFrame7 frame = new KFrame7("GUI 7");
    }    
}