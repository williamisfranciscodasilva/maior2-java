import javax.swing.JOptionPane;
class maior2
{
    public static void main(String args[])
    {
        Float num1, num2, mnum;

        num1 =Float.parseFloat(
        JOptionPane.showInputDialog(""));
        num2 =Float.parseFloat(
        JOptionPane.showInputDialog(""));

        mnum = (num1 > num2) ? num1 : num2;
        JOptionPane.showMessageDialog(null,"O maior valor entre "+num1+" e "+num2+" é: "+mnum);
        System.out.println("O maior valor entre "+num1+" e "+num2+" é: "+mnum);
    }
}