import java.util.*;
import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class project1
{
	 public static void main(String[] args)
	{
		Hashtable<String,String> ht= new Hashtable<String,String>();
		Console console=System.console();
		Scanner sc = new Scanner(System.in);
		String regid="O101";
		int choice,choice1;
		double ph;
		String reg_name;
		String add;
		char[] password;
		int sum=0;
		String flag="true";
		System.out.println("=====================================================================");
		System.out.println("                      Hotel Management System                        ");
		System.out.println("=====================================================================");
		do
		{
		System.out.println("1. Registration");
		System.out.println("2. Log into Your account");
		System.out.println("4. Exit");
		//System.out.println("3. Display ALL");
		System.out.println("Enter Your Choice:");
		choice=sc.nextInt();

			switch(choice)
			{
				case 1:
						System.out.println("Enter Your User Name:");
						reg_name=sc.next();		
						System.out.println("Enter Password:");
						password = console.readPassword();
						ht.put(reg_name,new String(password));
						System.out.println("Thanks For Registration, Hope We will be able to Serve You the Best FOOD of your life :)");						
						System.out.println("");
					break;
				case 2:
						System.out.println("Enter Your User Name:");
						reg_name=sc.next();		
						System.out.println("Enter Password:");
						password = console.readPassword();
						
						if(ht.containsKey(reg_name))
						{
							if(ht.containsValue(new String(password)))
							{
								System.out.println("Please Enter the Following Details.....");
								System.out.println("Enter your Phone Number:");
								ph=sc.nextDouble();
								System.out.println("Enter Address:");
								add=sc.next();
								System.out.println("Enter your City:");
								String city=sc.next();
								System.out.println("Enter your Email Address:");
								String email=sc.next();
								System.out.println("");
								do
								{
									System.out.println("1. Menu");
									System.out.println("2. Place the Order");
									System.out.println("3. For FeedBack");
									System.out.println("4. For Cancel The Order");
									System.out.println("5. For Main Page");
									System.out.println("Enter the Choice");
									choice1=sc.nextInt();
									switch(choice1)
									{
										case 1:
										System.out.println("\tVEG\t\t\t\t\tNON-VEG\t");
										System.out.println("CODE\tNAME\t\tPRICE(In-Rs)\tCODE\tNAME\t\tPRICE(In-Rs)");
										System.out.println("1\tPanner Tikka\t130\t\t11\tChicken Tikka\t150");
										System.out.println("2\tPanner Curry\t120\t\t12\tChicken Curry\t170");
										System.out.println("3\tPanner Muglai\t140\t\t13\tChicken Muglai\t190");
										System.out.println("4\tPanner Biryani\t130\t\t14\tChicken Biryani\t180");
										System.out.println("5\tPanner Bhurji\t110\t\t15\tChicken Teriaki\t200");
										System.out.println("6\tPanner Masala\t120\t\t16\tChicken Masala\t170");
										System.out.println("7\tPanner Kofta\t110\t\t17\tChicken Kofta\t160");
										System.out.println("8\tPanner Tandoori\t200\t\t18\tChicken Tandoori270");
										System.out.println("9\tPanner Handi\t140\t\t19\tChicken Handi\t190");
										System.out.println("10\tPanner Kadhai\t140\t\t20\tChicken Kadhai\t190");	
										break;
										case 2:

										System.out.println("          \t\t****************************\t\t          ");
										System.out.println("          \t\t           MENU             \t\t          ");
										System.out.println("          \t\t****************************\t\t          ");
										System.out.println("\tVEG\t\t\t\t\tNON-VEG\t");
										System.out.println("CODE\tNAME\t\tPRICE(In-Rs)\tCODE\tNAME\t\tPRICE(In-Rs)");
										System.out.println("1\tPanner Tikka\t130\t\t11\tChicken Tikka\t150");
										System.out.println("2\tPanner Curry\t120\t\t12\tChicken Curry\t170");
										System.out.println("3\tPanner Muglai\t140\t\t13\tChicken Muglai\t190");
										System.out.println("4\tPanner Biryani\t130\t\t14\tChicken Biryani\t180");
										System.out.println("5\tPanner Bhurji\t110\t\t15\tChicken Teriaki\t200");
										System.out.println("6\tPanner Masala\t120\t\t16\tChicken Masala\t170");
										System.out.println("7\tPanner Kofta\t110\t\t17\tChicken Kofta\t160");
										System.out.println("8\tPanner Tandoori\t200\t\t18\tChicken Tandoori270");
										System.out.println("9\tPanner Handi\t140\t\t19\tChicken Handi\t190");
										System.out.println("10\tPanner Kadhai\t140\t\t20\tChicken Kadhai\t190");
										System.out.println("Enter the Number of Items you Want to Order:");
										int choice2=sc.nextInt();
										for(int i=1;i<=choice2;i++)
										{
											System.out.println("Enter The Code:");
											int c1=sc.nextInt();
											if(c1==1)
											{
												sum=sum+130;
											}
											else if(c1==2)
											{
												sum=sum+120;
											}
											else if(c1==3)
											{
												sum=sum+140;
											}
											else if(c1==4)
											{
												sum=sum+130;
											}
											else if(c1==5)
											{
												sum=sum+110;
											}
											else if(c1==6)
											{
												sum=sum+120;
											}
											else if(c1==7)
											{
												sum=sum+110;
											}
											else if(c1==8)
											{
												sum=sum+200;
											}
											else if(c1==9)
											{
												sum=sum+140;
											}
											else if(c1==10)
											{
												sum=sum+140;
											}
											else if(c1==11)
											{
												sum=sum+150;
											}
											else if(c1==12)
											{
												sum=sum+170;
											}
											else if(c1==13)
											{
												sum=sum+190;
											}
											else if(c1==14)
											{
												sum=sum+180;
											}
											else if(c1==15)
											{
												sum=sum+200;
											}
											else if(c1==16)
											{
												sum=sum+170;
											}
											else if(c1==17)
											{
												sum=sum+160;
											}
											else if(c1==18)
											{
												sum=sum+270;
											}
											else if(c1==19)
											{
												sum=sum+190;
											}
											else if(c1==20)
											{
												sum=sum+190;
											}
										}
										System.out.println("Sum of the Order is:"+sum);
										System.out.println("Do you Have any Coupon Code?");
										String cc=sc.next();
										if(cc.equals("YES")||cc.equals("yes"))
										{
											System.out.println("Please Enter the Coupon Code:");
											String cc1=sc.next();
											if(cc1.equals("FIRST30")||cc1.equals("first30"))
											{
												int sum1=(sum*30)/100;
												sum=sum-sum1;
												System.out.println("You Got 30% Discount");
												System.out.println("Discounted Amount is "+sum);
											}
											else if(cc1.equals("FIRST20")||cc1.equals("first20"))
											{
												int sum1=(sum*20)/100;
												sum=sum-sum1;
												System.out.println("You Got 20% Discount");
												System.out.println("Discounted Amount is "+sum);
											}
											else if(cc1.equals("FIRST10")||cc1.equals("first10"))
											{
												int sum1=(sum*10)/100;
												sum=sum-sum1;
												System.out.println("You Got 10% Discount");
												System.out.println("Discounted Amount is "+sum);
											}
											System.out.println("Your Address provided is "+add);
											System.out.println("Your Phone Number Provided is "+ph);
											System.out.println("Please Confirm(1-Correct/0-Change)");
											int con	=sc.nextInt();
											if(con==1)
											{
												System.out.println("Thank You For placing the Order");
												System.out.println("Your Order will be Delivered Soon....");
											}
											else
											{
												System.out.println("Enter your Phone Number:");
												ph=sc.nextDouble();
												System.out.println("Enter Address:");
												add=sc.next();
												System.out.println("Thank You, Your Details Have been updated");
												System.out.println("And Your Order will be Delivered Soon....");	
											}
										}
										else
										{
											System.out.println("No Problem");
											System.out.println("Your Address provided is "+add);
											System.out.println("Your Phone Number Provided is "+ph);
											System.out.println("Please Confirm(1-Correct/0-Change)");
											int con	=sc.nextInt();
											if(con==1)
											{
												System.out.println("Thank You For placing the Order");
												System.out.println("Your Order will be Delivered Soon....");
											}
											else
											{
												System.out.println("Enter your Phone Number:");
												ph=sc.nextDouble();
												System.out.println("Enter Address:");
												add=sc.next();
												System.out.println("Thank You, Your Details Have been updated");
												System.out.println("And Your Order will be Delivered Soon....");	
											}
										}
										break;
										case 3:
										System.out.println("Please Give your Precious FeedBack:");
										String fed = sc.next();
										break;
										case 4:
										if(sum==0)
										{
											System.out.println("NO ORDER is Placed");
											System.out.println("");
										}
										else
										{
											System.out.println("Your Order is Cancelled");
											System.out.println("");
										}
										sum=0;
										break;
										default:
										System.out.println("Back to the Main Page");
										System.out.println("");
										break;
									}
								}while(choice1<5);
							}
							else
							{
								System.out.println("Password Not Found!");
								System.out.println("");
							}
						}
						else
						{
							System.out.println("Username Not Found!");
							System.out.println("");
						}
					break;
				case 3:
						System.out.println(ht);
					break;
				default:
					break;

			}
		}while(choice<4);		
	}
}