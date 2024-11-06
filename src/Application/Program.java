package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Bebidas;
import Entities.Comida;
import Entities.Higiene;
import Entities.Lanche;
import Entities.Produto;
//import entities_Enum.Color;
import entities_Enum.Type;




public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();

		int n = 1;

		System.out.print("Qual item deseja retirar do estoque? ");
		String name4 = sc.nextLine();

		String nomeAjustado = name4.toLowerCase().replace('m', 'M');
		String nomeAjustado1 = name4.toLowerCase().replace('r', 'R');
		String nomeAjustado2 = name4.toLowerCase().replace("chocolate", "Chocolate");
		String nomeAjustado3 = name4.toLowerCase().replace('p', 'P');

		System.out.print("Quantas unidades? ");
		int q = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String name = "Macarrão";
			int quantidade = 20;
			double preco = 3.00;
			String ncm = "1902.19.00";
			Type tipo = Type.comida;
			list.add(new Comida(name, quantidade, preco, ncm, tipo));
			String name1 = "Refrigerante";
			int quantidade1 = 10;
			double preco1 = 12.00;
			String ncm1 = "2202.10.00";
			Type tipo1 = Type.bebida;
			list.add(new Bebidas(name1, quantidade1, preco1, ncm1, tipo1));
			String name2 = "Chocolate";
			int quantidade2 = 8;
			double preco2 = 7.00;
			String ncm2 = "1806.90.00";
			Type tipo2 = Type.lanche;
			list.add(new Lanche(name2, quantidade2, preco2, ncm2, tipo2));
			String name3 = "Pasta de dente";
			int quantidade3 = 12;
			double preco3 = 6.00;
			String ncm3 = "3306.10.00";
			Type tipo3 = Type.higiene;
			list.add(new Higiene(name3, quantidade3, preco3, ncm3, tipo3));

		}

		for (Produto p : list) {
			if (p.getName().equalsIgnoreCase(nomeAjustado) || p.getName().equalsIgnoreCase(nomeAjustado1)
					|| p.getName().equalsIgnoreCase(nomeAjustado2) || p.getName().equalsIgnoreCase(nomeAjustado3)) {
				p.removeProduto(q);
			}
		}

		char r2;

		System.out.print("Deseja retirar mais algum item do estoque (s/n)? ");
		char r = sc.next().charAt(0);
		do {
			if (r == 's' || r == 'S') {

				System.out.print("Qual item deseja retirar do estoque? ");
				sc.nextLine();
				String name5 = sc.nextLine();

				String nomeAjustado4 = name5.toLowerCase().replace('m', 'M');
				String nomeAjustado5 = name5.toLowerCase().replace('r', 'R');
				String nomeAjustado6 = name5.toLowerCase().replace("chocolate", "Chocolate");
				String nomeAjustado7 = name5.toLowerCase().replace('p', 'P');

				System.out.print("Quantas unidades? ");
				int q2 = sc.nextInt();

				for (Produto p : list) {
					if (p.getName().equalsIgnoreCase(nomeAjustado4) || p.getName().equalsIgnoreCase(nomeAjustado5)
							|| p.getName().equalsIgnoreCase(nomeAjustado6)
							|| p.getName().equalsIgnoreCase(nomeAjustado7)) {
						p.removeProduto(q2);
					}
				}

			}
			System.out.print("Deseja retirar mais algum item do estoque (s/n)? ");
			r2 = sc.next().charAt(0);
		} while (r2 != 'n');

		System.out.println();
		char resp2;
		System.out.print("Deseja adicionar algum item no estoque (s/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 's') {
			do {
				System.out.print("Qual produto gostaria de adicionar? ");
				sc.nextLine();
				String name5 = sc.nextLine();
				System.out.print("Quantos produtos deseja adicionar? ");
				int qtt = sc.nextInt();
				for (Produto p : list) {
					if (p.getName().equalsIgnoreCase(name5)) {
						p.addProduto(qtt);
					}
				}
				System.out.print("Deseja adicionar mais algum item no estoque (s/n)? ");
				resp2 = sc.next().charAt(0);
			} while (resp2 != 'n');
		}

		System.out.println();

		System.out.println("Total em estoque: ");
		for (Produto p : list) {
			System.out.println(p);
		}

		sc.close();
	}

}
