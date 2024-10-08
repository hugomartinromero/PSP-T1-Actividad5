package actividad5;

import java.util.Map;

public class Actividad5 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("ls");
		
		Map<String, String> env = pb.environment();
		
		env.forEach((k, v) -> System.out.println("Clave: " + k + "\tValor: " + v));
	}
}
