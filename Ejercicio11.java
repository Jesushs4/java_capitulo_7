import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] numlist = new int[10];
        int[] arrayaux = new int[10];
        int arrayposition = 0;
        int div;
        boolean comp = false;
        for (int i = 0; i<10; i++) {
            System.out.print("Introduzca un numero: ");
            numlist[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++) {
            div = 2;
            while (numlist[i]>div && comp == false) {
                if (numlist[i]%div==0) {
                    comp = true;
                }
                div++;
            }
            if (comp==false) {
                arrayaux[arrayposition] = numlist[i];
                arrayposition++;
            } comp = false;
            System.out.print(numlist[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<10; i++) {
            div = 2;
            while (numlist[i]>div && comp == false) {
                if (numlist[i]%div==0) {
                    comp = true;
                }
                div++;
            }
            if (comp==true) {
                arrayaux[arrayposition] = numlist[i];
                arrayposition++;
            } comp = false;
        }
        for (int i = 0; i<10; i++) {
            System.out.print(arrayaux[i]+" ");
        }

    }
    
}
