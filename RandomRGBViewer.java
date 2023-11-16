import javax.swing.JButton;
import javax.swing.JFrame;

// Lachlan Paul, 2023

public class RandomRGBViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("RandomRGB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RandomRGBComponent component = new RandomRGBComponent();

        // Calls a method that reruns the randomization, then repaints the frame.
        JButton reload = new JButton("Regenerate Colour!");
        reload.setBounds(150, 350, 200, 50);
        reload.addActionListener(e -> {
            component.reloadColor();
            frame.repaint();
        });

        // Adding the button before the rest of the page is vital,
        // otherwise everything else is gone.
        frame.add(reload);
        frame.add(component);

        // Draws the frame in the middle of the screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

