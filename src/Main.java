public class Main {
    public static void main(String[]args) {

        //Autonomo Hijo Cliente

        Autonomo autonomo1 = new Autonomo();
        autonomo1.setDni("45872348A");
        autonomo1.setNombre("Juanito");
        autonomo1.setApellidos("Alvarez");
        autonomo1.setCodigoCliente("3001");
        autonomo1.setDireccionPostal("05002");
        autonomo1.setPoblacion("Avila");
        autonomo1.setEmail("jhonatha@gmail.com");
        autonomo1.setTelefono("623487562");

        //Sociedad Hijo Cliente
        Sociedad sociedad1 = new Sociedad();
        sociedad1.setCodigoCliente("3002");
        sociedad1.setDireccionPostal("28001");
        sociedad1.setPoblacion("Madrid");
        sociedad1.setEmail("Samanta@gmail.com");
        sociedad1.setTelefono("620087562");
        sociedad1.setCif("454872P");
        sociedad1.setRazonSocial("SL");

        //Productos
        Producto producto1 = new Producto();
        producto1.setCodigoProducto("101");
        producto1.setNombre("bombillo");
        producto1.setMarca("phillips");
        producto1.setModelo("N2");
        producto1.setPrecio("15€");
        producto1.setIva("20%");

        Producto producto2 = new Producto();
        producto2.setCodigoProducto("102");
        producto2.setNombre("Plafon");
        producto2.setMarca("phillips");
        producto2.setModelo("N1");
        producto2.setPrecio("35€");
        producto2.setIva("20%");

        //Servicios
        Servicio servicio1 = new Servicio();
        servicio1.setCodigo("401");
        servicio1.setNombre("Mantenimiento");
        servicio1.setPrecio("45€");
        servicio1.setIva("21%");

        Servicio servicio2 = new Servicio();
        servicio2.setCodigo("402");
        servicio2.setNombre("Montaje Electrico");
        servicio2.setPrecio("180€");
        servicio2.setIva("21%");

        //Facturas
        Factura factura1 = new Factura();
        factura1.setCodigoFactura("0001");
        factura1.setFecha("12-20-23");
        factura1.setBaseImponible("21%");
        factura1.setTotal("150€");

        Factura factura2 = new Factura();
        factura2.setCodigoFactura("0002");
        factura2.setFecha("05-04-23");
        factura2.setBaseImponible("21%");
        factura2.setTotal("400€");

    }
}