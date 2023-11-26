import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
        System.err.println(autonomo1);

        //Sociedad Hijo Cliente
        Sociedad sociedad1 = new Sociedad();
        sociedad1.setCodigoCliente("3002");
        sociedad1.setDireccionPostal("28001");
        sociedad1.setPoblacion("Madrid");
        sociedad1.setEmail("Samanta@gmail.com");
        sociedad1.setTelefono("620087562");
        sociedad1.setCif("454872P");
        sociedad1.setRazonSocial("SL");
        System.err.println(sociedad1);

        //Productos
        Producto producto1 = new Producto();
        producto1.setCodigoProducto("101");
        producto1.setNombre("bombillo");
        producto1.setMarca("phillips");
        producto1.setModelo("N2");
        producto1.setPrecio("15€");
        producto1.setIva("20%");
        System.err.println(producto1);

        Producto producto2 = new Producto();
        producto2.setCodigoProducto("102");
        producto2.setNombre("Plafon");
        producto2.setMarca("phillips");
        producto2.setModelo("N1");
        producto2.setPrecio("35€");
        producto2.setIva("20%");
        System.err.println(producto2);

        //Servicios
        Servicio servicio1 = new Servicio();
        servicio1.setCodigo("401");
        servicio1.setNombre("Mantenimiento");
        servicio1.setPrecio("45€");
        servicio1.setIva("21%");
        System.err.println(servicio1);

        Servicio servicio2 = new Servicio();
        servicio2.setCodigo("402");
        servicio2.setNombre("Montaje Electrico");
        servicio2.setPrecio("180€");
        servicio2.setIva("21%");
        System.err.println(servicio2);

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
        System.err.println(factura2);


        ArrayList<Servicio> servicios = new ArrayList<>();
        servicios.add(servicio1);
        servicios.add(servicio2);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        imprimir(factura1);
        imprimir(factura2);
        imprimir(sociedad1);
        imprimir(autonomo1);
        imprimir(producto1);
        imprimir(producto2);
        imprimir(servicio1);
        imprimir(servicio2);

    }
        public static void imprimir (Factura factura1 ){
            System.out.println("Codigo:" + factura1.getCodigoFactura());
            System.out.println("Fecha:" + factura1.getFecha());
            System.out.println("Codigo:" + factura1.getBaseImponible());
            System.out.println("Codigo:" + factura1.getTotal());
        }

        public static void imprimir (Cliente cliente){
            System.out.println("Codigo:" + cliente.getCodigoCliente());
            System.out.println("Direccion" + cliente.getDireccionPostal());
            System.out.println("Poblacion" + cliente.getPoblacion());
            System.out.println("Email" + cliente.getEmail());
            System.out.println("Telefono" + cliente.getTelefono());

        }
        public static void imprimir (Producto producto1){
            System.out.println("Codigo:" + producto1.getCodigoProducto());
            System.out.println("Nombre:" + producto1.getNombre());
            System.out.println("Marca:" + producto1.getMarca());
            System.out.println("Modelo:" + producto1.getModelo());
            System.out.println("Precio:" + producto1.getPrecio());
            System.out.println("Iva:" + producto1.getIva());
        }
        public static void imprimir (Servicio servicio1){
            System.out.println("Codigo:" + servicio1.getCodigo());
            System.out.println("Nombre:" + servicio1.getNombre());
            System.out.println("Precio:" + servicio1.getPrecio());
            System.out.println("Iva:" + servicio1.getIva());
        }

/*
        public static void imprimir (Factura factura2){
            System.out.println("Codigo:" + factura2.getCodigoFactura());
            System.out.println("Fecha:" + factura2.getFecha());
            System.out.println("Codigo:" + factura2.getBaseImponible());
            System.out.println("Codigo:" + factura2.getTotal());

        }

        public static void imprimir (Cliente cliente){
            System.out.println("Codigo:" + cliente.getCodigoCliente());
            System.out.println("Direccion" + cliente.getDireccionPostal());
            System.out.println("Poblacion" + cliente.getPoblacion());
            System.out.println("Email" + cliente.getEmail());
            System.out.println("Telefono" + cliente.getTelefono());
        }
        public static void imprimir (Producto producto2){
            System.out.println("Codigo:" + producto2.getCodigoProducto());
            System.out.println("Nombre:" + producto2.getNombre());
            System.out.println("Marca:" + producto2.getMarca());
            System.out.println("Modelo:" + producto2.getModelo());
            System.out.println("Precio:" + producto2.getPrecio());
            System.out.println("Iva:" + producto2.getIva());
        }
        public static void imprimir (Servicio servicio2){
            System.out.println("Codigo:" + servicio2.getCodigo());
            System.out.println("Nombre:" + servicio2.getNombre());
            System.out.println("Precio:" + servicio2.getPrecio());
            System.out.println("Iva:" + servicio2.getIva());
        }*/
    }
