public class CarLoan {

// declare variables for car payment
	public static void main(String[] args) {
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;

// conditional statement to see if buyer needs a loan, can pay in full, or 
needs to do a monthly payment
  if(carLoan <= 0 || interestRate <= 0){
    System.out.println("Error! You must take out a valid car loan.");
  } else if(downPayment >= carLoan) {
    System.out.println("The car can be paid in full");
  } else{
    int remainingBalance = carLoan - downPayment;
    int months = loanLength*12;
    int monthlyBalance = remainingBalance/months;
    int interest = (monthlyBalance*interestRate)/100;
    int monthlyPayment = monthlyBalance + interest;
    System.out.println(monthlyPayment);
  }
	

	}
}
