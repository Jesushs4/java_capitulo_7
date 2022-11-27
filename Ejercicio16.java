import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = 20;
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            array[i] = (int)(Math.random()*401);
        }
        for (int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.printf("\n¿Qué numeros quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int option = sc.nextInt();
        switch (option) {

            case 1:
            for (int i=0; i<length; i++) {
                System.out.print((array[i]%5)==0 ? "["+array[i]+"] " :array[i]+" ");
            }
            break;

            case 2:
            for (int i=0; i<length; i++) {
                System.out.print((array[i]%7)==0 ? "["+array[i]+"] " :array[i]+" ");
            }
            break;

            default:
            break;
        }
    }   
}
