
public class ExtendedEuclideanAlgorithm {
	
	public static void euc_algo(int first, int second)
	{
		if (first < second)
		{
			int temp = first;
			first = second;
			second = temp;
		}
		int initial_first = first;
		int initial_second = second;
		
		int[][] final_multipliers = {{1,0}, {0,1}};
		int rem = first % second;
		int divisor = first / second;
		
		while(rem != 0)
		{
			int[] temp = {final_multipliers[0][0] - divisor * final_multipliers[1][0],
					      final_multipliers[0][1] - divisor * final_multipliers[1][1]};
			System.out.print(first + " = " + second + " * " + divisor + " + " + rem + "|||");
			System.out.println("[ " + final_multipliers[0][0] + " , " + final_multipliers[0][1] + "] +  -" + 
								divisor + "[" + final_multipliers[1][0] + " , " + final_multipliers[1][1] + 
								"]" + " = [" + temp[0] + " , " + temp[1] + "]");
			
			first = second;
			second = rem;
			rem = first % second;
			divisor = first / second;
			
			final_multipliers[0][0] = final_multipliers[1][0];
			final_multipliers[0][1] = final_multipliers[1][1];
			final_multipliers[1][0] = temp[0];
			final_multipliers[1][1] = temp[1];
			
			if (rem == 0)
			{
				System.out.println(first + " = " + second + " * " + divisor + " + " + rem);
				System.out.println("HCF(" + initial_first + "," + initial_second + ") = " +
						initial_first + " * " + temp[0] + " + " + initial_second + " * " +
						temp[1] + " = " + second);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		euc_algo(2024,748);
	}

}
