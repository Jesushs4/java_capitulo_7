import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int arraypos = 0;
        boolean correct = false;
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            array[i] = (int)(Math.random()*101);
        }
        while (correct==false) {
        for (int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\nIntroduzca el número que rotar dentro del array: ");
        int num = sc.nextInt();
        arraypos = 0;
        while (length>arraypos && correct==false) {
                if (num==array[arraypos]) {
                correct=true;
            } else {
                arraypos++;
            }
        
        }
        if (correct==false) {
            System.out.println("Por favor, introduzca un numero dentro del array");
        }

        }
        int aux = array[arraypos];
        int[] arrayaux = new int[length];
        for (int i=0; i<length; i++) {
            if (i<=arraypos) {
            arrayaux[i+1] = array[i]; }
            else {
                arrayaux[i] = array[i];
            }
        }
        arrayaux[0] = aux;

        for (int i=0; i<length; i++) {
            System.out.print(arrayaux[i]+" ");
        }

    }
}