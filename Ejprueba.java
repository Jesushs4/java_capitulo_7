import java.util.Scanner;
public class Ejprueba {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura y anchura de la matriz: ");
        int h = sc.nextInt();
    int[][] array = new int[h][h];
    for (int i = 0; i<h; i++) {
        for (int j = 0; j<h; j++) {
            if ((i+j)%2==0) {
                array[i][j]=1;
            } else {
                array[i][j]=0;
            }
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }

    }
}
