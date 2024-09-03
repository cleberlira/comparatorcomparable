package aula0309comparacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setAnoPublicacao(1980);
		livro1.setTitulo("Java New");
		
		Livro livro2 = new Livro();
		livro2.setAnoPublicacao(1996);
		livro2.setTitulo("EDA");
		
		Livro livro3 = new Livro();
		livro3.setAnoPublicacao(1976);
		livro3.setTitulo("REDES");
		
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		
		//Collections.sort(livros);
		
		TituloComparator tc = new TituloComparator();
		
		Collections.sort(livros, tc );
		
		for (Livro l : livros)
			System.out.println(l.getAnoPublicacao() + " " + l.getTitulo());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
