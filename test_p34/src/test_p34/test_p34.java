package test_p34;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p34
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res =Integer.parseInt(str);
		
		for(int j=1;j < 10;j++) {
			
			if(j==res)
			continue;
			System.out.println("第"+j+"次的處理。");			
		}
	}
}
