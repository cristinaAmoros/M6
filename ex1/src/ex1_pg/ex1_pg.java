package ex1_pg;
import java.util.Scanner;
public class ex1_pg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("hola, anem a sumar joder");
 	Scanner sc = new Scanner(System.in);
 	int n1=0, n2=0, r=0 ;
 	System.out.println("fica primer num");
 	n1 = sc.nextInt();
 	System.out.println("fica segon num");
 	n2 = sc.nextInt();
 	r= n1+n2;
 	System.out.println("el resultat es " + r);
 	
 	if(r>0 && r<=5) {
 		System.out.println("primer if");
 	}
 	else if(r>5 && r<=8) {
 		System.out.println("segon if");
 	}
 	else if(r>8) {
 		System.out.println("tercer if");
 	}
 	else {
 		System.out.println("Error");
 	}
 	
	}

}
