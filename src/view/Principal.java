package view;
import model.*;
import java.util.Scanner;

import controller.FatController;
public class Principal {

	public static void main(String[] args) {
		int valor = -1;
		Pilha p = new Pilha();
		try {
			Scanner sc = new Scanner(System.in);
			while(valor < 0 || valor > 10) {
				System.out.println("Digite um número");
				valor = sc.nextInt();
			}
			FatController fat = new FatController();
			System.out.println("Fatorial de " + valor + " é: " + fat.fatorial(valor));
			sc.close();
		} catch(Exception e) {
			System.out.println("Erro");
		}
		
	}

}
