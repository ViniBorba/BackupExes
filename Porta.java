class Porta{

	int portaAberta;
	int portaFechada;
	static int portaCriada;

	Porta(){
		portaCriada += 1;
	}
	
	//Abre fecha e fecha portas
	void abrePorta(){
		this.portaAberta += 1;
	}
	void fechaPorta(){
		this.portaFechada += 1;
	}

	int portasAbertas(){
		return portaAberta;
	}

	int portasFechadas(){
		return portaFechada;
	}

	int quantiaDePorta(){
		return portaCriada;
	}

}