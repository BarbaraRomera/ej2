
package guia9_ej2.Servicios;

import guia9_ej2.Entidades.ParDeNumeros;

public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros numeros){
     
        System.out.println("el primer numero es: "+numeros.getNum1()+" y el segundo numero es: "+numeros.getNum2());
    }
    public void  devolverMayor(ParDeNumeros numeros){
    
        int num=Math.max(numeros.getNum1(), numeros.getNum1());
     
            System.out.println("el numero mayos es: "+num);
        
    }
    
    public void calcularPotencia(ParDeNumeros numeros){
        
        int max=Math.max(numeros.getNum1(), numeros.getNum2());
        int min=Math.min(numeros.getNum1(), numeros.getNum2());
        int valor= (int) Math.pow(max,min);
    
        System.out.println("el resultado de la potecia es: "+valor);
    }
    
    public void calculaRaiz(ParDeNumeros numeros){
    
         int min=Math.min(numeros.getNum1(), numeros.getNum2());
         double raiz=  Math.sqrt(min);
         System.out.println("el valor de la raiz del menor numero es: "+raiz);
    }
}
