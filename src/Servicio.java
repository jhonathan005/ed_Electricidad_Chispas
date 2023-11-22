public class Servicio {
    private String codigoServicio;
    private String nombre;
    private String precio;
    private String iva;

    public String getCodigo() {
        return codigoServicio;
    }

    public void setCodigo(String codigo) {
        this.codigoServicio = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
}
