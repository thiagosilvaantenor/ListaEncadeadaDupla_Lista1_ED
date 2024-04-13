package controller;

import model.estrutura.ListaEncadeadaDuplaModel;
import model.estrutura.No;
import model.negocio.Pessoa;

public class ListaEncadeadaDuplaController {
	public ListaEncadeadaDuplaController() {
		super();
	}

	public String teste() throws Exception {
		Pessoa[] pessoas = Pessoa.carregar();
		ListaEncadeadaDuplaModel<Pessoa> lista = new ListaEncadeadaDuplaModel<Pessoa>();
		Pessoa p4 = new Pessoa();
		p4.setNome("Jaskier");
		p4.setSobreNome("");
		p4.setIdade(40);
		for (Pessoa p : pessoas) {
			lista.append(p);
		}
		lista.insert(0, p4);
		return lista.toString();

	}

	public void ex1A() {
		System.out.println("Letra A:");
		ListaEncadeadaDuplaModel lista = new ListaEncadeadaDuplaModel();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				lista.prepend(i * i);
			} else if (i <= 6) {
				lista.prepend(i);
			} else {
				int total = lista.total() - 1;
				System.out.println(lista.get(total));
				lista.remove(total);
			}
		}
		System.out.println(lista.total());
		System.out.println(lista);
	}

	public void ex1B() {
		System.out.println("Letra B:");
		ListaEncadeadaDuplaModel lista = new ListaEncadeadaDuplaModel();

		for (int i = 100; i < 115; i++) {
			if (lista == null) {
				lista.prepend(i + 100);
			} else if (lista.total() <= 4) {
				lista.prepend(i + 50);
			} else {
				System.out.println(lista.get(0));
				lista.remove(0);
			}
		}
		System.out.println(lista.total());
		System.out.println(lista);
	}

	public void ex3(ListaEncadeadaDuplaModel<Integer> lista) {
		int inicio = 0;
		int fim = lista.total() - 1;
		int meio = (inicio + fim) / 2;
		No[] noAux = new No[lista.total()];
		ListaEncadeadaDuplaModel<Integer> novaLista = new ListaEncadeadaDuplaModel<Integer>();

		for (int i = inicio; i <= meio; i++) {
			noAux[i] = lista.get(i);
		}

		for (int i = meio + 1; i <= fim; i++) {
			noAux[i] = lista.get(i);
		}

		for (int i = noAux.length - 1; i >= 0; i--) {
			int val = (int) noAux[i].getValor();
			novaLista.append(val);
		}
		System.out.println("Lista L invertida: " + novaLista);
	}
}