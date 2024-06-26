
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Long> list = new ArrayList<Long>();
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			list.add(Long.parseLong(st2.nextToken()));
		}
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			list.add(Long.parseLong(st3.nextToken()));
		}
		
		Collections.sort(list);
		
		for(Long l : list) bw.write(l+" ");
		
		bw.flush();
		br.close();
		bw.close();
	}
}

