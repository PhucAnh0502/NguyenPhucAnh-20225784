import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null,
                "Please input a: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        if(a == 0){
            if(b == 0 && c!=0){
                JOptionPane.showMessageDialog(null,
                     "Phuong trinh vo nghiem");
            } else if (b==0 && c==0){
                JOptionPane.showMessageDialog(null, 
                    "Phuong trinh vo so nghiem");
            } else {
                double ans = -c / b;
                JOptionPane.showMessageDialog(null, 
                    "Phuong trinh co nghiem duy nhat : " + ans);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if(delta < 0) {
                JOptionPane.showMessageDialog(null,
                     "Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "Phuong trinh co nghiem kep x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }
}
