import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) throws Exception{
        int a = 0;
		System.out.println("Digite o numero que deseja ver se faz parte da sequencia de Fibonacci: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		scanner.close();

        if(verificando(a)){
			System.out.println(a +" faz parte da sequencia!");
		}else{
			System.out.println(a +" nao faz parte da sequencia!");
		}
    }

    public static boolean verificando(int n) {
        int nAtual = 1, nAntes = 0;
		while(nAtual < n){
			int prox = nAtual + nAntes;
			nAntes = nAtual;
			nAtual = prox;
		}
		return nAtual == n;
    }
}
