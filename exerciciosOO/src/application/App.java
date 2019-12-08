package application;

import continente.Continente;
import pais.Pais;
import util.Populate;

public class App {

	public static void main(String[] args) {
		
		
		Pais brasil     = 	new Pais(Populate.generateISO(), "Brasil", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais luxemburgo = 	new Pais(Populate.generateISO(), "Luxemburgo", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais china 	    = 	new Pais(Populate.generateISO(), "China", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais suica 	    = 	new Pais(Populate.generateISO(), "Suiça", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais nigeria    = 	new Pais(Populate.generateISO(), "Nigéria", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais canada     = 	new Pais(Populate.generateISO(), "Canadá", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais haiti      = 	new Pais(Populate.generateISO(), "Haiti", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais argentina  = 	new Pais(Populate.generateISO(), "Argentina", Populate.generatePopulacao(), Populate.generateDimensao());
		Pais romenia    =	new Pais(Populate.generateISO(), "Romênia", Populate.generatePopulacao(), Populate.generateDimensao());

		Pais espanha = new Pais("FDG", "Espanha", 500000, 2000);
		Pais bielorussia = new Pais("ZXC", "Bielorussia", 500000, 2000);
		Pais india = new Pais("CHN", "india", 500000, 2000);
		
		Pais listaZXC[] = {brasil, luxemburgo, china, nigeria, suica, canada, haiti, romenia};
		Pais listaCHN[] = {brasil, espanha, argentina,nigeria, suica,  romenia};
		
		Continente asia = new Continente("Asia", listaZXC);
		
		
		bielorussia.setFronteira(listaZXC);
		india.setFronteira(listaCHN);
		
		Pais[] lista = india.getFronteira().getVizinhos(bielorussia.getFronteira().getLista());
		
//		for(Pais p : lista) {
//			if( p != null ) System.out.println(p);
//		}
		
		System.out.println("Densidade populacional: " + asia.densidadePopulacionalTotal());
		System.out.printf("População total: %.4f%n", asia.populacaoTotal());
		System.out.println("Razão territorial: " + asia.razaoTerritorial());
		//asia.print();
		
//		System.out.println( Populate.generateDimensao()	);
//		System.out.println( Populate.generateISO() );
//		System.out.println( Populate.generatePopulacao() );
		
	}

}
