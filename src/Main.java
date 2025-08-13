import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Copie Ou Digite Sua URL: ");
        try {

            ProcessBuilder ps = new ProcessBuilder("python", ".\\src\\python\\shortener.py",sc.nextLine());
            ps.redirectErrorStream(true);
            Process process = ps.start();
            try (BufferedReader ln = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line = ln.readLine();
                System.out.println(line);
            }

        }catch (RuntimeException e ){
            System.out.print("Erro Na URL:");
            e.printStackTrace();
        }





        sc.close();


    }
}
