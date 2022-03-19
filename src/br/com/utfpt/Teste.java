package br.com.utfpt;

import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
		
		//Instância do veículo 1
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setMarca("Dodge");
		veiculo1.setModelo("Charger");
		veiculo1.setCor("Preto");
		veiculo1.setPlaca("ABC1234");
		veiculo1.setVelocMax(320.00f);
		veiculo1.setQtdRodas(4);
		
		//Instância do veículo 2
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setMarca("DeLorean");
		veiculo2.setModelo("DMC DeLorean");
		veiculo2.setCor("Prata");
		veiculo2.setPlaca("DOC1878");
		veiculo2.setVelocMax(180.00f);
		veiculo1.setQtdRodas(4);
		
		//Instância do veículo 3
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setMarca("Ford");
		veiculo3.setModelo("Mustang Shelby GT500");
		veiculo3.setCor("Prata");
		veiculo3.setPlaca("NIC6060");
		veiculo3.setVelocMax(287.00f);
		veiculo3.setQtdRodas(4);
				
		//Instância do veículo 4
		Veiculo veiculo4 = new Veiculo();
		veiculo4.setMarca("Audi");
		veiculo4.setModelo("A8");
		veiculo4.setCor("Preto");
		veiculo4.setPlaca("DIE7485");
		veiculo4.setVelocMax(320.00f);
		veiculo4.setQtdRodas(4);
				
		//Instância do veículo 5
		Veiculo veiculo5 = new Veiculo();
		veiculo5.setMarca("Pontiac");
		veiculo5.setModelo("Firebird Trans Am");
		veiculo5.setCor("Preto");
		veiculo5.setPlaca("MAX4625");
		veiculo5.setVelocMax(230.00f);
		veiculo5.setQtdRodas(4);
		
		String choice = "n";
		
		
		//Entrada de valores para escolher o veiculo
		Scanner enter = new Scanner(System.in);		
		
		while(choice.equals("n")) {

			System.out.println("Escolha um número entre 1 e 5 para saber mais sobre o carro");
			System.out.println("1 - Dodge Charger");
			System.out.println("2 - DeLorean");
			System.out.println("3 - Mustang Shelby GT500");
			System.out.println("4 - Audi A8");
			System.out.println("5 - Pontiac Firebird Trans Am\n");
			
			int escolha = enter.nextInt();
			
			//Imprime o carro escolhido
			switch(escolha){
			case 1:
				veiculo1.imprimirVeiculo();
				break;
			case 2:
				veiculo2.imprimirVeiculo();
				break;
			case 3:
				veiculo3.imprimirVeiculo();
				break;
			case 4:
				veiculo4.imprimirVeiculo();
				break;
			case 5:
				veiculo5.imprimirVeiculo();
				break;
			default:
				System.out.println("Escolha um número ente 1 e 5");
			}
			
		System.out.println("Deseja sair(s/n)?");
		choice = enter.next();
		
		}
		
		System.out.println("FIM");
				
		enter.close();				

	}

}
