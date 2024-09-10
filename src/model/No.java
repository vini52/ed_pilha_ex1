package model;

public class No {
	private int dado;
	private No proximo;
	
	public int getDado() {
		return this.dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public No getProximo() {
		return this.proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public String toString() {
		return "No [" + dado + "]";
	}
}
