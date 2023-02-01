package Object_Linked_List;

public class Date 
{
	private int dd;
	private int mm;
	private int yy;
	
	public Date() 
	{
		dd=1;
		mm=1;
		yy=1970;
	}
	public Date(int dd, int mm, int yy) 
	{	
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	public void show_date()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
