package provaTres.model.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import provaTres.model.entities.Pessoa;
import provaTres.model.entities.PessoaFisica;
import provaTres.model.entities.PessoaJuridica;

public class Database {
	
	private File file;
	private String path = "./src/provaTres/model/database/archive/database.txt";
	
	public Database() throws IOException {
		this.file = new File(path);
		
		if( !this.file.exists() ) {
			file.createNewFile();
		}
	}
	
	public Database(String path) throws IOException{
		this.path = path;
		this.file = new File(path);
		
		if( !this.file.exists() ) {
			file.createNewFile();
		}
	}
	
	public List<Pessoa> receberDados() {
		List<Pessoa> pessoas = null;
		try (BufferedReader buffer = new BufferedReader( new FileReader(this.file))){
			pessoas = new ArrayList<Pessoa>();
			while( buffer.ready() ) {
				String temp = buffer.readLine();
				String[] p = temp.split(",");
				Pessoa pessoa = null; 
				if( Integer.parseInt(p[3]) == 0 ) {	// pessoa juridica
					pessoa = new PessoaJuridica(p[0], p[1], p[2]);
				}
				else { // pessoa fisica
					pessoa = new PessoaFisica(p[0], p[1], p[2]);
				}
				pessoas.add(pessoa);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return pessoas;
	}

	public void sendAll(List<Pessoa> pessoas) throws IOException {
		this.file.delete();
		this.file.createNewFile();
		for(Pessoa p : pessoas) {
			enviarDados(p, true);
		}
	}
	
	public void enviarDados(Pessoa p, boolean flag) {
		try (BufferedWriter buffer = new BufferedWriter( new FileWriter(this.file, flag))){
			
			if( p == null ) {
				throw new IOException("Não foi possivel inserir no arquivo.");
			}

			buffer.write(p.print() + "\n");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
