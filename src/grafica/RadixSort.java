package grafica;

public class RadixSort {

    int c;

    public int[] OrdenarRadixSort(int R[]) {
        int Matriz[][] = new int[10][R.length + 1];
        c = c + 5;
        int pot = 1;
        Matriz = vaciarmatriz(Matriz);
        while (Matriz[0][R.length] == -1) {
            Matriz = vaciarmatriz(Matriz);
            c+=2;
            for (int i = 0; i < R.length; i++) {
                int num = R[i] / pot;
                int fila = num % 10;
                int columna = Matriz[fila][0];
                Matriz[fila][columna] = R[i];
                Matriz[fila][0]++;
                c+=17;
            }
            int pos = 0;
            c+=2;
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k <= R.length; k++) {
                    if (Matriz[j][k] >= 0) {
                        R[pos] = Matriz[j][k];
                        pos++;
                        c+=5;
                    }
                    c+=3;
                }
                c+=4;
            }
            //imprimirMatriz(Matriz,R.length+1);
            pot *= 10;
            c+=1;

        }

        return R;
    }

    /*private void imprimirMatriz(int[][] Matriz,int tamaño) {
        for(int i=0;i<10;i++){
            for(int j=0;j<tamaño;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n\n\n");
    }*/
    private int[][] vaciarmatriz(int[][] Matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < Matriz[1].length; j++) {
                if (j == 0) {
                    Matriz[i][j] = 1;
                } else {
                    Matriz[i][j] = -1;
                }
            }
        }
        return Matriz;
    }
    
    
    public int RadixSort(int N){
        int array[] = new int[N];
        c=0;
        for(int j =0; j<N;j++){
            array[j] = N-j;
        }
        
        OrdenarRadixSort(array);
        
        return c;
    }
}
