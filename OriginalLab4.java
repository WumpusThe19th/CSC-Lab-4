public class OriginalLab4{
        void countDown(int num){
            if (num == 0) // test
                System.out.println("Blastoff!");
            else{
                System.out.println("...");
                countDown(num-1); // recursive call
            } 
        }
        
        int gcd(int x, int y) {
            if (x % y == 0) //base case
                return y;
            else
                return gcd(y, x % y);
        }
        
        int fib(int n){
            if (n <= 0) // base case
                return 0;
            else if (n == 1) // base case
                return 1;
            else
                return fib(n - 1) + fib(n - 2);
        }
}
