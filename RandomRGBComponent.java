import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JComponent;

// Lachlan Paul, 2023

public class RandomRGBComponent extends JComponent {

    // These are placed up here to prevent the colour changing everytime the window is resized
    // This is important because only graphics code should be in paintComponent
    Random gen = new Random();

    // Full names because of g already being taken
    int red = gen.nextInt(0, 256);
    int green = gen.nextInt(0, 256);
    int blue = gen.nextInt(0, 256);

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        // Sets a new color made out of red, green, and blue.
        Color myColor = new Color(red, green, blue);

        // String.(valueOf) sets the string to be whatever the value of the int is
        g2.setColor(Color.RED);
        g2.drawString(String.valueOf(red), 30, 300);

        g2.setColor(Color.GREEN);
        g2.drawString(String.valueOf(green), 230, 300);

        g2.setColor(Color.BLUE);
        g2.drawString(String.valueOf(blue), 430, 300);

        Rectangle colRep = new Rectangle(195, 100, 100, 100);

        g2.setColor(myColor);
        g2.fill(colRep);

    }

    // Reloads the colour values
    public void reloadColor(){
        red = gen.nextInt(0, 256);
        green = gen.nextInt(0, 256);
        blue = gen.nextInt(0, 256);
    }
}