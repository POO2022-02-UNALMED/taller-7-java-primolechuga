package comunicacion;
public class Alfabeto extends Pictograma{
    private static String letras [];
    private String interpretacion;

    public Alfabeto(String origen,String letras[],String interpretacion){
        super(origen);
        this.interpretacion=interpretacion;
        Alfabeto.letras=letras;
    }
    public int cantidadLetras(){
        return letras.length;

    }
    public String interpretacion(){
        return this.interpretacion;

    }
    public String toString(){
        String print="";
        for(int i=0;i<letras.length;i++){
            if (i==((letras.length)-1)){
                print+=(letras[i]+"");
            }else{
                print+=letras[i]+", ";
            }    
        }
        return print;

    }
    public static String[] getLetras() {
        return letras;
    }
    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}