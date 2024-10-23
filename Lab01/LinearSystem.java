import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main(String[] args) {
        String strA11, strA12, strA21, strA22, strB1, strB2;
        strA11 = JOptionPane.showInputDialog(null,
                "Please input a11: ", "Input a11",
                JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null,
                "Please input a12: ", "Input a12",
                JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null,
                "Please input a21: ", "Input a21",
                JOptionPane.INFORMATION_MESSAGE);
        strA22 = JOptionPane.showInputDialog(null,
                "Please input a22: ", "Input a22",
                JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null,
                "Please input b1: ", "Input b1",
                JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null,
                "Please input b2: ", "Input b2",
                JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);
        double D = (a11 * a22) - (a21 * a12);
        double D1 = (b1 * a22) - (b2 * a12);
        double D2 = (a11 * b2) - (a21 * b1);
        if(D == 0 && (D1 != 0 || D2 != 0)){
            JOptionPane.showMessageDialog(null,
                 "He phuong trinh vo nghiem");
        } else if( D == 0 && D1 == 0 && D2 == 0){
            JOptionPane.showMessageDialog(null, 
                "He phuong trinh vo so nghiem");
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, 
                "Nghiem cua he phuong trinh la : x1 = " + x1 + " va x2 = " + x2);
        }
    }
}
