import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int[] numlist = new int[10];
    for (int i = 0; i<10; i++) {
        System.out.print("Introduzca un número entero: ");
        numlist[i] = sc.nextInt();
        max = Integer.max(max, numlist[i]);
        min = Integer.min(min, numlist[i]);
    }
    for (int i = 0; i<10; i++) {
        if (max==numlist[i]) {
            System.out.print("Máximo:"+numlist[i]+" ");
        }
        else if (min==numlist[i]) {
            System.out.print("Mínimo:"+numlist[i]+" ");
        }
        else {
            System.out.print(numlist[i]+" ");
        }
    }
    }
}
