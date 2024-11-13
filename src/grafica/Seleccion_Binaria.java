package grafica;

import java.util.Random;

public class Seleccion_Binaria {
    int c;
    public boolean busqueda(int a[], int izq, int der, int x) {
        
        c = c + 1;
        if (izq > der) {
            c = c + 1;
            return false;
        } else {
            int m;
            c = c + 1;
            m = (int)((der-izq) / 2)+izq;
            c = c + 4;
            if (x == a[m]) {
                c = c + 2;
                return true;
            } else {
                c = c + 1;
                if (x < a[m]) {
                    c = c + 2;
                   return busqueda(a, izq, m - 1, x);
                } else {
                    return busqueda(a, m + 1, der, x);
                }
            }
        }
    }
    
    
    public int SeleccionBinaria(int N){
        c=0;
        Random r = new Random();
        int array[] = new int[N];
        boolean encontrar;
        for(int k=0; k<N;k++){
            array[k] = r.nextInt(20000);
        }
        encontrar = busqueda(array, 0, N, 50);
        return c;
        
    }

}
