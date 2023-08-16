package estruturas;
import java.util.ArrayList;
import java.util.HashMap;

public class Tabelasimbolo {
    private HashMap<String, Simbolo> map;
    
    public Tabelasimbolo(){
        map = new HashMap<String, Simbolo>();
    }
    public void add(Simbolo simbolo){
        map.put(simbolo.getNome(), simbolo);
    }
    public boolean exists(String simboloNome){
        return map.get(simboloNome)!= null;
    }
    public Simbolo get(String simboloNome){
        return map.get(simboloNome);
    }
    
    public ArrayList<Simbolo> getAll(){
		ArrayList<Simbolo> lista = new ArrayList<Simbolo>();
		for (Simbolo simbolo : map.values()) {
			lista.add(simbolo);
		}
		return lista;
	}
}
