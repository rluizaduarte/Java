public class Inferencia{
	public static void main(String[] args){
		var a = 10; // compilador infere que a é do tipo int
		var b = 10.5f; // compilador infere que b é do tipo float
		var c = "Luiza"; // compilador infere que c é do tipo string

		System.out.println("valor de a = " + a);
		System.out.println("valor de b = " + b);
		System.out.println("valor de c = " + c); 
	}
}