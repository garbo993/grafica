/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

public class seleccion {
    
    public int seleccion(int N){  
    int t, i, j, x = 0;
    int a[]=new int [N];
	
	for (j=0; j<N ;j++){
		a[j]=N-j;
	}
	int c=1;
	for(i=0; i < N/2; i++){
		c=c+6;
		x=i;
		for(j=i+1; j< N-i; j++){
			c=c+5;
			if(a[x] > a[j] ){
				x=j;
				c=c+1;
			}
		}
	
	c=c+2;
	if(i!= x){
		c=c+7;
		t=a[i];
		a[i]=a[x];
		a[x]=t;
	}        
        }
        c = c+2;
        //System.out.println("este es por seleccion "+c
        return c;
    }

}
    

