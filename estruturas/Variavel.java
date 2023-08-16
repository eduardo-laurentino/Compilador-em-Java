package estruturas;

public class Variavel extends Simbolo{
    public static final int NUMERO = 0;
    public static final int TEXTO = 1;

    private int tipo;
    private String value;
    public Variavel (String nome, int tipo, String value){
        super(nome);
        this.tipo = tipo;
        this.value = value;
    }
    public int getTipo(){
        return tipo;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "Variavel[nome = " + nome + ", tipo = " + tipo + ", value = " + value + "]";
    }
}
