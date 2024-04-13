package view;

import java.util.Scanner;

import controller.ListaEncadeadaDuplaController;
import model.estrutura.ListaEncadeadaDuplaModel;

public class ListaEncadeadaDupla {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int opc = 0;
			while (opc != 9){
				System.out.println("Ola, digite o exercicio que quer ver:\n" +
						"\n1 - Simular o comportamento de listas dinâmicas, letra A"
						+ "\n2 - Simular o comportamento de listas dinâmicas, letra B"
						+ "\n3 - Inserir lista L e inverter a ordem de seus elementos"
						+ "\n9 - Sair");
				opc = sc.nextInt();
				switch (opc) {
					case 1:
						System.out.println("Mostrando o exercicio 1: ");
						ex1();
						break;
					case 2:
						System.out.println("Mostrando o exercicio 2: ");
						ex2();
						break;
					case 3:
						System.out.println("Mostrando o exercicio 3: ");
						ex3();
						break;
					case 9:
						System.out.println("Saindo ...");
						break;
					default:
						System.out.println("Opcao invalida, tente novamente");
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void ex1() {
		ListaEncadeadaDuplaController obj = new ListaEncadeadaDuplaController();
		obj.ex1A();
	}

	private static void ex2() {
		ListaEncadeadaDuplaController obj = new ListaEncadeadaDuplaController();
		obj.ex1B();
	}

	private static void ex3() {
		ListaEncadeadaDuplaController obj = new ListaEncadeadaDuplaController();
		ListaEncadeadaDuplaModel<Integer> lista = new ListaEncadeadaDuplaModel<Integer>();
		lista.prepend(16);
		lista.prepend(4);
		lista.prepend(13);
		lista.prepend(2);
		lista.prepend(6);
		lista.prepend(7);
		lista.prepend(9);
		lista.prepend(12);
		lista.prepend(18);
		lista.prepend(5);
		lista.prepend(3);
		System.out.println("Lista L: " + lista);
		obj.ex3(lista);
	}
}