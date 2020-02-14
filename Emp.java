package myBean;
import java.io.Serializable;
public class Emp implements Serializable
{
	private String empno;
	private Name name;
	public Emp() 
	{
		this("111","Ravi","Shankar");
	}
	public Emp(String e,String f,String l)
	{
		empno=e;
		name=new Name(f,l);		
	}
	public void setEmpno(String Empno)
	{
		this.empno=empno;
	}
	public void setName(Name n)
	{
		this.name=name;
	}
	public String getEmpno()
	{
		return empno;
	}
	public Name getName()
	{
		return name;
	}
}

