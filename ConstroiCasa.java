class ConstroiCasa{
	
	public static void main(String[] args){

		Casa minhaCasa = new Casa();
		//Porta portaDaFrente = new Porta();
		//Porta portaDeTras = new Porta();
		//Porta portaDoQuarto = new Porta();
		//Porta portaDoBanheiro = new Porta();
		Porta[] portasDaCasa = new Porta[4];
		
		//Tem que inicializa/ ou seria criar/ o objeto dentro do Array
		portasDaCasa[0] = new Porta();
		portasDaCasa[1] = new Porta();
		portasDaCasa[2] = new Porta();
		portasDaCasa[3] = new Porta();;
		
		minhaCasa.adicionaPorta(portasDaCasa[0]);
		portasDaCasa[0].setCorPorta("Azul");
		portasDaCasa[0].abrePorta();
		
		minhaCasa.adicionaPorta(portasDaCasa[1]);
		//portasDaCasa[1].abrePorta();
		//portasDaCasa[1].mudaCorPorta("Amarelo");
		
		minhaCasa.adicionaPorta(portasDaCasa[2]);
		//portasDaCasa[2].fechaPorta();
		
		minhaCasa.adicionaPorta(portasDaCasa[3]);
		//portasDaCasa[3].fechaPorta();
		
		//minhaCasa.adicionaPorta(portaDaFrente);
		//portasDaCasa[0] = portaDaFrente;
		//portaDaFrente.abrePorta();
		
		//minhaCasa.adicionaPorta(portaDeTras);
		//portasDaCasa[1] = portaDeTras;
		//portaDeTras.fechaPorta();
		
		//minhaCasa.adicionaPorta(portaDoQuarto);
		//portasDaCasa[2] = portaDoQuarto;
		//portaDoQuarto.fechaPorta();
		
		//minhaCasa.adicionaPorta(portaDoBanheiro);
		//portasDaCasa[3] = portaDoBanheiro;
		//portaDoBanheiro.fechaPorta();
		
		minhaCasa.pintaCasa("Amarelo");
		
		//Percorrer array
		for(int i = 0; i < portasDaCasa.length; i++){
			System.out.println(portasDaCasa[i]);
		}
		
		System.out.println(minhaCasa.totalDePortas());
		//System.out.println("Portas Abertas: "+ portasDaCasa[0].portasAbertas());
		//System.out.println("Portas Fechadas: "+ portasDaCasa[4].portasFechadas());
		//System.out.println("Portas Abertas: "+portasDaCasa[3].portasAbertas());
		//System.out.println("Portas Fechadas: "+portasDaCasa[3].portasFechadas());
		System.out.println("A cor da minha casa e: " + minhaCasa.corDaCasa());
		System.out.println("A cor da porta 1 e: " + portasDaCasa[0].getMostraCorPorta());
		System.out.println(portasDaCasa[0]);
		System.out.println(portasDaCasa[1]);
		System.out.println(portasDaCasa[2]);
		System.out.println(portasDaCasa[3]);

	}
}