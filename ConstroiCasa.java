class ConstroiCasa{
	
	public static void main(String[] args){

		Casa minhaCasa = new Casa();
		//Porta portaDaFrente = new Porta();
		//Porta portaDeTras = new Porta();
		//Porta portaDoQuarto = new Porta();
		//Porta portaDoBanheiro = new Porta();
		Porta[] portasDaCasa = new Porta[4];
		
		
		minhaCasa.adicionaPorta(portasDaCasa[0]);
		
		//portasDaCasa[0].mudaCorPorta("Verde");
		
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
		
		System.out.println(minhaCasa.totalDePortas());
		System.out.println("Portas Abertas: "+ portasDaCasa[4].portasAbertas());
		//System.out.println("Portas Fechadas: "+ portasDaCasa[4].portasFechadas());
		//System.out.println("Portas Abertas: "+portasDaCasa[3].portasAbertas());
		//System.out.println("Portas Fechadas: "+portasDaCasa[3].portasFechadas());
		System.out.println("A cor da minha casa é: " + minhaCasa.corDaCasa());
		//System.out.println("A cor da porta 1 é: " + portasDaCasa[0]);
		System.out.println(portasDaCasa[0]);
		System.out.println(portasDaCasa[1]);
		System.out.println(portasDaCasa[2]);
		System.out.println(portasDaCasa[3]);

	}
}