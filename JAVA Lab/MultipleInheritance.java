interface Bank
{
void accountNumber();
}
interface Loan
{
void getRoI();
}
class Multi implements Bank,Loan
{
public void accountNumber()
{
System.out.println("details of account");
}
public void getRoI()
{
System.out.println("rate of interest");
}
}
class MultipleInheritance
{
public static void main(String args[])
{
Multi m=new Multi();
 m.accountNumber();
 m.getRoI();
}
}