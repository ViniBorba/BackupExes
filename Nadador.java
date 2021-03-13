
public class Nadador extends Atleta {
	
	
	//Construtores da super classe Atleta
	public Nadador() {
		//super("Phelps", 30, 2.05, "Natacao livre");
		super();
			
		}
	
	//metodo sub escrito da superclasse
	public String informacoesAtleta() {
		System.out.println(super.informacoesAtleta());
		//super.informacoesAtleta();
		return "Mais uma informação";
	}	
	
		
}
	
