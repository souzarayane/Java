package controle;

public class IfElse03 {

	public static void main(String[] args) {
		
		int idade = 14;
		boolean amigoDoDono = true;
		
		if(idade >= 18 && amigoDoDono == false) {
			System.out.println("Pode entrar no clube.");
		}else {
			System.out.println("Não pode entrar no clube.");
		}

	}

}
