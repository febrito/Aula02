package aula02;
public class Garrafa {
	String modelo;
	String cor;
	String tamanho;
	boolean destampar;
	boolean tampada;
					
	void encher() {
		if (this.tampada == true) {
			System.out.println("A garrafa esta Tampanda");
		} else { 
			System.out.println("Enchendo");
		}
	}
	
	void tampar( ) {
		this.tampada = false;
	
}
	void destampar( ) {
		this.tampada = true;
		
	}
						
}
	


