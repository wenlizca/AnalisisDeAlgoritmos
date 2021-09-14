/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author wendo
 */
public class InsertionSort 
{
    public static int[] ordenamientoSort(int[] arreglo)
    {
        double NumeroInteraciones=0;
        double NumeroVerificaciones=0;
        long tiempoInicio, tiempoEstimado, tiempoFinal; 
        
        
        // calculamos el tiempo Inicial del sistema en milis
        tiempoInicio=System.currentTimeMillis();
        
        for (int i = 1; i < arreglo.length; ++i) 
        {
            int key = arreglo[i];
            int j = i - 1;
 
            /* Muevo los elementos del arreglo[0..i-1], 
            que son mayores que la clave, a una posición 
            por delante de su posición actual */
            while (j >= 0 && arreglo[j] > key) 
            {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                
                //Cuenta el número de intercambios
                NumeroInteraciones++;
            }
            arreglo[j + 1] = key;
            
            //Cuenta el número de verificaciones
            NumeroVerificaciones++;
        }
        
        // calculamos el tiempo Final del sistema en milis
        tiempoFinal=System.currentTimeMillis();
        
        // calculamos el tiempo Estimado del sistema en milis
        tiempoEstimado = (tiempoFinal - tiempoInicio)/1000;
        
        System.out.println("Tiempo Inicio: "+tiempoInicio);
        System.out.println("Tiempo Estimado: "+tiempoEstimado);
        System.out.println("Tiempo Final: "+tiempoFinal);
        System.out.println("Iteraciones totales: "+NumeroInteraciones);
        System.out.println("Numero Verificaciones totales: "+NumeroVerificaciones);
        
        return arreglo;
    }
 
    static void printArray(int[] arreglo)
    {
        for (int i = 0; i < arreglo.length; ++i)
        {
            System.out.print(arreglo[i]+"\n");
        }
        System.out.println("\n");
    }
 
    
    public static void main(String args[])
    {
        //Arreglos
        int array[];
        //Mejor de los casos
        int arregloM1[] = {1,2,3,4,5,6,7,8,9,10};
        //Media dificultad de los casos
        int arreglom1[] = {-6 , 3 ,7 , 1, 38 , 58 , 3443, -63563, 343, 15};
        //Peor de los casos
        int arregloP1[] = {10,9,8,7,6,5,4,3,2,1};
 
        //InsertionSort ob = new InsertionSort();
        array = ordenamientoSort(arreglom1);
        printArray(array);
        
    }
}
