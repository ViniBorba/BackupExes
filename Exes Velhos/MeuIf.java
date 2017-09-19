class MeuIf{
	public static void main(String[] args){
		
		int idade = 19;
		boolean amigoDoDono = false;

		if(idade > 18 && !amigoDoDono)//podia ser == amigoDoDono também, mas o ! nega, ele fala se for diferente, contrario 
			{
				System.out.println("Pode entrar");
			}
			 else
				{
					System.out.println("Não pode Entrar");
				}
	}
}
