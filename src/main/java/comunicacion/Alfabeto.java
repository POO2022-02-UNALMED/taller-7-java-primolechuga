package comunicacion;
public class Alfabeto extends Pictograma{
    private static String letras [];
    private String interpretacion;

    public Alfabeto(String interpretacion,String letras[],String origen){
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
    public static void main(String[] args) {
        
    
    Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
			new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
			"Alfabeto latino");
            System.out.println(alfabeto);
    }
}