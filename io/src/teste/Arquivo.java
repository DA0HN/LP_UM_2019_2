package teste;

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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arquivo{

	private static final String input = "./src/teste/input.txt";
	private static final String output = "./src/teste/output.txt";

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.addAll(
			Arrays.asList(
			new Pessoa("João", 		40, "789.456.123-12"),
			new Pessoa("Carlos", 	21, "258.369.147-54"),
			new Pessoa("Honda", 	19, "123.456.958-36"),
			new Pessoa("Laura", 	20, "856.364.985-52")
		));
		escreverArquivo(pessoas);
		ordenarParaInserirNoArquivo(lerArquivo());
	}

	private static List<Pessoa> lerArquivo(){
		List<Pessoa> pessoas = null;
		try{
			InputStream in = new FileInputStream(input);
			InputStreamReader stream = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(stream);

			pessoas = new ArrayList<>();

			while( reader.ready() ){
				String temp = reader.readLine();
				String[] data = temp.split(",");
				
				pessoas.add(
					new Pessoa(
						data[0].strip(),
						Integer.parseInt(data[1].strip()),
						data[2].strip()
					)
				);
			}
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return pessoas;
	}
	private static void escreverArquivo(List<Pessoa> pessoas){
		try {
			OutputStream out = new FileOutputStream(input, false);
			OutputStreamWriter stream = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(stream);

			for(Pessoa p : pessoas ){
				writer.write(p.getNome() + ", " 
				+ p.getIdade() + ", "
				+ p.getCpf()
				+ "\n");	
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	private static void ordenarParaInserirNoArquivo(List<Pessoa> pessoas){
		try{
			OutputStream out = new FileOutputStream(output, false);
			OutputStreamWriter stream = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(stream);
			
			Collections.sort(pessoas);
			
			for (Pessoa p : pessoas) {
				writer.write(p.getNome() + ", " 
				+ p.getIdade() 
				+ ", " + p.getCpf() 
				+ "\n");
			}
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
