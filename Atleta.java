
public class Atleta {
	//Classe para testar HERANÇA e POLIMORFISMO
	//essa é a minha super classe
	private String nome;
	private int idade;
	private double altura;
	private String esportePraticado;
	
	//construtor de atleta
	Atleta(String nome, int idade, double altura, String esportePraticado){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.esportePraticado = esportePraticado;
	}
	
	//outro construtor vazio
	Atleta(){
		
	}
	
	public void setEsportePraticado(String novoEsporte) {
		this.esportePraticado = novoEsporte;
	}
	
	//metodo para testar metedo sub escrito de uma super classe na classe filho
	public void trocarNomeIdade(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodo para retornar as informacoes da classe atleta
	public String informacoesAtleta () {
		return "Nome: "+ nome +"\nIdade: "+ idade + "\nAltura: "+ altura + "\nEsporte Praticado: "+ esportePraticado;
	}

}
