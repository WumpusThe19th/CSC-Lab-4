public class ModifiedLab4 {
    //In the best case, we assume the base case is put in first.
    //Therefore, we would only run 2 lines of code; The base case.
    //Going through at least one iteration, we check the if statement, print a line, and call the function again.
    //With the even numbers only condition, we get an extra statement to print a line half the time.
    //Therefore, the function's big O notation is n.
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

    //In the best case, we pass in n <= 0, and run only lines of code in the base case.
    //Second best is we get n = 1, where we run 2 extra lines.
    //Otherwise, we run the final statement, running the function twice over.
    //Assuming we put in 2 for our function call, we get 1 + 0 in our return statement, and our result is 1.
    //Assuming we put in 3, we get 2, because (fib(2) + fib(1)) = (1 + 1 + 0).
    //Due to calling itself twice, it counts as 2N, which happens to be the largest term.
    //Therefore, our big O is n.
    int fib(int n){
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    void helloWorld(int n){
        if (n == 0)
            return;
        System.out.println("Hello World!");
        helloWorld(n - 1);
    }

    int SumOfSevens(int n1, int n2){
        if (n1 > n2){
            return 0;
        }
        else if (n1 % 7 == 0){
            return n1 + SumOfSevens(n1 + 7, n2);
        }
        else{
            return SumOfSevens(n1 + 1, n2);
        }
    }

    //Let's assume, for the sake of argument, we have an array of 10, and our key is in index 3.
    //We start by checking the fifth/fourth index.
    //When we see it's not there, we have to go to the left.
    //We do that by comparing the element at that middle index to the key element.
    //When we see it's to the left, we mark the fact it's to the left, and call the function again.
    int recursiveBinarySearch(int[] arr, int key, int left, int right){
        int mid = left + (right - left) / 2;
        System.out.println(mid);

        if (arr[mid] == key){
            return mid;
        }
        else if (arr[mid] >= key){ //if the searched value is greater than the key, we need to go left
            return recursiveBinarySearch(arr, key, left, mid -1);
        }
        else{
            return recursiveBinarySearch(arr, key, mid + 1, right);
        }
    }
}
