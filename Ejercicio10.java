public class Ejercicio10 {
    public static void main(String args[]) {
        int[] numlist = new int[20];
        int[] arrayaux = new int[20];
        int arrayposition = 0;
        for (int i = 0; i<20; i++) {
            numlist[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i<20; i++) {
            if (numlist[i]%2==0) {
                arrayaux[arrayposition] = numlist[i];
                arrayposition++;
            }
            System.out.print(numlist[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<20; i++) {
            if (numlist[i]%2!=0) {
                arrayaux[arrayposition] = numlist[i];
                arrayposition++;
            }
        }
        for (int i = 0; i<20; i++) {
            System.out.print(arrayaux[i]+" ");
        }

    }
    
}
