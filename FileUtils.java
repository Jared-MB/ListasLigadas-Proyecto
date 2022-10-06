import java.util.Scanner;
import java.io.*;

public class FileUtils {
	public static Scanner selectFile(String path) throws IOException {
		if(path == null) {
			throw new IOException("Path is null");
		}
		File file = new File(path);
		if (!file.exists()) {
			throw new FileNotFoundException("File not found: " + file.toString());
		}
		Scanner sc = new Scanner(file);
		return sc;
	}
	public static void arrayToFile(Persona[] personas) throws IOException {
		FileWriter file = new FileWriter("output.txt");
		for(int i = 0; i < personas.length; i++) {
			file.write("#\n");
			file.write(personas[i].getNombre());
			file.write("\n");
			file.write(Integer.toString(personas[i].getEdad()));
			file.write("\n");
			file.write(personas[i].getSexo());
			file.write("\n");
			file.write(personas[i].getEstado());
			file.write("\n");
		}
		file.close();
	}
}
