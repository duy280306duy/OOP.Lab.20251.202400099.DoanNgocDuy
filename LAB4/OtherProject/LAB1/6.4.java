import javax.swing.JOptionPane;

public class DaysOfMonth {
    public static void main(String[] args) {
        while (true) {
            String strMonth = JOptionPane.showInputDialog("Enter a month:");
            if (strMonth == null) break;
            strMonth = strMonth.toLowerCase().trim();
            String strYear = JOptionPane.showInputDialog("Enter a year:");
            if (strYear == null) break;
            strYear = strYear.trim();
            // Kiem tra nam
            boolean GoodYear = true;
            for (int i = 0; i < strYear.length(); i++) {
                if (!Character.isDigit(strYear.charAt(i))) {
                    GoodYear = false;
                    break;
                }
            }
            if (!GoodYear || strYear.equals("")) {
                JOptionPane.showMessageDialog(null, "Try again.");
                continue;
            }
            int year = Integer.parseInt(strYear);
            // Kiem tra thang
            int month = -1;
            if (strMonth.equals("january") || strMonth.equals("jan.") || strMonth.equals("jan") || strMonth.equals("1")) {
                month = 1;
            } else if (strMonth.equals("february") || strMonth.equals("feb.") || strMonth.equals("feb") || strMonth.equals("2")) {
                month = 2;
            } else if (strMonth.equals("march") || strMonth.equals("mar.") || strMonth.equals("mar") || strMonth.equals("3")) {
                month = 3;
            } else if (strMonth.equals("april") || strMonth.equals("apr.") || strMonth.equals("apr") || strMonth.equals("4")) {
                month = 4;
            } else if (strMonth.equals("may") || strMonth.equals("5")) {
                month = 5;
            } else if (strMonth.equals("june") || strMonth.equals("jun.") || strMonth.equals("jun") || strMonth.equals("6")) {
                month = 6;
            } else if (strMonth.equals("july") || strMonth.equals("jul.") || strMonth.equals("jul") || strMonth.equals("7")) {
                month = 7;
            } else if (strMonth.equals("august") || strMonth.equals("aug.") || strMonth.equals("aug") || strMonth.equals("8")) {
                month = 8;
            } else if (strMonth.equals("september") || strMonth.equals("sep.") || strMonth.equals("sep") || strMonth.equals("9")) {
                month = 9;
            } else if (strMonth.equals("october") || strMonth.equals("oct.") || strMonth.equals("oct") || strMonth.equals("10")) {
                month = 10;
            } else if (strMonth.equals("november") || strMonth.equals("nov.") || strMonth.equals("nov") || strMonth.equals("11")) {
                month = 11;
            } else if (strMonth.equals("december") || strMonth.equals("dec.") || strMonth.equals("dec") || strMonth.equals("12")) {
                month = 12;
            }
            if (month == -1) {
                JOptionPane.showMessageDialog(null, "Try again.");
                continue;
            }
            // So ngay
            int days = 0;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                days = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // nam nhuan
                } else {
                    days = 28;
                }
            }
            // In
            JOptionPane.showMessageDialog(null, "Number of days is: " + days + " days");
            break; 
        }
    }
}

