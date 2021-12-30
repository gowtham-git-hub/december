//class1
public class Officer
{
private String name,place;
private int Salary=54321;
long phoneNumber=90801853;

public void setName(String name)
{
this.name=name;
}
public String getname()
{
return name;
}
public void setplace(String place)
{
this.place=place;
}
public String getplace()
{
return place;
}
public void setSalary(int Salary)
{
if(Salary>25000)
this.Salary=Salary;
}  
public int getSalary()
{
return Salary;
}  
}
