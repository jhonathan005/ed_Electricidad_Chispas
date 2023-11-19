public class InvoicePrime {
    private String iva;
    private String lineaVentaProducto;
    private String lineaVentaServicio;
    private Factura factura;

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getLineaVentaProducto() {
        return lineaVentaProducto;
    }

    public void setLineaVentaProducto(String lineaVentaProducto) {
        this.lineaVentaProducto = lineaVentaProducto;
    }

    public String getLineaVentaServicio() {
        return lineaVentaServicio;
    }

    public void setLineaVentaServicio(String lineaVentaServicio) {
        this.lineaVentaServicio = lineaVentaServicio;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
