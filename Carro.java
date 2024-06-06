package br.edu.fatecpg.tp.main;
import br.edu.fatecpg.tp.abstracao.Carro;
import java.util.Scanner;
 
 
public class Principal {
	
 
 
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean i=true;
        
		Carro meuCarro = new Carro();
		
		System.out.println("Digite a marca do carro");
		//meuCarro.marca = scan.nextLine();
		String marca = scan.nextLine();
		meuCarro.setMarca(marca);
		
		System.out.println("Digite o modelo do carro");
		//meuCarro.modelo = scan.nextLine();
		String modelo = scan.nextLine();
		meuCarro.setMarca(marca);
 
		meuCarro.setModelo(modelo);
		meuCarro.setMarca(tamanhoTanque);
 
		
		//System.out.println("O meu carro é da marca: "+meuCarro.marca);
		//System.out.println("O meu carro é do modelo: "+meuCarro.modelo);
		
		System.out.println("O meu carro é da marca: "+meuCarro.getMarca());
		System.out.println("O meu carro é do modelo: "+meuCarro.getModelo());
		
		while(i){
			String menu = """
	                ***************************
					O que quer fazer com o carro:                
					1 - Girar a chave;
	                2 - Acelerar;
	                3 - Frear;
	                4 - Buzinar;
	                5 - Sair;
	                ***************************
	                """;
			
			System.out.println(menu);	
			
			int comando = scan.nextInt();
			
			switch(comando){
			case 1:
				meuCarro.girarChave();
 
				break;
				
			case 2:
				System.out.println("Quanto de aceleração?");
				double acel = scan.nextDouble();
				meuCarro.acelerar(acel);
				break;
				
			case 3:
				System.out.println("Quanto de freio?");
				double freio = scan.nextDouble();
				meuCarro.frear(freio);
				break;
				
				
			case 4:
				meuCarro.buzinar();
 
				break;
		
			case 5:
				i=false;
				break;
				
			}
			
		}
	
		
	}
 
}