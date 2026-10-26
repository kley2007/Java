package com.example;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos el objeto vacío
        ProductoTienda miProducto = new ProductoTienda();
        
        // 2. Le asignamos los valores usando los setters
        miProducto.setCodigoBarras("12345678");
        miProducto.setNombre("Leche Deslactosada");
        
        // Imprimimos para probar
        System.out.println(miProducto);
        
            

        
    }
}