import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] numlist = new int [10];

    for (int i = 9; i>=0; i--) {
        System.out.print("Introduzca un número entero: ");
        numlist[i] = sc.nextInt();
    }
    for (int i = 0; i<10; i++) {
        System.out.print(numlist[i]+" ");
    }
    /* Los valores que no se han inicializado quedan como vacio (" ") */
}
}