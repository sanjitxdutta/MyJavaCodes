import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InventoryManagement {
    static ArrayList<Item> inventory = new ArrayList<>();

    public static void main(String[] args) {
        // Add some initial items to the inventory
        inventory.add(new Item(1001, "Tops", 10, 250, 200));
        inventory.add(new Item(1002, "Pants", 12, 500, 450));
        inventory.add(new Item(1003, "Sarees", 100, 750, 700));
        inventory.add(new Item(1004, "Shorts", 20, 350, 300));
        inventory.add(new Item(1005, "Kurtas", 15, 400, 300));

        new LoginScreen();
    }
}

// Model for Item
class Item {
    int id, available, price, originalPrice;
    String name;

    public Item(int id, String name, int available, int price, int originalPrice) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.price = price;
        this.originalPrice = originalPrice;
    }

    public int getProfit() {
        return (price - originalPrice) * available;
    }
}

// Login Screen
class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel userTypeLabel = new JLabel("Admin/User (A/U): ");
        JTextField userTypeField = new JTextField(5);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(10);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String userType = userTypeField.getText();
            String password = new String(passwordField.getPassword());
            if (userType.equalsIgnoreCase("A") && password.equals("abc")) {
                new AdminScreen();
                dispose();
            } else if (userType.equalsIgnoreCase("U") && password.equals("123")) {
                new UserScreen();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        setLayout(new GridLayout(3, 2));
        add(userTypeLabel);
        add(userTypeField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        setVisible(true);
    }
}

// Admin Screen
class AdminScreen extends JFrame {
    public AdminScreen() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton displayButton = new JButton("Display Inventory");
        JButton addButton = new JButton("Add Item");
        JButton removeButton = new JButton("Remove Item");
        JButton goodsButton = new JButton("Total Goods Available");
        JButton incomeButton = new JButton("Income & Loss");
        JButton logoutButton = new JButton("Logout");

        displayButton.addActionListener(e -> new DisplayInventoryScreen());
        addButton.addActionListener(e -> new AddItemScreen());
        removeButton.addActionListener(e -> new RemoveItemScreen());
        goodsButton.addActionListener(e -> showTotalGoods());
        incomeButton.addActionListener(e -> showIncomeLoss());
        logoutButton.addActionListener(e -> {
            new LoginScreen();
            dispose();
        });

        setLayout(new GridLayout(6, 1));
        add(displayButton);
        add(addButton);
        add(removeButton);
        add(goodsButton);
        add(incomeButton);
        add(logoutButton);
        setVisible(true);
    }

    private void showTotalGoods() {
        int total = InventoryManagement.inventory.stream().mapToInt(item -> item.available).sum();
        JOptionPane.showMessageDialog(this, "Total available goods: " + total);
    }

    private void showIncomeLoss() {
        int totalIncomeLoss = InventoryManagement.inventory.stream().mapToInt(Item::getProfit).sum();
        JOptionPane.showMessageDialog(this, "Total income or loss: " + totalIncomeLoss);
    }
}

// User Screen
class UserScreen extends JFrame {
    public UserScreen() {
        setTitle("User Dashboard");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton displayButton = new JButton("Display Inventory");
        JButton placeOrderButton = new JButton("Place Order");
        JButton logoutButton = new JButton("Logout");

        displayButton.addActionListener(e -> new DisplayInventoryScreen());
        placeOrderButton.addActionListener(e -> new PlaceOrderScreen());
        logoutButton.addActionListener(e -> {
            new LoginScreen();
            dispose();
        });

        setLayout(new GridLayout(3, 1));
        add(displayButton);
        add(placeOrderButton);
        add(logoutButton);
        setVisible(true);
    }
}

// Display Inventory Screen
class DisplayInventoryScreen extends JFrame {
    public DisplayInventoryScreen() {
        setTitle("Inventory List");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        for (Item item : InventoryManagement.inventory) {
            textArea.append("ID: " + item.id + ", Name: " + item.name + ", Available: " +
                    item.available + ", Price: " + item.price + ", Original Price: " + item.originalPrice + "\n");
        }
        textArea.setEditable(false);
        add(new JScrollPane(textArea));
        setVisible(true);
    }
}

// Add Item Screen
class AddItemScreen extends JFrame {
    public AddItemScreen() {
        setTitle("Add New Item");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JTextField idField = new JTextField(5);
        JTextField nameField = new JTextField(10);
        JTextField availableField = new JTextField(5);
        JTextField priceField = new JTextField(5);
        JTextField originalPriceField = new JTextField(5);
        JButton addButton = new JButton("Add Item");

        addButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            int available = Integer.parseInt(availableField.getText());
            int price = Integer.parseInt(priceField.getText());
            int originalPrice = Integer.parseInt(originalPriceField.getText());
            InventoryManagement.inventory.add(new Item(id, name, available, price, originalPrice));
            JOptionPane.showMessageDialog(this, "Item added successfully");
            dispose();
        });

        setLayout(new GridLayout(6, 2));
        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Available:"));
        add(availableField);
        add(new JLabel("Price:"));
        add(priceField);
        add(new JLabel("Original Price:"));
        add(originalPriceField);
        add(addButton);
        setVisible(true);
    }
}

// Remove Item Screen
class RemoveItemScreen extends JFrame {
    public RemoveItemScreen() {
        setTitle("Remove Item");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JTextField idField = new JTextField(5);
        JButton removeButton = new JButton("Remove Item");

        removeButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            InventoryManagement.inventory.removeIf(item -> item.id == id);
            JOptionPane.showMessageDialog(this, "Item removed successfully");
            dispose();
        });

        setLayout(new GridLayout(2, 2));
        add(new JLabel("Enter ID to remove:"));
        add(idField);
        add(removeButton);
        setVisible(true);
    }
}

// Place Order Screen
class PlaceOrderScreen extends JFrame {
    public PlaceOrderScreen() {
        setTitle("Place Order");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JTextField idField = new JTextField(5);
        JButton orderButton = new JButton("Place Order");

        orderButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            for (Item item : InventoryManagement.inventory) {
                if (item.id == id && item.available > 0) {
                    item.available--;
                    JOptionPane.showMessageDialog(this, "Order placed successfully");
                    dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Item unavailable or not found");
        });

        setLayout(new GridLayout(2, 2));
        add(new JLabel("Enter ID to order:"));
        add(idField);
        add(orderButton);
        setVisible(true);
    }
}
