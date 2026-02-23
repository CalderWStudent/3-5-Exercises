import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane, store the input as a String, and print it.
        String input = JOptionPane.showInputDialog("Type a whole number here:");
        System.out.println("First input: " + input);

        // Parse an integer from the first input, then print it to the console.
        int parsedInput1 = Integer.parseInt(input);
        System.out.println("First input (incremented by one): " + ++parsedInput1);

        // Create a JOptionPane, parse the input, and initialize it as an integer within a single line, then print the integer to the console.
        int parsedInput2 = Integer.parseInt(JOptionPane.showInputDialog("Type another whole number here:"));
        System.out.println("Second input: " + parsedInput2);
    }
}