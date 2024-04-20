import java.util.Scanner;

public class InverterChar {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para inverter os caracteres ");
        String palavra = scanner.nextLine();
        scanner.close();
        
        String palavraInv = InverterString(input);
        
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInv);
    }

    public static String InverterString(String str) {
	
		char[] vetorString = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			vetorString[i] = str.charAt(str.length() - 1 - i);
		}

		String inverso = new String(vetorString);
    
    return inverso;
	}