package desafio_codigo;

import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		int t = leitor.nextInt(); 
		
		int n[] = new int[1000];

		for(int i = 0; i < n.length;) {
			for(int j = 0; j < t; j++) {
				if(t >= 2 && t <= 50 && i < n.length) {
					n[i] = j;
					System.out.println("N[" + i + "] = " + j);
					i++;
				}
			}
		}
	}
}