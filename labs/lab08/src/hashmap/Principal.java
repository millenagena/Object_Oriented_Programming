package hashmap;

import java.util.*;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {
		
		Map<String, Empregado> empregados = new HashMap<>();
		
		empregados.put("1111", new Empregado("1111", 25, 1480.90));
		empregados.put("2222", new Empregado("2222", 18, 1000.90));
		empregados.put("3333", new Empregado("3333", 56, 3660.90));
		empregados.put("4444", new Empregado("4444", 32, 1500.90));
		empregados.put("5555", new Empregado("5555", 34, 5000.90));
		
		Set<Entry<String, Empregado>> a = empregados.entrySet();
        a.forEach(
        		associacao -> System.out.println(associacao.getKey() + " - " + associacao.getValue())
        );
	}

}
