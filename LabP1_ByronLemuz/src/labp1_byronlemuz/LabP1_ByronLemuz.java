/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_byronlemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class LabP1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         int opcion = 0;
         
         while(opcion !=4){
             System.out.println("-----MENU-----");
             System.out.println("1. Socios");
             System.out.println("2. Determinar mayor");
             System.out.println("3. ¿Triangulo o no?");
             System.out.println("4. Salir");
             opcion = leer.nextInt();
             
             if (opcion == 1) {
                 int gradoSocio;
        float totalCompra, descuento, totalFinal;
        boolean seguir = true;
        
        while (seguir) {
            System.out.print("Ingrese el grado de socio (0-3): ");
            gradoSocio = leer.nextInt();
            
            if (gradoSocio < 0 || gradoSocio > 3) {
                System.out.println("Grado de socio inválido. Por favor ingrese un valor entre 0 y 3.");
                continue;
            }
            
            System.out.print("Ingrese el total de la compra: $");
            totalCompra = leer.nextFloat();
            
            if (gradoSocio == 0) {
                descuento = 0;
            } else if (gradoSocio == 1) {
                descuento = 0.10f;
            } else if (gradoSocio == 2) {
                descuento = 0.15f;
            } else {
                descuento = 0.25f;
            }
            
            totalFinal = totalCompra - (totalCompra * descuento);
            System.out.printf("El total a pagar con el descuento es: $%.2f\n", totalFinal);
            
            System.out.print("Desea calcular el descuento de otro cliente? (1 si / 0 no): ");
            seguir = leer.nextInt() == 1;
        }
    }
             }
             }
             else if (opcion == 2)  {
     Scanner leer = new Scanner(System.in);

    int numero, mayor = Integer.MIN_VALUE; // inicialize el mayor mayor con el menor valor posible de un int 
        boolean seguir = true;
        
        while (seguir) {
            System.out.print("Ingrese un número: ");
            numero = leer.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            System.out.print("Desea ingresar otro número? (1 si / 0 no): ");
            seguir = leer.nextInt() == 1;
        }
        
        System.out.println("El número mayor ingresado es: " + mayor);
    }
}

             else if (opcion == 3) 

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean seguir = true;
        
        while (seguir) {
            System.out.print("Ingrese la longitud del lado a: ");
            a = sc.nextInt();
            
            System.out.print("Ingrese la longitud del lado b: ");
            b = sc.nextInt();
            
            System.out.print("Ingrese la longitud del lado c: ");
            c = sc.nextInt();
            
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Las longitudes ingresadas forman un triángulo válido.");
            } else {
                System.out.println("Las longitudes ingresadas no forman un triángulo válido.");
            }
            
            System.out.print("Desea ingresar otras longitudes? (1 si / 0 no): ");
            seguir = sc.nextInt() == 1;
        }
    }
}

             }
             else if (opcion == 4) {
                 System.out.println("Terminando la ejeccion");
             
             else {
                  System.out.println("La opcion que ingreso no es valida");
                 
             
}}
        


    
    

