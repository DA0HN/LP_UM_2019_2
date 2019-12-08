package util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Populate {
	private static String chars = "abcdefghijklmnopqrstuvwxyz";
	private static Random random = new Random(); 
	private static final int maxPopulacao = 99999;
	private static final int minPopulacao = 10000;
	private static final int maxDimensao = 999999;
	private static final int minDimensao = 10000;
	
	public static String generateISO() {
		String str = "";
		
		str += chars.charAt(random.nextInt(chars.length()));
		str += chars.charAt(random.nextInt(chars.length()));
		str += chars.charAt(random.nextInt(chars.length()));
		
		return str.toUpperCase();
		
	}
	
	private static double format(double arg) {
		/*
		 * cria uma instancia da classe BigDecimal para formatar o double recebido no argumento
		 * setScale() seta a formatação para 4 casas após a virgula usando como prioridade
		 * arredondamento para cima de um numero maior que 5 e arredondamento para baixo caso contrário*/
		BigDecimal bd = new BigDecimal(String.valueOf(arg));
		/*
		 * setScale retorna uma String formatada, para converter para Double utiliza-se .doubleValue() */	
		return bd.setScale(4, RoundingMode.HALF_EVEN).doubleValue();
	}
	
	public static double generatePopulacao() {		
		return format(Math.random() * ( (maxPopulacao - minPopulacao) + 1) + minPopulacao);
//		return format(random.nextInt( (maxPopulacao - minPopulacao) + 1) + minPopulacao);
	}
	
	public static double generateDimensao() {		
		return format(Math.random() * ( ( maxDimensao - minDimensao) + 1 ) + minDimensao) ;
	}
	
}
