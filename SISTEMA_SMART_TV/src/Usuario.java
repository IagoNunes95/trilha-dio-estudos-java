
public class Usuario {
	
	public static void main(String [] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("volume atual? "+smartTv.volume);
		
		System.out.println("canal atual "+ smartTv.canal);
		smartTv.mudarCanal(13);
		
		System.out.println("TV ligada? "+ smartTv.ligada);
		System.out.println("canal atual? "+ smartTv.canal);
		System.out.println("volume atual? "+smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status, TV ligada? "+smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status, TV ligada? "+smartTv.ligada);
	}
	
}
