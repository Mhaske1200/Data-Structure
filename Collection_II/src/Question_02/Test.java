package Question_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) 
	{
//		Set<Emp> set = new TreeSet<Emp>(new Comparator<Emp>() 
//		{
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				
//				return (int) (o1.getSal() - o2.getSal());
//			}
//		});
		
		// Lambda Expression 
//		Set<Emp> set= new TreeSet<>(
//				(Emp e1, Emp e2)->{
//					return (int)(e1.getSal()- e2.getSal());
//				}
//				);
		
		Set<Emp> set = new TreeSet<Emp>((Emp e1,Emp e2) ->
		{
			int diff = 0;
			diff = e1.getDeptno()-e2.getDeptno();
			if(diff == 0)
			{
				diff = (int) (e2.getSal()-e1.getSal());
				if(diff == 0)
				{
					diff = e1.getName().compareTo(e2.getName());
					if(diff == 0)
					{
						diff = e1.getEmpid() - e2.getEmpid();
					}
				}
				
			}
			return diff;
			
			
			/*int d = e1.getDeptno()-e2.getDeptno();
			double d1 = (double)e1.getSal()-e2.getSal();
			int d2 = e1.getName().compareTo(e2.getName());
			int d3 = e1.getEmpid()-e2.getEmpid();
			
			if(d==0)
			{
				if(d1==0)
				{
					if(d2==0)
					{
						if(d3==0)
						{
							return 0;
						}
						else if(d3 >0)
						{
							return 1;
						}
						else
						{
							return -1;
						}
					}
					else if(d2 >0)
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
				else if(d1 >0)
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
			else if(d >0)
			{
				return 1;
			}
			else
			{
				return -1;
			} */
			
		});
		
		set.add(new Emp(2369,"Shubham", 85000,10));
		set.add(new Emp(2370,"Viraj", 75000,20));
		set.add(new Emp(2478,"RajVeer", 8000,10));
		set.add(new Emp(2145,"Raj", 65000,20));
		set.add(new Emp(2369,"Lina", 25000,20));
		set.add(new Emp(5698,"Neha", 45000,10));
		set.add(new Emp(2589,"Vishal", 80000,10));
		set.add(new Emp(4758,"Ankita", 95000,30));
		
		System.out.println(set);
		

	}

}
