import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int n1 = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int n2 = terminal.nextInt();

		terminal.close();

		try {
            //chama a função contar , caso precise , retorna um erro 
			contar(n1, n2);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: "+ exception.getMessage());
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // Verifica se os parâmetros são inválidos e lança a exceção específica para cada caso
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        } else if (parametroUm == parametroDois) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser iguais.");
        }

		int contagem = parametroDois - parametroUm;
        System.err.printf("Interações a serem contabilizadas %d\n",contagem);

		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 0;i<contagem;i++){
            System.out.printf("contando e vaiii : %d\n",i+1);
        }
	}
}