public class Ejercicio21 { 
    public static void main(String args[]) {
        int length = 15;
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            array[i] = (int)(Math.random()*501);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=0; i<length; i++) {
            if (array[i]%5==0) {
                System.out.print(array[i]+" ");
            } else if (array[i]%10<5) {
                array[i]/=10;
                array[i]*=10;
                array[i]+=5;
                System.out.print(array[i]+" ");
            } else if (array[i]%10>5) {
                array[i]/=10;
                array[i]*=10;
                array[i]+=10;
                System.out.print(array[i]+" ");
            }
        }
    }
    
}
