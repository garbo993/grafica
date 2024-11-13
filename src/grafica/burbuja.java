
package grafica;

    public class burbuja {
    
        public  int  burbuja(int N)  {
        int temp = 0; //+1
        int c= 0;
        int a[]=new int [N];
 
        for(int i = 0; i < N; i++) {
        a[i]=N - i;
        } 
        c=c+3;
            for(int i=0; i < N-1; i++) {
            c=c+6;
                for(int j = i + 1; j < N; j++) {
               c=c+5; 
                    if(a[i] > a[j]) {   
                    temp = a[i]; 
                    a[i]=a[j];
                    a[j]=temp;
                    c=c+7;    
                    }
                }
            }
        //System.out.println("este es por burbuja " + c);
        return c;
        }
}
