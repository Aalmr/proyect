package Prac1;
import java.util.*;
public class ej2 {
	public static void main(String[] args) {
		Scanner en=new Scanner(System.in);
		System.out.print("Introduce un n�mero entero: ");
		int n=en.nextInt();
		int aux=n;
		for (int t=n-2;t>0;t-=2)
			n*=t;
		System.out.printf("%d!! = %d",aux, n);
	}

}
