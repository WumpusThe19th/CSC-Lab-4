public class ModifiedLab4 {
    //In the best case, we assume the base case is put in first.
    //Therefore, we would only run 2 lines of code; The base case.
    //Going through at least one iteration, we check the if statement, print a line, and call the function again.
    //With the even numbers only condition, we get an extra statement to print a line half the time.
    //Therefore, the function's big O notation is 3n/2 + 2n/2 + 2.
    void countDown(int num){
        if (num == 0) // test
            System.out.println("Blastoff!");
        else if (num % 2 == 0) {
            System.out.println("...");
            countDown(num - 1); // recursive call
        }
        else{
            countDown(num - 1);
        }
    }

    //This code will output the gcd of the two inputs by performing multiple modulus operations.
    //If the gcd isn't in the base case, we can pass the remainder to the recursive call.
    //Eventually we reach y = 1, which will always work as a denominator, but more accurately means there is no GCD for the inputs.
    int gcd(int x, int y) {
        int result = x;
        while (result >= y)
            result -= y;
        if (result == 0) //base case
            return y;
        else {
            return gcd(y, result);
        }
    }

    //[p] Write the time complexity of this function.
    int fib(int n){
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    //
}
