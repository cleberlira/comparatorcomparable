package aula0309comparacao;

import java.util.Comparator;

public class TituloComparator implements Comparator <Livro> {

	@Override
	public int compare(Livro o1, Livro o2) {
		
		return o1.getTitulo().compareTo(o2.getTitulo());
		
		// TODO Auto-generated method stub
		
	}

	
}
