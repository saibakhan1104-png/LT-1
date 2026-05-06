 class HarshadNumber {
    int number;
     HarshadNumber(int number){
        this.number=number;
    }
    public String CheckHarshad() {
        int temp=number;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0)
            return number + " is a Harshad number";
        else
            return number + " is not a Harshad number";
    }
}
 public class mainHarshad {
     public static void main(String[] args){
         int number = Integer.parseInt(args[0]);
         HarshadNumber hn=new HarshadNumber(number);
         System.out.println(hn.CheckHarshad());


     }
 }
