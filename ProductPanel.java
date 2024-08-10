import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ProductPanel extends JPanel {
    private Product product;
    private JButton addButton;

    public ProductPanel(Product product, ActionListener addButtonListener) {
        this.product = product;
        setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel(product.getName());
        JLabel priceLabel = new JLabel("$" + product.getPrice());

        addButton = new JButton("Add to Cart");
        addButton.addActionListener(addButtonListener);

        add(nameLabel, BorderLayout.CENTER);
        add(priceLabel, BorderLayout.EAST);
        add(addButton, BorderLayout.SOUTH);
    }
}
