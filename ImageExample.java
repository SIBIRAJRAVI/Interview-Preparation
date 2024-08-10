import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ImageExample {
    public static void main(String[] args) {
        JFrame fame=new JFrame();
        fame.setSize(400, 400);
        JTextField searchField = new JTextField();
        JButton searchButton = new JButton("Search");
        searchButton.setSize(200, 23);
        JPanel searchPanel = new JPanel();
        searchPanel.add(searchField);

// Add button if using one
        if (searchButton != null) {
            searchPanel.add(searchButton);
        }
        searchButton.addActionListener(e -> {
            String searchTerm = searchField.getText();
            
          });
          searchField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
          
            @Override
            public void keyPressed(KeyEvent e) {
              if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String searchTerm = searchField.getText();
                // Perform search with searchTerm
              }
            }
          
            @Override
            public void keyReleased(KeyEvent e) { }
          });
        fame.setVisible(true);
        searchPanel.setVisible(true); 
        searchButton.setVisible(true);
        searchField.setVisible(true);


    }
}
