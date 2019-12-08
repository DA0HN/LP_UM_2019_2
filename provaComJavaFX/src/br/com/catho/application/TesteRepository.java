package br.com.catho.application;

import br.com.catho.model.repository.Repository;

public class TesteRepository {
	public static void main(String[] args) {
		Repository r = Repository.DELETE_BY_ID;
		System.out.println(r);
		String str = Repository.SAVE.getValue();
		System.out.println(str);
		
	}
}
