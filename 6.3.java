import javax.swing.JOptionPane;
public class StarPyramid {
    public static void main(String[] args) {
        String strn = JOptionPane.showInputDialog("Enter the height (an integer) of the star pyramid: ");
        int n = Integer.parseInt(strn);
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }
}