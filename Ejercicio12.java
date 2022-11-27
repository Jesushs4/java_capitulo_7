import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i<10; i++) {
            System.out.print("Introduzca un numero entero: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++) {
            System.out.print(array[i]+" ");
        } System.out.println();
        System.out.print("Introdzuca la primera posición: ");
        int first = sc.nextInt();
        System.out.print("Introduzca la segunda posición: ");
        int last = sc.nextInt();
        if (first > 9 || last > 9) {
            System.out.print("Error: Introduzca posiciones entre el 1 y el 9");
        } else {
        int aux = array[first];
        int[] auxarray = new int[10];
        for (int i = last; i<10; i++) {
            
            if (i+1 == 10) {
                auxarray[0] = array[i];
            } else {
                auxarray[i+1] = array[i];
            }
        }
        for (int i = 0; i<first; i++) {
            auxarray[i+1] = array[i];
        }
        for (int i = first+1; i<last; i++) {
            auxarray[i] = array[i];
        }
        auxarray[last] = aux;
        for (int i = 0; i<10; i++) {
            System.out.print(auxarray[i]+" ");
        }
    }
    }
    
}