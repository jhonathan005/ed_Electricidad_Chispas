public class Sociedad extends Cliente {
    public Sociedad(){
        setTipo("Sociedad");
    }
    private String cif;
    private String razonSocial;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
