/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuencias.logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
  public void lanzamiento() {
        Dado a = new Dado();
        a.Dado();
        Dado b = new Dado();
        b.Dado();
        int c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0;
        for (int i = 0; i < 1000; i++) {
            int suma= b.Dado()+ a.Dado();
            if(suma==2){
                c=c+1;
            }
            if(suma==3){
                d=d+1;
            }
            if(suma==4){
                e=e+1;
            }
            if(suma==5){
                f=f+1;
            }
            if(suma==6){
                g=g+1;
            }
             if(suma==7){
                h=h+1;
            }
              if(suma==8){
                j=j+1;
            }
               if(suma==9){
                k=k+1;
            }
                if(suma==10){
                l=l+1;
            }
                 if(suma==11){
                m=m+1;
            }
                  if(suma==12){
                n=n+1;
            }
        }
          System.out.println("Se relaizaron "+(c+d+e+f+g+h+j+k+l+m+n) + " lanzamientos");
        System.out.println("\nFrecuencia 2: "+c+"\nFrecuencia 3: "+d+"\nFrecuencia 4: "+e+"\nFrecuencia 5: "+f+"\nFrecuencia 6: "+g+"\nFrecuencia 7: "+h+"\nFrecuencia 8: "+j+"\nFrecuencia 9: "+k+"\nFrecuencia 10: "+l+"\nFrecuencia 11: "+m+"\nFrecuencia 12: "+n);
      
    }  
}
