~~~
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int number) {
         int temp=number;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
         if (number % sum == 0)
            return sum ;
        else
            return -1;
    }
}
~~~
