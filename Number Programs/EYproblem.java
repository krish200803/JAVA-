import java.util.Scanner;
class EYproblem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the players");
		String str = sc.next();
		int cnt = 0;
		

		for(int i=0 ;i<=str.length();i++)
		{
			if(str.charAt(i) == 1)
			{
				cnt++;
			}
			else
				cnt = 0;

		}
	}
}
