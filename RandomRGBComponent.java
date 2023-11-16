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

    // Originally these had whole names because g was taken
    // But now it's like this because I think it's better
    int red = gen.nextInt(0, 256);
    int green = gen.nextInt(0, 256);
    int blue = gen.nextInt(0, 256);

    public void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;

        // Sets a new color made out of red, green, and blue.
        Color myColor = new Color(red, green, blue);

        // String.(valueOf) sets the string to be whatever the value of the int is
        graphics2D.setColor(Color.RED);
        graphics2D.drawString(String.valueOf(red), 30, 300);

        graphics2D.setColor(Color.GREEN);
        graphics2D.drawString(String.valueOf(green), 230, 300);

        graphics2D.setColor(Color.BLUE);
        graphics2D.drawString(String.valueOf(blue), 430, 300);

        Rectangle colRep = new Rectangle(195, 100, 100, 100);

        graphics2D.setColor(myColor);
        graphics2D.fill(colRep);
    }

    // Reloads the colour values
    public void reloadColor(){
        red = gen.nextInt(0, 256);
        green = gen.nextInt(0, 256);
        blue = gen.nextInt(0, 256);
    }
}