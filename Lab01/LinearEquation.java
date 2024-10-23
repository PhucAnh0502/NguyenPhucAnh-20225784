import javax.swing.JOptionPane;
public class LinearEquation {
    public static void main(String[] args) {
        String strA, strB;
        strA = JOptionPane.showInputDialog(null,
                "Please input a: ", "Input a",
                JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input b",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if(a == 0 && b!=0){
            JOptionPane.showMessageDialog(null,
                 "Phuong trinh vo nghiem");
        } else if (a==0 && b==0){
            JOptionPane.showMessageDialog(null, 
                "Phuong trinh vo so nghiem");
        } else {
            double ans = -b / a;
            JOptionPane.showMessageDialog(null, 
                "Nghiem cua phuong trinh la : " + ans);
        }
    }
}
