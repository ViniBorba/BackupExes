class Casa{
	
	private String cor;
	private int totalDePortas;
	Porta portas[];

	void pintaCasa (String s){
		this.cor = s;
	}
	
	String corDaCasa(){
		return this.cor;
	}

	//int quantasPortasAbertas(){
	//	return portas[];
	//}

	void adicionaPorta(Porta p){
		this.totalDePortas = this.totalDePortas + 1;
	}

	int totalDePortas(){
		return this.totalDePortas;
	}
}