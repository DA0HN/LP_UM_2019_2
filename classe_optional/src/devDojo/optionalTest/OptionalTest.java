package devDojo.optionalTest;

import java.util.Optional;

public class OptionalTest {
	
	private String nome;
	
	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest();
		
		Optional<String> optional1 = Optional.of("batata");
		Optional<String> optional2 = Optional.empty();
		Optional<String> optional3 = Optional.ofNullable(ot.nome);
		
		System.out.println(optional1);
		System.out.println(optional2);
		optional3.ifPresent(System.out::println);
		
	}
	
	
}
