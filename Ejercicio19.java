import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int length = 12;
    int[] array = new int[length];
    System.out.print("Indice:");
    for (int i=0; i<length; i++) {
        array[i] = (int)(Math.random()*201);
        System.out.printf("%5d",i);
    }
    System.out.printf("\nValor: ");
    for (int i=0; i<length; i++) {
        System.out.printf("%5d",array[i]);
    }
    System.out.printf("\n\nIntroduzca el número que quiere insertar: ");
    int num = sc.nextInt();
    System.out.printf("Introduzca la posición donde lo quiere insertar (0-11): ");
    int pos = sc.nextInt();

    array[pos] = num;

    System.out.print("\nIndice:");
    for (int i=0; i<length; i++) {
        System.out.printf("%5d",i);
    }
    System.out.printf("\nValor: ");
    for (int i=0; i<length; i++) {
        System.out.printf("%5d",array[i]);
    }


    }
}
