package day4;

public class Assignment1 {
	public static void main(String[] args) {
		// largest of 2 numbers
		int a=100,  b = 500, c = 600;
		int greatest = (a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println(greatest);
		
		if(a<b&&a<c) {
			System.out.println("A is the smallest");
		} else if(b<a&&b<c){
			System.out.println("B is the smallest");
		} else {
			System.out.println("C is the smallest");
		}
		
		int weekNo = 1;
		
		switch (weekNo) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("No es un mes válido");
			break;
		}
	}
}
