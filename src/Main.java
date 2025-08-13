import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder ps = new ProcessBuilder("python", ".\\src\\python\\shortener.py", "https://www.youtube.com/watch?v=z1u_so4ZQ-w");
        ps.redirectErrorStream(true);

        Process process = ps.start();

        try (BufferedReader ln = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line = ln.readLine();
            System.out.println(line);
        }


    }
}
