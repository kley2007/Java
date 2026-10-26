package com.example;

public class ProductoTienda {
    
    // 9 Atributos privados con diferentes tipos de datos (camelCase)
    private String codigoBarras;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stockDisponible;
    private boolean disponibleParaVenta;
    private char pasilloUbicacion;
    private double descuentoMaximo;
    private String proveedor;
    private boolean requiereRefrigeracion;


    // 1. Constructor por defecto (vacío)

    public ProductoTienda() {
    }

   
    // 2. Constructor parametrizado (usando this)
    
    public ProductoTienda(String codigoBarras, String nombre, String categoria, double precioUnitario, 
                          int stockDisponible, boolean disponibleParaVenta, char pasilloUbicacion, 
                          double descuentoMaximo, String proveedor, boolean requiereRefrigeracion) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;
        this.disponibleParaVenta = disponibleParaVenta;
        this.pasilloUbicacion = pasilloUbicacion;
        this.descuentoMaximo = descuentoMaximo;
        this.proveedor = proveedor;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

 
    // 3. Métodos Getters y Setters
    

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        if (stockDisponible >= 0) {
            this.stockDisponible = stockDisponible;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    public boolean isDisponibleParaVenta() {
        return disponibleParaVenta;
    }

    public void setDisponibleParaVenta(boolean disponibleParaVenta) {
        this.disponibleParaVenta = disponibleParaVenta;
    }

    public char getPasilloUbicacion() {
        return pasilloUbicacion;
    }

    public void setPasilloUbicacion(char pasilloUbicacion) {
        this.pasilloUbicacion = pasilloUbicacion;
    }

    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }

    public void setDescuentoMaximo(double descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isRequiereRefrigeracion() {
        return requiereRefrigeracion;
    }

    public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

   
    // 4. Método toString()
    
    @Override
    public String toString() {
        return "ProductoTienda {" +
                "codigoBarras='" + codigoBarras + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stockDisponible=" + stockDisponible +
                ", disponibleParaVenta=" + disponibleParaVenta +
                ", pasilloUbicacion=" + pasilloUbicacion +
                ", descuentoMaximo=" + descuentoMaximo +
                ", proveedor='" + proveedor + '\'' +
                ", requiereRefrigeracion=" + requiereRefrigeracion +
                '}';
    }
}

