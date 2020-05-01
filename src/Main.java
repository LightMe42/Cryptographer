import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder msg = new StringBuilder();
        StringBuilder encMsg = new StringBuilder("");
        StringBuilder decMsg = new StringBuilder("");
        int key = 999;

        System.out.println("Please enter 'q' when you finished.");
        System.out.println("Input your message here: ");
        msg.append(reader.readLine());

        for(int i = 0; i < msg.length(); i++) {
            encMsg.append((char) (msg.charAt(i) ^ key));
        }


        System.out.println("Hide message: ");
        System.out.println(encMsg);

        for (int i = 0; i < msg.length(); i++) {
            decMsg.append((char) (encMsg.charAt(i) ^ key));
        }

        System.out.println("reverse message:");
        System.out.println(decMsg);
    }
}
