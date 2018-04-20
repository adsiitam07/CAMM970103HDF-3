/*
 * Lo que hace es replicar la cadena, ya que si una cadena es generadora de
 * sí misma a partir de una subcadena que se repita, entonces solamente se necesita
 * acotar los extremos, donde es el unico caso donde podria presentarse el problema.
 * 
 * La cadena entregada es una serie de repeticiones de una sola cadena, por lo que los 
 * casos en los que no sea generadora solamente se tienen que considerar en los extremos, que es donde puede fallar la repeticion.
 * 
 * Ademas, es una solucion mucho mas eficiente que la propia, pues la comparacion no es caracter a caracter.
 * 
 * Los resultados son correctos y es una solucion mas general que la propuesta por mí.
 */

public class Extra {
	public static boolean gus(String str) {
		String s = str+str;
		return s.substring(1, s.length()-1).contains(str);
	}
}
