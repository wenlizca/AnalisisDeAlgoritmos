/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.ArrayList;

/**
 *
 * @author wendo
 */
public class Burbuja {
    
    //variables globales
    private int bandera;
    private int numIntercambios, numVerificaciones;
    double tInicio;
    public long tiempoInicio=0;
    private double tFinal;
    private double tTotal;
    
    //Método constructor
    public void Burbuja()
    {
        this.bandera=0;
        this.numIntercambios=0;
        this.numVerificaciones=0;
        this.tInicio=0;
        this.tFinal=0;
        this.tTotal=0;
    }

    public double gettInicio() {
        return tInicio;
    }

    public double gettFinal() {
        return tFinal;
    }

    public double gettTotal() {
        return tTotal;
    }
    
    
    //private static int[] burbujaTradicional(int[] arreglo)
    public void burbujaTradicional() 
    {
        int aux;
        int arreglo[]= {1,2,3,4,5,6,7,8,9,10};;

        // calculamos el tiempo del sistema en milis
        //double tiempo_i= System.currentTimeMillis();
        
        double tiempoEstimado= 0;
        double tiempoFinal = 0;
        
        //
        double NumeroInteraciones=0;
        double NumeroVerificaciones=0;
        
        
        // calculamos el tiempo del sistema en milis
        tiempoInicio = System.currentTimeMillis();
        for(int i = 1; i < arreglo.length; i++)
        {
            for(int j = 0;j < arreglo.length-i;j++)
            {
                if(arreglo[j] > arreglo[j+1])
                {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    
                    NumeroInteraciones++;
                } 
                NumeroVerificaciones++;
            }
        }
        
        //array = arreglo;//pasa el arreglo ya ordenado
        //return array; //retornaba el array porque quería ver su efectividad, 
        
        tiempoFinal=System.currentTimeMillis();
        
        tiempoEstimado = (tiempoFinal - tiempoInicio)/1000;
        
        System.out.println("Tiempo Inicio: "+tiempoInicio);
        System.out.println("Tiempo Estimado: "+tiempoEstimado);
        System.out.println("Tiempo Final: "+tiempoFinal);
        System.out.println("Iteraciones totales: "+NumeroInteraciones);
        System.out.println("NumeroVerificaciones totales: "+NumeroVerificaciones);
    }
    
    
    private static int[] burbujaOptimizado(int[] arreglo) 
    {
        int[] array;
        int aux;
        boolean cambiar = true;
        
        
        while(cambiar)
        {
            cambiar = false;
            for(int j = 0 ; j < arreglo.length - 1 ; j++)
            {
                if(arreglo[j] >  arreglo[j+1])
                {
                    //Intercambiando los valores
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    cambiar = true;
                }
            }
        }
        
        array = arreglo;
        return array;
    }
    
    public static void main(String[] args) 
    {
        
        //Arreglos
        int array[];
        //Mejor de los casos
        int arregloM1[] = {1,2,3,4,5,6,7,8,9,10};
        int arregloM2[] = {0,1,2,3,5,4,6,7,8,9};
        //Media dificultad de los casos
        int arreglom1[] = {-6 , 3 ,7 , 1, 38 , 58 , 3443, -63563, 343, 15};
        int arreglom2[] = {6 , 3 ,-7 , 1, 38 , 58 , -3443, 63563, -343, 341,45,-2456};
        //Peor de los casos
        int arregloP1[] = {10,9,8,7,6,5,4,3,2,1};
        int arregloP2[] = {9,8,7,6,5,4,3,2,1,0};
        
        
        
        
        //BURBUJA TRADICIONAL
            
        //burbujaTradicional();
            //mejor de los casos
            //array = burbujaTradicional(arregloM1);
                //impresión arreglo
//                for(int i = 0; i < array.length;i++)
//                {
//                    System.out.println(array[i]);
//                }
//                System.out.println("\n");

            //array = burbujaTradicional(arregloM2);
            //media dificultad
//            array = burbujaTradicional(arreglom1);
//            array = burbujaTradicional(arreglom2);
//            //peor de los casos
//            array = burbujaTradicional(arregloP1);
//            array = burbujaTradicional(arregloP2);
        
        //BURBUJA OPTIMIZADO
            //mejor de los casos
//            array = burbujaOptimizado(arregloM1);
//                //impresion arreglo
//                for(int i = 0; i < array.length;i++)
//                {
//                    System.out.println(array[i]);
//                }
//                System.out.println("\n");
//
//            array = burbujaOptimizado(arregloM2);
//            //media dificultad
//            array = burbujaOptimizado(arreglom1);
//            array = burbujaOptimizado(arreglom2);
//            //Peor de los casos
//            array = burbujaOptimizado(arregloP1);
//            array = burbujaOptimizado(arregloP2);


    }
}
