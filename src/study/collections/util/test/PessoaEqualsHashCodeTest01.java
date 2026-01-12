package study.collections.util.test;

import study.collections.util.PessoaEqualsHashCode;

public class PessoaEqualsHashCodeTest01 {
	public static void main(String[] args) {
		PessoaEqualsHashCode p1 = new PessoaEqualsHashCode("12345678900", "João", 30);
		PessoaEqualsHashCode p2 = new PessoaEqualsHashCode("12345678900", "Maria", 25);
		PessoaEqualsHashCode p3 = new PessoaEqualsHashCode("98765432100", "Pedro", 40);
		
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		
		
	}
}
