package test_p16;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p16 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�Ja��b");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter =str.charAt(0);
		
		switch(letter)
		{
			case 'a':
			{
				System.out.println("��J���O:a");
				break;
			}
			case 'b':
			{
				System.out.println("��J���O:b");
				break;
			}
			default:
			{
				System.out.println("�п�Ja��b");
				break;
			}
		}				
	}
}
