
public class Aplicação {
	
	public static void main(String[] args) {
		
		/* exemplos de casting implicito.
		
		long x = 12;
		
		double y = 19;
		
		System.out.println(x);
		System.out.println(y);
		
		exemplo de casting explicito.
		
		float a = 40.0F; 
		
		Os valores resutantes das operações abaixo sofrem transformação no valor 
		devido a maneira que os numeros são representados pelo o Java.
		Pois nem sempre o valor cabe dentro da variavel destino*/
		
		float a = (float) 40.0;
		
		short b = (short) 124000;
		
		byte d = (byte) 150;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}

}
