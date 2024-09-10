package model;
import java.lang.Exception;

public class Pilha {
	No topo = null;
	
	public boolean isEmpty() {
		if(topo == null)
			return true;
		return false;
	}
	public void push(int e) {
		No elemento = new No();
		elemento.setDado(e);
		elemento.setProximo(topo);
		this.topo = elemento;
	}
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Pilha vazia.");
		int valor = this.topo.getDado();
		this.topo = this.topo.getProximo();
		return valor;
	}
	public int top() throws Exception{
		if(isEmpty())
			throw new Exception("Pilha vazia.");
		int valor = this.topo.getDado();
		return valor;
	}
	public int size() {
		int count = 0;
		if(!isEmpty()) {
			No aux = this.topo;
			count = 1;
			while(aux.getProximo() != null) {
				count += 1;
				aux = aux.getProximo();
			}
		}
		return count;
	}
}
