/*import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double radio;
        int n;
        System.out.println("introduzca su nombre");
        nombre = sc.nextLine();
        System.out.println("hola" + nombre + "!!!");
        System.out.println("introduzca el radio de la circunferencia");
        radio = sc.nextDouble();
        System.out.println("Longitud de la circunferencia" + 2 * Math.PI * radio);
        System.out.println("introduzca un numero entero");
        n = sc.nextInt();
        System.out.println("Elcuadrado es" + Math.pow(n, 2));
    }
}

 */
/*
 import java.util.Scanner;
 public class Main{
     public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
         Scanner ep = new Scanner(System.in);
         String nombre;
         int edad;
         String direccion;
         System.out.println("introduzca su nombre");
         nombre= sc.nextLine();
         System.out.println("introduzca su edad" );
         edad=sc.nextInt();
         System.out.println("introduzca su direccion");
         direccion = ep.nextLine();
         System.out.println("Bienvenido " + nombre + " !!!");
         System.out.println("su edad es de " + edad + " años" );
         System.out.println("su direccion actual es " + direccion);

     }

}
*/
/*
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner ep= new Scanner(System.in);
        System.out.println("ingrese la cantidad de grados celsius que quiere cambiar a fahrenheit");
        int c;
        c= ep.nextInt();
        System.out.println("la cantidad de grados celsius ingresada es " + c);
        double Fahrenheit= 32+(9* c/5);

        System.out.println("sus grados celsius cambiados a fahrenheit son " + Fahrenheit);
    }
}
*/
//import com.ibm.dtfj.image.ImageThread;
/*
import  java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner ui = new Scanner(System.in);
        System.out.println("ingrese el radio de la circunferencia");
        int r;

        r =ui.nextInt();
        double longitud =2 * Math.PI * r;
        double area = Math.PI*r*r;
        System.out.println("la longitud de la circunferencia es "  +  longitud);
        System.out.println("el area de la circunferencia es  " + area );
    }
}
*/
//Programa que pase de kilometros sobre horas a metros/s la velocidad se lee por teclado
/*
import  java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner op= new Scanner(System.in);
        System.out.println("ingrese los kilometros por hora a los que viaja");
        int km;

        km=op.nextInt();
        double mts= km *5/18;
        System.out.println("la velocidad desde sus kilometros hasta metros por segundo es de " + mts);
    }
}
 */
/*
import  java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner im= new Scanner(System.in);
        Scanner ex= new Scanner(System.in);
        System.out.println("ingrese la longitud del primer cateto");
        double cat1;
        cat1=im.nextDouble();
        System.out.println("ingrese la longitud del segundo cateto");
        double cat2;
        cat2= ex.nextDouble();
        double cat3= cat1*cat1+cat2*cat2;
        double def=Math.sqrt(cat3);
        System.out.println("la longitud de la hipotenusa del triangulo rectangulo es de  " + def);

    }
}
*/
/*
import java.util.*;
public class Main {
    public static void main(String[]args) {
        Scanner ppt = new Scanner(System.in);
        System.out.println("ingrese una letra");
        int num;
        num = ppt.nextInt();
        char salida = (char) num;
        System.out.println("este es su numero en codigo ascii"+"\n"
                + salida);
    }
}
*/
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ppt = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num;
        num = ppt.nextInt();
        if (num % 2 == 0) {
            System.out.println("su numero es par");
        }else
        {
            System.out.println("su numero es impar");
        }
    }
}
*/
/*

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ppt = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num;
        num = ppt.nextInt();
        Scanner iutp = new Scanner(System.in);
        System.out.println("ingrese el 2 numero");
        int num2;
        num2 = iutp.nextInt();


        if (num > num2)
            System.out.println("el numero mayor es " + num + " y el numero menor es " + num2);
        if (num2 > num)
            System.out.println("el numero mayor es el numero  " + num2 + "  y el numero menor es  " + num);
        else {


            System.out.println("los numeros son iguales");


        }
    }
}
*/
/*
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ppt = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1;
        num1 = ppt.nextInt();
      System.out.println("la primera cifra de su numero es  "  +  (num1/100));
        System.out.println("la segunda cifra de su numero es  "  +  (num1/10)%10);
        System.out.println("la tercera cifra de su numero es  "  +  (num1%10));
    }

}
*/
/*
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ppt = new Scanner(System.in);
        Scanner io = new Scanner(System.in);
        Scanner vo = new Scanner(System.in);
        Scanner ii= new Scanner(System.in);
        System.out.println("ingrese su nombre alumno");
        String name;
        name = ii.nextLine();
        System.out.println("ingrese la nota de la primera evaluacion");
        double num1;
        double num2;
        double num3;

        num1 = ppt.nextDouble();
        System.out.println("ingrese la nota de la segunda evaluacion");
        num2 = io.nextDouble();
        System.out.println("ingrese la nota de la tercera evaluacion");
        num3 = vo.nextDouble();
        double def = (num1 + num2 + num3) / 3;
        System.out.println("su nota definitica es  " + def);
        if (def >= 30) {

            System.out.println(name +"  ud aprobo la materia");
        }
        if (def <= 30) {
            System.out.println(name +"  ud REPROBO la materia");
        }
    }
}
*/
/*
import  java.util.*;
import javax.swing.*;
public class Main {
    public static void main(String[]args){
        String nombre=JOptionPane.showInputDialog("introduce tu nombre");
        System.out.println("Bienvenido  " +  nombre );

    }
}
*/
/*
import java.util.*;
import javax.swing.*;
public class NewClass 

    private static Scanner sc;
    public static void main(String[] args) {
     int a,b, suma;
     a=LeerNumero ("ingrese el valor de el primer numero :");
 b=LeerNumero("ingrese el valor del segundo numero");
suma =a+b;
    System.out.println("el resultado de la suma es:  "  + suma);

}
private static int LeerNumero(String a){
sc=new Scanner( System.in);
System.out.print (a);
return sc.nextInt();
  }
}
*/
/*
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");


        JLabel num1Label = new JLabel("Ingrese el primer número:");
        JTextField num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Ingrese el segundo número:");
        JTextField num2Field = new JTextField(10);

        JButton sumarButton = new JButton("Sumar");
        JButton restarButton = new JButton("Restar");
        JButton multiplicarButton = new JButton("Multiplicar");
        JButton dividirButton = new JButton("Dividir");


        JPanel panel = new JPanel();
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(sumarButton);
        panel.add(restarButton);
        panel.add(multiplicarButton);
        panel.add(dividirButton);


        sumarButton.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = sumar(num1, num2);
            JOptionPane.showMessageDialog(frame, "La suma de los dos números es: " + resultado);
        });

        restarButton.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = restar(num1, num2);
            JOptionPane.showMessageDialog(frame, "La resta de los dos números es: " + resultado);
        });

        multiplicarButton.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = multiplicar(num1, num2);
            JOptionPane.showMessageDialog(frame, "La multiplicación de los dos números es: " + resultado);
        });

        dividirButton.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double resultado = dividir(num1, num2);
            JOptionPane.showMessageDialog(frame, "La división de los dos números es: " + resultado);
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}

/*
import java.util.*;
import javax.swing.*;
public class Main {

    private static Scanner sc;


    public static void main(String[] args) {

        int  a,b,suma, resta, multiplicacion,num, div;
        System.out.println("ingrese la operacion que quiere realizar 1 es suma, 2 es resta, 3 es multipplicacion y 4 es division");

        Scanner ppt = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1;
        num1 = ppt.nextInt();

        switch (num1) {
            case 1:


                public class NewClass

                private static Scanner sc;
                public static void main(String[] args) {
                int a,b, suma;
                a=LeerNumero ("ingrese el valor de el primer numero :");
                b=LeerNumero("ingrese el valor del segundo numero");
                suma =a+b;
                System.out.println("el resultado de la suma es:  "  + suma);

            }
            private static int LeerNumero(String a){
                sc=new Scanner( System.in);
                System.out.print (a);
                return sc.nextInt();
            }
        }


        }


        }

*/
/*public static int suma(int a, int b) {
    int result

            result = a +b
                    return result;*/
/*import javax.swing.JOptionPane;
public class Main  {
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
*/
/*
import java.sql.SQLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int numero2;
      int numero1;

        System.out.println("introduzca el numero 1");
        numero1 = sc.nextInt();
        System.out.println("introduzca el numero 2");

        numero2 = sc.nextInt();
       int por = Math.min(numero1,numero2);
System.out.println("el numero menor es " + por);

    }
}
*/
/*
import java.sql.SQLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1;

        System.out.println("introduzca el numero 1 para su base e");
        numero1 = sc.nextDouble();
        double x4 = Math.log(numero1);
        System.out.println("el logaritmo en base 2 " +x4);
    }
}
*/
/*
import java.sql.SQLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;
        System.out.println("introduzca el numero 1");
        numero1 = sc.nextDouble();
        System.out.println("introduzca el numero 2");
        numero2 = sc.nextDouble();
        double x = Math.max(numero1, numero2);
        System.out.println("el numero mayor es " + x);
    }
}

 */
/*
import java.sql.SQLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("introduzca eL NUMERO QUE QUIERE ELEVAR");
        num1 = sc.nextDouble();
        System.out.println("introduzca el numeor por el que quiere elevar");
        num2 = sc.nextDouble();
        double y = Math.pow(num1,num2);
        System.out.println("El numero elevado al " + num2 + "da como resultado
        " + y );

    }
}

 */
//Se trata de escribir un script que diga si un número es par o es impar.
//
//Recordemos que un número es par si al dividirlo por 2 da como resto 0
//import java.sql.SQLOutput;
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;

        System.out.println("introduzca eL NUMERO QUE QUIERE saber si es par o impar");
        num1 = sc.nextDouble();


        if (num1%2==0)
            System.out.println("su numero es par");
        else {
            System.out.println("su numero es impar");
        }
    }
}

 */
//Un programa que pida un número y diga si es positivo o negativo. El cero se considera positivo
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;

        System.out.println("introduzca eL NUMERO QUE QUIERE saber si es Positivo o negativo");
        num1 = sc.nextDouble();


        if (num1 > 0)
            System.out.println("su numero es positivo");
        else if (num1==0) {            System.out.println("su numero es igual a 0");


        } else {
            System.out.println("su numero es negativo");
        }
    }
}

 */
 //Ejermplo 1
/*
public class Main {
    public static void main(String[] args) {
    int temperatura;
    System.out.println ("ingrese la temperatura");
    temperatura = sc.nextInt();
        double numero =(temperatura >10)?(Math.random()*10):0;
    }
String quehacer =(temperatura > 25)?"A la playa " : "esperando al buen tiempo...";
    System.out.println
}

 */

/*
//ejermplo 2public class Main {
    public static void main(String[] args) {
        double numero =(temperatura >10)?(Math.random()*10):0;
    }
}

*/
/*
publicstatic void main(String[] args){
        comida micomida=cansado?pedircomida("china"):hacercomida();
        }
        }
  */
/*
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingresa el primer numero : ");
        int num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero: ");
        int num2= scanner.nextInt();
        System.out.println("ingresa el tercer numero: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2==num3)
        {System.out.println("los tres numeros son iguales. ");
        } else if ( num1 == num2||num1==num3||num2==num3) {
            System.out.println("hay dos numeros iguales ");

        }else {
            int  mayor =num1;
            if (num2 > mayor){
                mayor=num2;
            }
        }
        int mayor=num3;
        if (num2 >mayor) {
           mayor=num3;
        }
            System.out.println("el numero mayor es " + mayor);

        }
    }

*/
// array para guardar nombre de peliculas favoritas
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de peliculas que desea agregar: ");
        int numerodepeliculas = scanner.nextInt();
        String[][] peliculas = new String[numerodepeliculas][numerodepeliculas];
        for (int i = 0; i < numerodepeliculas; i++) {
            System.out.println("ingrese el nombre de la pelicula # " + (i+1) + ": ");
             peliculas[i][0]=scanner.next();

            System.out.println("ingrese el Años de emision de la pelicula # " + (i+1) + ": ");
             peliculas[i][1]=scanner.next();
        }
        for (int i = 0; i < peliculas.length; i++) {

            System.out.println(" nombre " + peliculas[i][0]+ "Año"+ peliculas[i][1]);
        }
    }


}

 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int i =1;i<=100;i++){
            boolean esPrimo=true;
            for (int j =2;j<i;j++){
                if (i%j==0){
                    esPrimo=false;
                    break;
                }
            }
            if (esPrimo){
                System.out.println(i+ "");
            }
        }
    }

}

 */
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String texto="la lluvia en sevilla es una maravilla";
    int numVocales = 0;
    for(int i = 0 ;i<texto.length();i++){
        char c= texto.charAt(i);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            numVocales++;
        }
    }
    System.out.println("el numero de vocales en \"" + texto+"\"es"+ numVocales);
    }
}
*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "la lluvia en sevilla es una maravilla";
        int numVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int ascii = (int) c;


            System.out.println("el caracter " + c + "tiene un codigo de ascci de " + Integer.toString(ascii));
        }
    }
}

 */
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        String texto="la lluvia en sevilla es una maravilla";
        texto=texto.replace('a','e');
        int numVocales = 0;
        for(int i = 0 ;i<texto.length();i++){
            char c= texto.charAt(i);
            if (c=='e'||c=='i'||c=='o'||c=='u'){
                numVocales++;
            }
        }
        System.out.println("el numero de vocales en \"" + texto+"\"es"+ numVocales);
    }
}

 */



































