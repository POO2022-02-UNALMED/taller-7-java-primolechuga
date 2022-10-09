package comunicacion;
public class Tesis extends Escrito{
    private String idea;
    private String argumentos[];
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen,String titulo, String autor, int paginas,String idea,String argumentos[],String conclusion,String referencias,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea=idea;
        this.argumentos=argumentos;
        this.conclusion=conclusion;
        this.referencias=referencias;
        this.interpretacion=interpretacion;

    }
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas()*5;
    }
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }
    @Override
    public String toString() {
        String txt=getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getIdea()+"\n"+getArgumentos().length+"\n"+getConclusion()+"\n"+getReferencias();
        return txt;
    }
    public String getIdea() {
        return idea;
    }
    public void setIdea(String idea) {
        this.idea = idea;
    }
    public String[] getArgumentos() {
        return this.argumentos;
    }
    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    public String getReferencias() {
        return referencias;
    }
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public static void main(String[] args) {
        Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
			"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
        System.out.println(tesis);
    }
}