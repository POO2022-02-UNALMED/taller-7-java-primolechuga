package comunicacion;

public class Fabula  extends Escrito{
    private String ensenanza;
    private String interpretacion;
    public Fabula(String origen,String titulo, String autor, int paginas,String ensenaza,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenaza;
        this.interpretacion=interpretacion;

    }
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina;
    }
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }
    @Override
    public String toString() {
        String txt=getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getEnsenanza();
        return txt;
    }
    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenaza(String ensenaza) {
        this.ensenanza = ensenaza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}