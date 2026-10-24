import java.util.Scanner;

public class IT26100313Lab5Q3{
	
   public static void main(String[] args){
	   
	   Scanner input = new Scanner(System.in);
	   
	    System.out.println("Enter Checkin Date : ");
        int CheckIn = input.nextInt();

        System.out.println("Enter Checkout Date : ");
        int CheckOut = input.nextInt();
      
         if(CheckIn < 1 || CheckIn > 31 && CheckOut < 1 || CheckOut > 31){
			 System.out.println("Days must be between 1 and 31");
			 return;
		}	  
		if(CheckIn >= CheckOut){
			System.out.println("Start date must be less than End date");
			return;
		} 
		
		int NumOfDays = CheckOut - CheckIn;
		
		final double CHAGES_PER_DAY = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE = 0.2;
		
		double TotalAmount;
		
		if(NumOfDays >=3 && NumOfDays<=4){
			TotalAmount = CHAGES_PER_DAY*NumOfDays -CHAGES_PER_DAY*NumOfDays*DISCOUNT_3_TO_4_DAYS;
			}
			else if(NumOfDays >= 5){
			TotalAmount = CHAGES_PER_DAY*NumOfDays - CHAGES_PER_DAY*NumOfDays*DISCOUNT_5_OR_MORE;
			}
			else{
			TotalAmount = CHAGES_PER_DAY*NumOfDays;
			}
         
        System.out.println("Room charge per day : "+ CHAGES_PER_DAY);
        System.out.println("Number of days reserved : "+ NumOfDays);
        System.out.println("Total amount to pay : "+ TotalAmount);		
   }   
   
   
}