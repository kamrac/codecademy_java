public class FizzBuzz {

  public static void main(String[] args){
    //write a for loop that iterates to 100
    for(int i = 1; i <= 100; i++){
    // output the counter i
    // check if the number is divisible by 3, if it is, print Fizz
    if (i % 3 == 0) {
      System.out.println("Fizz");
      continue;
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
        continue;
      } else {
       System.out.println(i);
      }
    }
  }
}
