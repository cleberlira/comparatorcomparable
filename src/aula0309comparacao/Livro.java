package aula0309comparacao;

public class Livro implements Comparable<Livro> {

	
	private int anoPublicacao;
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String titulo;

	@Override
	public int compareTo(Livro o) {
		if (this.anoPublicacao > o.anoPublicacao ) {
			return 1;
		}
		
		if (this.anoPublicacao < o.anoPublicacao ) {
			return -1;
		}
		 
		return 0;
		
		// TODO Auto-generated method stub
	
	}
}
