package aula176.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import aula176.interfaces.CarrosPredicate;
import aula176.model.Carro;
import aula176.predicate.CarrosDezAnosRecentePredicate;

public class CarroTest {
	
	private static List<Carro> filtrarCarroDezAnosFabricados(List<Carro> carros){
		List<Carro> result = new ArrayList<>();
		for(Carro carro : carros) {
			if( carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10) )
				result.add(carro);
		}
		return result;
	}
	
	private static List<Carro> filtrarCarroVerde(List<Carro> carros){
		List<Carro> result = new ArrayList<>();
		for(Carro carro : carros) {
			if( carro.getCor().equals("verde"))
				result.add(carro);
		}
		return result;
	}
	
	private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor){
		List<Carro> result = new ArrayList<>();
		for(Carro carro : carros) {
			if( carro.getCor().equals(cor))
				result.add(carro);
		}
		return result;
	}
	
	private static List<Carro> filtrarCarros(List<Carro> carros, CarrosPredicate carroPredicate){
		List<Carro> result = new ArrayList<>();
		for(Carro carro : carros) {
			if(carroPredicate.test(carro))
				result.add(carro);
		}
		return result;
	}
	
	public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate){
		List<T> result = new ArrayList<T>();
		for(T e: list) {
			if(predicate.test(e))
				result.add(e);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Carro> carros = Arrays.asList(new Carro("verde", 2011),
				new Carro("vermelho", 2007),
				new Carro("preto", 2015),
				new Carro("cinza", 2008),
				new Carro("prata", 2013),
				new Carro("azul", 2011));
		System.out.println(filtrarCarroVerde(carros));
		System.out.println(filtrarCarroPorCor(carros,"vermelho"));
		System.out.println(filtrarCarroPorCor(carros,"preto"));
		System.out.println(filtrarCarroDezAnosFabricados(carros));
		System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentePredicate()));
		
		System.out.println(filtrar(carros, new Predicate<Carro>() {
			
			@Override public boolean test(Carro carro) {
				return carro.getCor().equals("preto");
			}
		}));
		System.out.println(filtrar(numeros, new Predicate<Integer>() {
			@Override public boolean test(Integer integer) {
				return integer % 2 == 0;
			}
		}));
		
		System.out.println(filtrar(numeros, (Integer integer) -> integer%3 == 0));
		
	}
	
}
