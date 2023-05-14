
package guia9_ej2;

import guia9_ej2.Entidades.ParDeNumeros;
import guia9_ej2.Servicios.ParDeNumerosService;

public class Guia9_ej2 {

    public static void main(String[] args) {
       ParDeNumeros numeros=new ParDeNumeros(0, 0);
       ParDeNumerosService service=new ParDeNumerosService();
       service.mostrarValores(numeros);
       service.devolverMayor(numeros);
       service.calcularPotencia(numeros);
       service.calculaRaiz(numeros);
      
    }
    
}
