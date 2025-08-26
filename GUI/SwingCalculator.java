import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator {
    public static void main(String[] args) {
        // 1. Create the main window
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // 2. Create the display field
        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        // 3. Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // 4. Add buttons to panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new LoveButtonListener(display));
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

// 5. Custom button listener that always shows "I miss you"
class LoveButtonListener implements ActionListener {
    private JTextField display;
    
    public LoveButtonListener(JTextField display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "C":
                display.setText("");
                break;
            case "=":
                // Always show "I miss you" when pressing =
                display.setText("I miss you");
                break;
            default:
                // Allow normal number/operator input
                display.setText(display.getText() + command);
        }
    }
}