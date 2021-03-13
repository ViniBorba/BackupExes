
public class MostrarAtleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Atleta corredor = new Atleta("Vini", 31, 1.74, "Maratonista");
		
		//corredor.setEsportePraticado("Salto com obstaculos");
		
		//System.out.println(corredor.informacoesAtleta());
		
		//instanciando uma classe nadador
		//Nadador nadador = new Nadador();
		
		//testando construtor vazio da super classe atleta
		Nadador nadador = new Nadador();
		
		//estou chamndo um metodo da super classe atleta, isso é herança
		nadador.setEsportePraticado("Nadador 100m");
		
		
		
		//estou chamndo um metodo da super classe atleta, isso é herança
		System.out.println(nadador.informacoesAtleta());

	}

}
