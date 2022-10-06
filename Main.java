import java.io.*;	
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = FileUtils.selectFile("input.txt");
		TLista lista = new TLista();
		while(sc.hasNextLine()) {
			sc.nextLine();
			String nombre = sc.nextLine();
			int edad = Integer.parseInt(sc.nextLine());
			String sexo = sc.nextLine();
			String estado = sc.nextLine();
			Persona persona = new Persona(nombre, edad, sexo, estado);
			lista.addSort(persona);
		}
		FileUtils.arrayToFile(lista.toArray());
		sc.close();
	}
}