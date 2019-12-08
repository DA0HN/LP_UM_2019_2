package javaLangObject.main;

public class ObjectTeste {

	String nome;
	String cpf;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectTeste other = (ObjectTeste) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static void main(String[] args) {
		ObjectTeste o = new ObjectTeste();
		o.setCpf("aaa");
		o.setNome("34264375");
		System.out.println(o);
		ObjectTeste o2 = new ObjectTeste();
		o.setCpf("fkakfa");
		o.setNome("4209602");
		System.out.println(o2);
		System.out.println(o == o2);
	}
	
}

