class Porta{

	private int portaAberta;
	private int portaFechada;
	private String corPorta;
	static int portaCriada;

	Porta(){
		this.portaCriada += 1;
		this.portaAberta += 1;
		this.portaFechada +=1;
	}
	
	void mudaCorPorta(String cor){
		cor = this.corPorta;
	}
	
	String mostraCorPorta(){
		return this.corPorta;
	}
	
	//Abre fecha e fecha portas
	void abrePorta(){
		this.portaAberta = this.portaAberta + 1;
	}
	void fechaPorta(){
		this.portaFechada = this.portaFechada + 1;
		
	}

	int portasAbertas(){
		return this.portaAberta;
	}

	int portasFechadas(){
		return this.portaFechada;
	}

	int quantiaDePorta(){
		return this.portaCriada;
	}

}