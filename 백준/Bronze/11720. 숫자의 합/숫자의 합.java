import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += numbers.charAt(i)-'0';
		}
		
		bw.write(sum+"");
		
		br.close();
		bw.close();
	}
}