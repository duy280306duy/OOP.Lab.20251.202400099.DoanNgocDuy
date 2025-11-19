import javax.swing.JOptionPane;
public class Homework226 {
    public static void main(String[] args){
        System.out.println("This program solves the first-degree equation(linear equation) with one variable x : f(x) = ax + b = 0");
         // Nhap input
        String strNum1 = JOptionPane.showInputDialog("Enter the value of the coefficient a: ");
        String strNum2 = JOptionPane.showInputDialog("Enter the value of the constant term b: ");
        String strNum3 = JOptionPane.showInputDialog("Enter the value of the function f(x) (aka what does f(x) equal to): ");
        // Chuyen doi sang double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double num3 = Double.parseDouble(strNum3);
        //tinh toan
        if (num1 == 0) {
            if (num2 == num3) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double solution = (num3 - num2) / num1;
            JOptionPane.showMessageDialog(null, "The equation has a unique solution: x = " + solution);
        }
        System.exit(0);
    }
}
