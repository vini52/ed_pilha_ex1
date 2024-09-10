package controller;

import model.Pilha;

public class FatController {
	public FatController() {
		super();
	}
	
	public int fatorial(int valor) throws Exception {
		Pilha pilha = new Pilha();
		int fatorial = 1;
		for(int i = 0; i < valor; i++) {
			pilha.push(valor - i);
		}
		for(int i = 0; i < valor; i++) {
			fatorial *= pilha.top();
			pilha.pop();
		}
		return fatorial;
	}
}
