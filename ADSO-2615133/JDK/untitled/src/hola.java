import javax.swing.JOptionPane;
public class hola {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer dato"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo dato"));
        while (b == 0) {
            JOptionPane.showMessageDialog(null,"numero distinto a cero");
            b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo dato"));

        }
        c=Integer.parseInt(JOptionPane.showInputDialog("escoja un numero el 1 es suma"+"\n"+"el 2 es resta"+"\n"+"el 3 es multiplicacion"+"\n"+"el 4 es division"));
        switch (c){
            case 1:
                int suma=a+b;
                JOptionPane.showMessageDialog(null,"el resultado de la suma es" + suma);
                break;
            case 2:
                int resta=a-b;
                JOptionPane.showMessageDialog(null,"el resultado de la resta es" + resta);
                break;
            case 3:
                int multiplicacion=a-b;
                JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es" + multiplicacion);
                break;
            case 4:
                int division=a-b;
                JOptionPane.showMessageDialog(null,"el resultado de la suma es" + division);
                break;
            default:
                JOptionPane.showMessageDialog(null,"opcion invalida papa");
        }
    }
}

