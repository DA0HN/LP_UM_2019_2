package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TestSet {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("chaves");
		lista.add("chaves");
		lista.add("chaves");
		
		
		// set não importa a ordem e não duplica elemento ( funciona como o Hash )
		Set<String> set = new HashSet<>();
		Stack<String> lista2 = new Stack<String>();
		LinkedList<String> linked = new LinkedList<String>();
		
		lista2.push("gabriel");
		lista2.push("g");
		lista2.push("a");
		lista2.push("b");
		lista2.push("a");
		lista2.push("gabriel");
		lista2.push("g");
		lista2.push("b");
		
		lista2.pop();
		lista2.pop();
		
		lista2.forEach(System.out::println);
		
		
	}
	
}