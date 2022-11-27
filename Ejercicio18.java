public class Ejercicio18 {
    public static void main(String args[]) {
        int length = 10;
        int[] array = new int[length];
        int count = 0;
        boolean comp = false;
        for (int i=0; i<length; i++) {
            array[i] = (int)(Math.random()*201);
        }
        for (int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
        int[] arrayaux = new int[length];
        for (int i=0; i<length; i++) {
            count = 0;
            comp = false;
            if (i%2==0) {
                while (count<length && comp==false) {
                    if (array[count]>0 && array[count]<100) {
                        arrayaux[i] = array[count];
                        array[count]=0;
                        comp = true;
                    } else {
                        count++;
                    }
                }
                if (comp==false) {
                    count = 0;
                    while (count<length && comp==false) {
                        if (array[count]>=100) {
                            arrayaux[i] = array[count];
                            array[count]=0;
                            comp = true;
                        } else {
                            count++;
                        }
                    }
                }
            }
            else {
                while (count<length && comp==false) {
                    if (array[count]>=100) {
                        arrayaux[i] = array[count];
                        array[count]=0;
                        comp = true;
                    } else {
                        count++;
                    }
                }
                if (comp==false) {
                    count = 0;
                    while (count<length && comp==false) {
                        if (array[count]>0 && array[count]<100) {
                            arrayaux[i] = array[count];
                            array[count]=0;
                            comp = true;
                        } else {
                            count++;
                        }
                    }
                }
                
                }
            }
            System.out.println();
            for (int i=0; i<length; i++) {
                System.out.print(arrayaux[i]+" ");
            }
        }
        
    }