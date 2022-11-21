import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i<15; i++) {
            System.out.print("Introduzca un numero entero: ");
            array[i] = sc.nextInt();
        }
        int aux = array[14];
        for (int i = 13; i>=0; i--) {
            array[i+1] = array[i];
        }
        array[0] = aux;
        for (int i = 0; i<15; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
}
