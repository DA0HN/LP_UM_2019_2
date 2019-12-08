package usingFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UsingFile {
	
	private File database;
	private File orderBy;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	UsingFile(String databasePath, String orderByPath) throws IOException {
		this.database = new File(databasePath);
		this.orderBy = new File(orderByPath);
		pessoas.addAll(
			Arrays.asList(
			new Pessoa("João"	, 	40	, "789.456.123-12"),
			new Pessoa("Carlos"	, 	21	, "258.369.147-54"),
			new Pessoa("Honda"	, 	19	, "123.456.958-36"),
			new Pessoa("Laura"	, 	20	, "856.364.985-52")
			)
		);
//		if( this.database.exists() ) {
//			this.database.delete();
//		}
//		if( this.orderBy.exists() ) {
//			this.orderBy.delete();
//		}
		
		this.database.createNewFile();
		this.orderBy.createNewFile();
		System.out.println("Arquivos criados com sucesso.");
		this.escreverArquivo();
	}
	
	public static void main(String[] args) {
		try {
			UsingFile u = new UsingFile("./src/usingFile/database.txt","./src/usingFile/orderBy.txt");
			u.lerArquivo();
			u.ordenarParaInserirNoArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void lerArquivo(){
		try (BufferedReader reader = new BufferedReader(new FileReader(database) ) ) {
			if( !this.database.canRead() ) 
				throw new IOException("Não é possivel ler arquivo");
			this.pessoas = new ArrayList<>();
			
			while( reader.ready() ) {
				String temp = reader.readLine();
				String[] data = temp.split(",");
				
				this.pessoas.add(
					new Pessoa(
						data[0].strip(),
						Integer.parseInt(data[1].strip()),
						data[2].strip()
					)
				);
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void escreverArquivo() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(database))){
			for(Pessoa p : pessoas ) {
				writer.write(p.getNome() + ", "
						+ p.getIdade() + ", "
						+ p.getCpf() +
						"\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void ordenarParaInserirNoArquivo() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(orderBy))){
			Collections.sort(this.pessoas);
			
			for(Pessoa p : pessoas ) {
				writer.write(p.getNome() + ", " 
						+ p.getIdade() 
						+ ", " + p.getCpf() 
						+ "\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
