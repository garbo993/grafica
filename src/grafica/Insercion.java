
package grafica;


public class Insercion {
    
    public int insercion(int N){                                            
    int i, j;
    int aux;
    int c = 0;
    int a[]=new int [N];
    c=c+4;
    for (i=0; i < N ;i++){
         a[i]= N-i;
    }
    
    for (i = 1; i < N ; i++){
        
        aux = a[i] ;           
        j = i-1;
       
        c=c+8;
        while ((j >-1 ) && (aux < a[j])){                                 
        a[j + 1] = a[j];   
        //j--;
        // a[j]=aux;
        j=j-1;
        c=c+8;
        }
    a[j + 1] = aux;
    c=c+4;
    
    }
    //System.out.println ("este es por insercion " + c);
    return c;
    }
}
