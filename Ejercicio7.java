import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] numlist = new int[100];
        for (int i = 0; i<100; i++) {
            numlist[i] = (int)(Math.random()*21);
            System.out.print(numlist[i]+" ");
        }
        System.out.println();
        System.out.print("Introduzca el numero a sustituir: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el numero que va a sustituir: ");
        int num2 = sc.nextInt();
        for (int i = 0; i<100; i++) {
            System.out.print((num1==numlist[i] ? num2 : numlist[i])+" ");
        }
    }
    
}
