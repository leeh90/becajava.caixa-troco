package CaixaTroco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.ObterValor();

		do {
			produto1.Pagar();

			if (produto1.ValorPago == 0) {
				System.out.println("Aplica��o encerrada!");
				break;
			}
			if (produto1.ValorPago < produto1.ValorProduto) {
				System.out.println("ERRO: Valor insuficiente!");
			} else {
				produto1.Troco();
			}
		} while (produto1.ValorPago != 0);
	}

}
