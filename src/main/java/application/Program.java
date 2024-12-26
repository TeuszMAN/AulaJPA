package application;

import dominio.Pessoa;

public class Program {
	
	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa(1,"Lucas de Jesus", "lucasjesus12@gmail.com");
		Pessoa p2 = new Pessoa(2,"Tiago Oliveira", "oliveiratiago@gmail.com");
		Pessoa p3 = new Pessoa(3,"Maria Madalena", "mariazinhamada@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
