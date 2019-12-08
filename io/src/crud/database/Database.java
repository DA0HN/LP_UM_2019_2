package crud.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import crud.model.Pessoa;

public class Database {

	private final String defaultPath = "./src/crud/database/database.txt";
	private String path;
	private File databaseFile;
	
	protected Database(Boolean reset, String path) throws IOException {
		this(reset);
		this.path = path;
		this.databaseFile = new File(this.path);
	}
	
	protected Database(Boolean reset) throws IOException { 
		this.databaseFile = new File(defaultPath);
		
		if( reset ) {
			this.databaseFile.delete();
			this.databaseFile.createNewFile();
			populate();
		}
		else {
			if( !this.databaseFile.exists() )
				this.databaseFile.createNewFile();
		}
	}
	
	private void populate() {
		List<Pessoa> lista = new ArrayList<Pessoa>(); 
		lista.addAll(
			Arrays.asList(
			new Pessoa("João"	, 	40	, "789.456.123-12"),
			new Pessoa("Carlos"	, 	21	, "258.369.147-54"),
			new Pessoa("Honda"	, 	19	, "123.456.958-36"),
			new Pessoa("Laura"	, 	20	, "856.364.985-52")
			)
		);
		
		lista.forEach(this::inserirDados);
	}
	
	
	public List<Pessoa> recuperarDados() {
		List<Pessoa> pessoas = null;
		try (BufferedReader buffer = new BufferedReader(new FileReader(databaseFile))) {
			
			pessoas = new ArrayList<Pessoa>();
			while( buffer.ready() ) {
				String line = buffer.readLine();
				String[] parsedData = line.split(",");
				pessoas.add( new Pessoa(
					parsedData[0].strip(),
					Integer.parseInt(parsedData[1].strip()),
					parsedData[2].strip()
				));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return pessoas;
	}
	
	
	
	private void rewriteArchive(List<Pessoa> pessoas) {
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(databaseFile, false))) {
			if( pessoas == null ) {
				System.out.println("Não foi possivel inserir no arquivo.");
				return;
			}
			for( Pessoa p : pessoas ) { 
				buffer.write(p.getData() + "\n");
			}
		}
		catch( IOException e) {
			e.printStackTrace();
		}
	}
	public void inserirDados(Pessoa p) {
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(databaseFile, true))) {
			
			if( p == null ) {
				System.out.println("Não foi possivel inserir no arquivo.");
				return;
			}
			buffer.write(p.getData() + "\n");
		}
		catch( IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateArchive(List<Pessoa> pessoas) {
		rewriteArchive(pessoas);
	}
	
	public File getDatabase() {
		return this.databaseFile;
	}
	
	
}
