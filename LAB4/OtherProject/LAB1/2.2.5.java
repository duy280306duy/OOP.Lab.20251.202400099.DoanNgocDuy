import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");
       
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
       
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String chia;
        
        if (num2 != 0) {
            chia = String.valueOf(num1 / num2);
        } else {
            chia = "Undefined (division by zero)";
        }
        // hien ket qua
        String message = "Results:\n"
                       + "Sum = " + sum + "\n"
                       + "Difference = " + difference + "\n"
                       + "Product = " + product + "\n"
                       + "quotient = " + chia;

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}