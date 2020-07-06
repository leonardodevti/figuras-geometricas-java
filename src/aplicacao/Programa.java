package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

/*Fazer um programa para ler os dados de N figuras (N fornecido
pelo usuário), e depois mostrar as áreas destas figuras na
mesma ordem em que foram digitadas.
 * */

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		List <Forma> lista = new ArrayList <> ();

		System.out.println("Informe o número de figuras geométricas: ");
		int n = ent.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Figura # " + i + " Dados:");
			System.out.print("Retângulo ou Círtculo (r/c)?");
			char resp = ent.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(ent.next());
			//estrutura de decisão para inserir os dados do retângulo ou do círculo. 
			if (resp == 'r') {
				System.out.print("Largura: ");
				double largura = ent.nextDouble();
				System.out.print("Altura: ");
				double altura = ent.nextDouble();
				lista.add(new Retangulo(cor, altura, largura));
			} 
			else {
				System.out.print("Rario: ");
				double raio = ent.nextDouble();
				lista.add(new Circulo(cor, raio));
			}

		}
		System.out.println();//Imprimindo as areas de todas as figuras.
		System.out.println("Área(s) da(s) figura(s): ");
		for (Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}

		ent.close();
	}

}
