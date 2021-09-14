/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import static burbuja.BurbujaTradicional.ordenamientoBurbujaTradicional;

/**
 *
 * @author wendo
 */
public class BurbujaOptimizado 
{
    //Declaración de variables
    private int bandera;
    private int numIntercambios, numVerificaciones;
    private double tInicio;
    private long tiempoInicio;
    private double tFinal;
    private double tEstimado;
    
    //Método constructor
    public BurbujaOptimizado() 
    {
        this.numIntercambios = 0;
        this.numVerificaciones = 0;
        this.bandera = 1;
        this.tInicio = 0;
        this.tEstimado = 0;
        this.tFinal = 0;
    }
    
    
    public static int[] ordenamientoBurbujaOptimizado(int[] arreglo) 
    {
        int aux;
        boolean cambiar = true;
        double NumeroInteraciones=0;
        double NumeroVerificaciones=0;
        long tiempoInicio, tiempoEstimado, tiempoFinal; 
        
        // calculamos el tiempo Inicial del sistema en milis
        tiempoInicio=System.currentTimeMillis();
        
//        while(cambiar && cambiar == true)
//        {
//            cambiar = false;
//            for(int j = 0 ; j < arreglo.length - 1 ; j++)
//            {
//                if(arreglo[j] >  arreglo[j+1])
//                {
//                    //Intercambiando los valores
//                    aux = arreglo[j];
//                    arreglo[j] = arreglo[j+1];
//                    arreglo[j+1] = aux;
//                    cambiar = true;
//                    
//                    NumeroInteraciones++;
//                }
//                NumeroVerificaciones++;
//            }
//        }

        for(int i = 0; i < arreglo.length - 1; i++) {
                cambiar = false;
                for(int j = 0; j < arreglo.length - i - 1; j++) {
                    // Se ejecuta el intercambio de datos
                    if(arreglo[j] > arreglo[j+1]) {
                        cambiar = true;
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        
                        // Cuenta el número de intercambios
                        NumeroInteraciones++;
                    }
                    // Cuenta el número de verificaciones
                    NumeroVerificaciones++;
                }
            }
        
        // calculamos el tiempo Final del sistema en milis
        tiempoFinal=System.currentTimeMillis();
        
        // calculamos el tiempo Estimado del sistema en milis
        tiempoEstimado = (tiempoFinal - tiempoInicio)/1000;
        
        System.out.println("Tiempo Inicio: "+tiempoInicio);
        System.out.println("Tiempo Estimado: "+tiempoEstimado);
        System.out.println("Tiempo Final: "+tiempoFinal);
        System.out.println("Iteraciones totales: "+NumeroInteraciones);
        System.out.println("NumeroVerificaciones totales: "+NumeroVerificaciones);
        
        return arreglo;
    }
    
    public static void main(String[] args) 
    {
        //Arreglos
        int array[];
        //Mejor de los casos
        int arregloM1[] = {1,2,3,4,5,6,7,8,9,10};
        //Media dificultad de los casos
        int arreglom1[] = {-6 , 3 ,7 , 1, 38 , 58 , 3443, -63563, 343, 15};
        //Peor de los casos
        int arregloP1[] = {10,9,8,7,6,5,4,3,2,1};
        
        
        //mejor de los casos
            array = ordenamientoBurbujaOptimizado(arreglom1);
                //impresión arreglo
                for(int i = 0; i < array.length;i++)
                {
                    System.out.println(array[i]);
                }
                System.out.println("\n");

    }
}
