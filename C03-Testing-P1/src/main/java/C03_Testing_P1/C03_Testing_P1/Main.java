package C03_Testing_P1.C03_Testing_P1;

public class Main {
	
	public static void main(String[] args) {
		Estado estadoPrueba= new Estado(true,false,false, true, true, 31, 0, false, false, false);
		System.out.println(estadoPrueba.hacerRecomendacion());
	}

}
