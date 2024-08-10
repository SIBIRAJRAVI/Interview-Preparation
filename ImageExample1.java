import javax.swing.*;
import java.awt.*;

public class ImageExample1 {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Load the image for the icon
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\sibir\\OneDrive\\Pictures\\my blue pic.jpg");
        Image iconImage = imageIcon.getImage();
        
        // Set the icon image for the frame
        frame.setIconImage(iconImage);

        // Optionally, add an image to the content pane as well
        JLabel label = new JLabel(imageIcon);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
