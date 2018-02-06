/*
 * GUI 8 is like GUI 7 except the central region is given a JTextArea in place
 * of the JPanel and command execution amounts to displaying the name of the
 * action command in the text area -- and that the commands have changed!
 */

package GUI;

import frames.KFrame8;
import javax.swing.SwingUtilities;
//import javax.swing.SwingConstants;

/**
 *
 * @author walonzo
 */
public class GUI8 {

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
            GUI8 gui = new GUI8();
        }

    }

    public GUI8() {
        KFrame8 frame = new KFrame8("GUI 8");
    }
}