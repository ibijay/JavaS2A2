public class PrimeNum{
	public static void main (String[] args)
	{
		int i_max_limit_v = Integer.parseInt(args[0]), i, j;
		boolean b_prime_flg_v;
		System.out.println("List of Prime Numbers upto" + i_max_limit_v);
		for (i=2;i<=i_max_limit_v;i++)
		{
			b_prime_flg_v = true;
			for (j=2;j<=i;j++)
			{
				if (i%j==0 && j!=i)
				{
					b_prime_flg_v = false;
					//System.out.println("Composite Number="+i);
					break;
				}
			}
			if (b_prime_flg_v == true)
			{
				System.out.println(i);								
				
				
			}	
		}
	}
}