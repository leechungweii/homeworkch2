package test_p32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p32 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݭn�b�ĴX���B�z�����j��O?(1~10)");		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res =Integer.parseInt(str);
		
		for(int j=1;j < 10;j++) {
			System.out.println("��"+j+"�����B�z�C");
			if(j==res)
				break;
		}
	}
}
