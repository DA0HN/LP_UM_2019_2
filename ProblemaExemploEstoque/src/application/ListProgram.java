package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();	// wraper class
		list.add("Gabriel");
		list.add("Honda");
		list.add("Bob");
		list.add("Eddie");
		list.add(2, "Mark");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		System.out.println("Tamanho da lista: "+list.size());
		list.remove(0);
		list.remove("Bob");
		System.out.println("------------------------");
		for(String str : list) {
			System.out.println(str);
		}
		list.add("Maria");
		list.add("Marcel");
		
		
		System.out.println("------------------------");
		for(String str : list) {
			System.out.println(str);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("------------------------");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		list.add("Gabriel");
		list.add("Honda");
		list.add("Bob");
		list.add("Eddie");
		list.add(2, "Mark");
		list.add("Maria");
		list.add("Marcel");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		List<String> result = list.stream().filter( x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String str : result) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		list.add("Gabriel");
		list.add("Honda");
		list.add("Bob");
		list.add("Eddie");
		list.add(2, "Mark");
		list.add("Maria");
		list.add("Marcel");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
	}
}
