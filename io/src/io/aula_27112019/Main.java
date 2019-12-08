package io.aula_27112019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	private static final String input = "./src/io/aula_27112019/input.txt";
	private static final String output = "./src/io/aula_27112019/output.txt";
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		readData(lista);
		dataProcessing(lista);
		writeData(lista);
	}
	
	private static void readData(List<String> lista){
		try {
 			InputStream in = new FileInputStream(input);
			InputStreamReader stream = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(stream);
			System.out.println("Iniciando leitura...");
			while( reader.ready() ) {
				String str = reader.readLine();
				lista.add(str);
			}
			System.out.println("Fim da leitura...");
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void dataProcessing(List<String> lista) {
		System.out.println("Processando conjunto de dados...");
		System.out.println("Lista Ordenada: ");
		Collections.sort(lista);
		lista.forEach(System.out::println);
	}
	
	private static void writeData(List<String> lista) {
		try {
			
			OutputStream out = new FileOutputStream(output);
			OutputStreamWriter stream = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(stream);
			System.out.println("Inserindo no arquivo...");
			for(String s : lista) {
				writer.write(s + "\n");
			}
			System.out.println("Inserção terminada...");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
