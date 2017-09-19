class Casa{
	
	String cor;
	int totalDePortas;
	Porta portas[];


	void pintaCasa (String s){
		this.cor = s;
	}

	//int quantasPortasAbertas(){
	//	return portas[];
	//}

	void adicionaPorta(Porta p){
		this.totalDePortas =+ 1;
	}

	int totalDePortas(){
		return totalDePortas;
	}
}