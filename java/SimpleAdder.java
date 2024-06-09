package Testjava.demo;
import javax.swing.*;
import java.awt.event.*;

public class SimpleAdder {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Adder");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Text fields for input
    JTextField num1Field = new JTextField(10);
    JTextField num2Field = new JTextField(10);

    // Label for output
    JLabel resultLabel = new JLabel("Result: 0");

    // Button to perform addition
    JButton addButton = new JButton("Add");

    // Text field listener to update result on focus lost
    num1Field.addFocusListener(new FocusAdapter() {
      @Override
      public void focusLost(FocusEvent e) {
        updateResult();
      }
    });

    num2Field.addFocusListener(new FocusAdapter() {
      @Override
      public void focusLost(FocusEvent e) {
        updateResult();
      }
    });

    // Button click listener to perform addition
    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        updateResult();
      }
    });

    // Function to update the result label
    public static void updateResult() {
      try {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int sum = num1 + num2;
        resultLabel.setText("Result: " + sum);
      } catch (NumberFormatException ex) {
        // Handle invalid input (non-numeric characters)
        resultLabel.setText("Result: Invalid input!");
      }
    }

    // Panel to hold elements
    JPanel panel = new JPanel();
    panel.add(new JLabel("Number 1:"));
    panel.add(num1Field);
    panel.add(new JLabel("Number 2:"));
    panel.add(num2Field);
    panel.add(addButton);
    panel.add(resultLabel);

    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}
