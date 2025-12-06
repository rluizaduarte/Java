public class PromocoesAutomaticas{
	public static void main(String[] args){
		byte a = 10;
		int b = a + 15; // a é promovido p int
		// se b fosse do tipo byte isso daria erro pq 15 é int
		System.out.println("valor de a = " + a);
		System.out.println("valor de b = " + b);

		int c = 10;
		float d = 1.5f;
		float e = c * d; // a é promovido em float
		// se e fosse int iria dar erro pq 1.5 é float e n cabe em int
		System.out.println("valor de c = " + c);
		System.out.println("valor de e = " + e);
		// o msm acontece com double
	}
}