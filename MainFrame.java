import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private ShoppingCart shoppingCart;

    public MainFrame() {
        shoppingCart = new ShoppingCart();
        setTitle("Online Shopping");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.Y_AXIS));

        Product[] products = {
            new Product("Laptop", 999.99),
            new Product("Smartphone", 499.99),
            new Product("Headphones", 79.99),
            new Product("Smartwatch", 199.99)
        };

        for (Product product : products) {
            ProductPanel panel = new ProductPanel(product, new AddToCartListener(product));
            productPanel.add(panel);
        }

        JScrollPane scrollPane = new JScrollPane(productPanel);
        add(scrollPane, BorderLayout.CENTER);

        JButton viewCartButton = new JButton("View Cart");
        viewCartButton.addActionListener(new ViewCartListener());

        add(viewCartButton, BorderLayout.SOUTH);
    }

    private class AddToCartListener implements ActionListener {
        private Product product;

        public AddToCartListener(Product product) {
            this.product = product;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            shoppingCart.addProduct(product);
            JOptionPane.showMessageDialog(MainFrame.this, product.getName() + " added to cart.");
        }
    }

    private class ViewCartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder message = new StringBuilder("Shopping Cart:\n");
            for (Product product : shoppingCart.getProducts()) {
                message.append(product).append("\n");
            }
            message.append("\nTotal: $").append(shoppingCart.getTotalPrice());
            JOptionPane.showMessageDialog(MainFrame.this, message.toString());
        }
    }
}
