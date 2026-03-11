public class objMAtributos
{
    private int cod;
    private String nombre;
    private int cant;
    private int cantMini;

    public objMAtributos() {
    }

    public objMAtributos(int cod, String nombre, int cant, int cantMini) {
        this.cod = cod;
        this.nombre = nombre;
        this.cant = cant;
        this.cantMini = cantMini;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCantMini() {
        return cantMini;
    }

    public void setCantMini(int cantMini) {
        this.cantMini = cantMini;
    }

    
}