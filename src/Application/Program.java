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
		
		List<Produto> list= new ArrayList<>();
		
		int n = 1;
		
		/*for(int i = 0; i<n; i++) {
			
		list.add(new Comida("Macarrão", 20, 3.00, "1902.19.00", Type.comida));
		list.add(new Bebidas("Refrigerante", 10, 3.50, "2202.10.00", Type.bebida));
		list.add(new Lanche("Salgadinho", 8, 15.00, "11905.90.90", Type.lanche));
		list.add(new Higiene("Pasta de dente", 12, 6.00, "3306.10.00", Type.higiene));
		}
		*/
		
		
		System.out.print("Qual item deseja remover do estoque? ");
		String name4 = sc.nextLine();
		System.out.print("Quantas unidades? ");
		int q = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
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
			String ncm2= "1806.90.00";
			Type tipo2 = Type.lanche;
			list.add(new Lanche(name2, quantidade2, preco2, ncm2, tipo2));
			String name3 = "Pasta de dente";
			int quantidade3 = 12;
			double preco3 = 6.00;
			String ncm3= "3306.10.00";
			Type tipo3 = Type.higiene;
			list.add(new Higiene(name3, quantidade3, preco3, ncm3, tipo3));
			   
		}
		
		for (Produto p : list) {
			if(p.getName().equalsIgnoreCase(name4)) {
				p.removeProduto(q);
			}
		}
		System.out.println();
		System.out.print("Deseja adicionar algum item no estoque (s/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 's') {
			System.out.print("Qual produto gostaria de adicionar? ");
			sc.nextLine();
			String name5 = sc.nextLine();
			System.out.print("Quantos produtos deseja adicionar? ");
			int qtt = sc.nextInt();
			for (Produto p : list) {
				if(p.getName().equalsIgnoreCase(name5)) {
					p.addProduto(qtt);
				}
			}
		}
		
		System.out.println();

		System.out.println("Total em estoque: ");
		for (Produto p : list) {
			System.out.println(p);
		}

		sc.close();
	}

}
