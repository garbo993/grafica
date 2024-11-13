/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

/**
 *
 * @author gabyh
 */
public class QuickSort {
  int cradix = 0;// Op.Elemen.
  void escribir(int []a, int N,int c){
    int i;
    for(i = 0; i < N; i++){
      if(i%80 == 0){
        System.out.println();
      }
      System.out.print(" "+a[i]);
    }
    System.out.println();
    System.out.println("OE = "+c);
  } // escribir()

  void insertar (int numero, int lista ,
      int []info, int []sig, int []r, int []rp){
    int nuevo,p;
    nuevo = sig[0];
    sig[0] = sig[nuevo];
    info[nuevo] = numero;
    sig[nuevo] = 0;
    p = r[lista];
    cradix = cradix+12;
    if(p == 0){
      cradix = cradix+5;
      r[lista] = nuevo;
      rp[lista] = nuevo;
      return;
    }
    cradix = cradix+6;
    p = rp[lista];
    sig[p] = nuevo;
    rp[lista] = nuevo;
  } // insertar()

  void recuperar(int []a,int []info,
    int []sig, int[]r, int []rp){
    int i,j = 0,p;
    cradix  =   cradix+2;
    for(i = 0; i < 10; i++){
      cradix =   cradix+4;
      p = r[i];
      while(p != 0){
        cradix =   cradix+7;
        a[j] = info[p];
        j++;
        p = sig[p];
      }
      r[i] = 0;
      rp[i] = 0;
      cradix =   cradix+5;
    }
  } // recuperar()

  int clasificar(int N){
    cradix =0;
    int i;
    int []r = new int [10];
    int []rp = new int [10];
    int []a = new int [N];
    int pot = 1,aux;
    cradix =  cradix+1;
    for(i = 0;i < 10; i++){
      cradix =  cradix+6;	
      r[i] = 0;
      rp[i] = 0;
    }//llena le arreglo 
    cradix =  cradix+1;
    for(i = 0; i < N; i++){
      a[i] = N-i;  
    }
    //escribir(a,N,cradix);//escribe el arreglo desorganizado 
    
    cradix =  cradix+1;
    for(i = 0; i < 3; i++){
      cradix =  cradix+5;
      int []info = new int[N+1];
      int []sig = new int[N+1];
      int xi, j, d;
      for(xi = 0; xi < N+1; xi++){
        cradix =  cradix+7;
        info[xi] = -1;
        sig[xi] = xi+1;
      }
      sig[N] = 0;
      cradix =  cradix+3;
      for(j = 0; j < N ; j++){
        cradix =  cradix+11;
        aux = a[j] / pot;// halla el de la mitad
        d = aux % 10;
        insertar(a[j], d,info,sig,r,rp);//compara los numeros 
      }
      cradix =   cradix+1;
      recuperar(a,info,sig, r,rp);
      pot = pot*10;
    }
    //System.out.println("Numeros clasificados");
    //escribir(a,N,cradix);
    return cradix;
  } // clasificar()
  
} //class RadixSort1 