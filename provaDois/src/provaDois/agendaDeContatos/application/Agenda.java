package provaDois.agendaDeContatos.application;

import java.util.InputMismatchException;

import javax.management.InstanceNotFoundException;

import br.edu.ifmt.cba.util.Teclado;
import provaDois.agendaDeContatos.model.entities.Contato;
import provaDois.agendaDeContatos.model.entities.ContatoComercial;
import provaDois.agendaDeContatos.model.entities.ContatoPessoal;

public class Agenda {

	private static Contato[] contatos = new Contato[10];
	
	public static void main(String[] args) {
		menu();
	}
	
	private static void tabelaDeOpcoes() {
		System.out.println("<-===-> Agenda de Contatos <-===->");
		System.out.println("---------------------------------");
		System.out.println("1 - incluir");
		System.out.println("2 - excluir");
		System.out.println("3 - alterar");
		System.out.println("4 - consultar todos");
		System.out.println("5 - clonar");
		System.out.println("6 - sair");
		System.out.println("---------------------------------");
	}
	
	private static void menu() {
		tabelaDeOpcoes();
		int opcao;
		try {
			opcao = Teclado.leInt("O que deseja fazer? ");
		
			switch( opcao ) {
			case 1:
				incluir();
				break;
			case 2:
				excluir();
				break;
			case 3:
				alterar();
				break;
			case 4:
				consultarTodos();
				break;
			case 5:
				clonar();
				break;
			case 6:
				System.exit(0);
			default:
//				System.out.println("Opcao incorreta.");
				throw new InputMismatchException("mensagem"); 
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Opção inserida não é valida: " + e.getMessage());
		}
		finally {
			menu();
		}
		
	}

	private static Contato buscarContato(Integer codigo) {
		
		for(int i=0; i < contatos.length; i++ ) {
			if( contatos[i] != null && contatos[i].getCodigo() == codigo ) {
				return contatos[i];
			}
		}
		
		return null;
	}
	
	private static void clonar() {
		try {
			int codigo = Teclado.leInt("Insira o codigo do contato para clonagem: ");
			Contato c = buscarContato(codigo);
			
			if( c == null ) {
				System.out.println("Ocorreu um erro na sua clonagem, codigo inválido.");
				return;
			}
			
			inserirNaAgenda(c.clonar());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não é possivel inserir um novo dado na agenda: " + e.getMessage() );
		} catch (InputMismatchException e) {
			System.out.println("código do contato não é válido: " + e.getMessage() );
			clonar();
		}
		
	}

	private static void consultarTodos() {
		for(int i=0; i < contatos.length; i++) {
			if( contatos[i] != null ) {
				System.out.println("---------------------");
				System.out.println(contatos[i].verInformacoes());
			}
		}
	}

	private static void alterar() {
		int codigo;
		try {
			codigo = Teclado.leInt("Insira o codigo do contato para alteracao: ");
			for( int i=0; i < contatos.length; i++ ) {
				if( contatos[i] != null && codigo == contatos[i].getCodigo() ) {
					
					String nome = Teclado.leString("Insira o novo nome: ");
					String email = Teclado.leString("Insira o novo email: ");
					String telefone = Teclado.leString("Insira o novo telefone: ");
					
					if( nome.isBlank() || nome.isEmpty() ) {
						throw new IllegalStateException();
					}
					else if( email.isBlank() || email.isEmpty() ) {
						throw new IllegalStateException();
					}
					else if( telefone.isBlank() || telefone.isEmpty() ) {
						throw new IllegalStateException();
						
					}
					
					contatos[i].setNome(nome);
					contatos[i].setEmail(email);
					contatos[i].setTelefone(telefone);
					
					if( contatos[i] instanceof ContatoComercial ) {
						ContatoComercial c = (ContatoComercial) contatos[i];
						c.setNomeDaEmpresa( Teclado.leString("Insira o novo nome da empresa: ") );
						c.setTelefoneComercial( Teclado.leString("Insira o novo telefone comercial: ") );
						contatos[i] = c;
					}
					else if( contatos[i] instanceof ContatoPessoal ) {
						ContatoPessoal p = (ContatoPessoal) contatos[i];
						p.setDataDeAniversario( Teclado.leString("Insira nova data de aniversario"));
						contatos[i] = p;
					}
					else {
						throw new InstanceNotFoundException();
					}
					return;
				}
			}
//			System.out.println("Erro ao alterar, contato não encontrado");
		
			throw new InstanceNotFoundException();
		
		} catch (InputMismatchException e) {
			System.out.println("O código inserido não é válido: " + e.getMessage());
			alterar();
		} catch( InstanceNotFoundException e) {
			System.out.println("Não foi possivel alterar o contato: " + e.getMessage());
		}
		
	}

	private static void excluir() {
		try {
			int codigo = Teclado.leInt("Insira o codigo do contato para excluir: ");
			for( int i=0; i < contatos.length; i++ ) {
				if( contatos[i] != null && codigo == contatos[i].getCodigo() ) {
					System.out.println("Excluido com sucesso: ");
					System.out.println(contatos[i].verInformacoes());
					contatos[i] = null;
					return;
				}
			}
//			System.out.println("Erro ao excluir, contato não encontrado");
			throw new InstanceNotFoundException();
		} catch (InputMismatchException e) {
			System.out.println("código inserido não é válido: " + e.getMessage() );
			excluir();
		} catch( InstanceNotFoundException e) {
			System.out.println("O contato do código inserido não foi encontrado " + e.getMessage());
		}
	}
	
	private static void incluir() {
		
		try {
			System.out.println("1 - Contato Comercial");
			System.out.println("2 - Contato Pessoal");
			
			int opcao = Teclado.leInt("Insira sua opcao: ");
			
			Contato c;
			
			String nome = Teclado.leString("Insira o nome: ");
			String email = Teclado.leString("Insira o email: ");
			String telefone = Teclado.leString("Insira o telefone: ");
			
			if( opcao == 1 ) {
				String nomeDaEmpresa = Teclado.leString("Insira o nome da empresa: ");
				String telefoneComercial = Teclado.leString("Insira o telefone comercial: ");
				c = new ContatoComercial(nome, email, telefone, nomeDaEmpresa, telefoneComercial);
				inserirNaAgenda(c);
			}
			else if( opcao == 2) {
				String dataDeAniversario = Teclado.leString("Insira a data de aniversário: ");
				c = new ContatoPessoal(nome, email, telefone, dataDeAniversario);
				inserirNaAgenda(c);
			}
			else {
				System.out.println("Opcao invalida");
			}
			return;
		} catch ( IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( InputMismatchException e) {
			System.out.println("Opção inserida não é válida");
			incluir();
		}
	}

	private static void inserirNaAgenda(Contato c) throws IndexOutOfBoundsException {
		for( int i=0; i < contatos.length; i++ ) {
			if( contatos[i] == null ) {
				contatos[i] = c;
				return;
			}
		}
		throw new IndexOutOfBoundsException();
	}
	
}
