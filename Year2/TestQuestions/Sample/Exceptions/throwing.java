package Year2.TestQuestions.Sample.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throwing {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter a number: ");
        try {
            int num = Integer.parseInt(br.readLine());
        } catch (IOException e){
            System.out.println("Input Output error: "+e);
        }

    }
}
