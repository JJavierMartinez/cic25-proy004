package es.cic25.curso;

public class Sumatorio {
    
    public void lanzar() {
        int a = 0;
        int suma = 0;
        int numeros[] = new int[10];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = i + 1;
        }

        for(int i=0; i<numeros.length; i++){
            suma += numeros[i];

        }
    }

}
