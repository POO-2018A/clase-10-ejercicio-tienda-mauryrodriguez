package ejerciciotienda;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("\t\t\tProductos Rodriguez");
            System.out.println("1. Ingresar productos ");
            System.out.println("2. Visualizar lista de productos ");
            System.out.println("3. Salir ");
            System.out.println();
            System.out.println("Seleccione una opcion: ");
            opcion= sc.nextInt();
            
        switch (opcion){
            case 1:
                System.out.print("Ingrese el numero de Productos: ");
                int numPro = sc.nextInt();
                ClaseProducto [] articulos = new ClaseProducto [numPro];
                    for (int i=0; i< articulos.length;i++){
                        System.out.println(" Producto "+(i+1));
                        sc.nextLine();
                    
                        System.out.println(" *Marca: ");
                        String marca = sc.nextLine();
                    
                        System.out.println(" *Codigo: ");
                        String codigo = sc.nextLine();
                    
                        System.out.println(" *Tipo: ");
                        String tipo = sc.nextLine();
                    
                        System.out.println(" $Precio: ");
                        double precio = sc.nextDouble();
                        
                        articulos [i] = new ClaseProducto(marca,codigo,tipo,precio);
                    }
                    System.out.println("Ingrese una opcion: ");
                    System.out.println("1.- Retornar");
                    System.out.println("2.- Visualizar productos ingresados");
                    
                    int alternativa;
                    alternativa = sc.nextInt();
                    if (alternativa ==1){
                        
                    }else if(alternativa  == 2){
                        System.out.println("\t\t Productos Rodriguez ");
                        System.out.println("----LISTA DE PRODUCTOS---");
                        for (int i=0; i< articulos.length; i++){
                            System.out.println("    Producto # "+(i+1)+": ");
                            System.out.println("*Marca: "+articulos[i].getMarca());
                            System.out.println("*Codigo: "+articulos[i].getCodigo());
                            System.out.println("*Tipo: "+articulos[i].getTipo());
                            System.out.println("$Precio: "+articulos[i].getPrecio());
                        }
                        System.out.println("Presiona 1 para retornar");
                        System.out.println();
                        int retornar;
                        retornar = sc.nextInt();
                        if (retornar ==1){
                        }else{   
                        }
                    }
                break;
            case 2:
                break;
            default:
                System.out.println("INGRESE UN AOPCION CORRECTA !!!!");
                break;
         
        } 
        }while (opcion!=3);
        System.out.println("HASTA LA PROXIMA !!!! :)");
    }
}
