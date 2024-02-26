public class Driver{
        public static void main(String[] args){
            OriginalLab4 original = new OriginalLab4();
            System.out.println("Original Lab countDown test");
            original.countDown(4);
            original.gcd(4, 2);
            System.out.println("Original Lab fib test");
            System.out.println(original.fib(3));

            ModifiedLab4 modded = new ModifiedLab4();
            System.out.println("Modded Lab countDown test even number");
            modded.countDown(4);
            System.out.println("Modded Lab countDown test odd number");
            modded.countDown(5);
            System.out.println("Modded Lab GCD test with GCD");
            System.out.println(modded.gcd(6, 3));
            System.out.println("Modded Lab GCD test without GCD");
            System.out.println(modded.gcd(4, 3));
            System.out.println("Modded Lab Hello World test");
            modded.helloWorld(5);
            System.out.println("Modded Lab Sum Of Sevens base case test");
            System.out.println(modded.SumOfSevens(5, 6));
            System.out.println("Modded Lab Sum Of Sevens recursive case test");
            System.out.println(modded.SumOfSevens(7, 20));
            System.out.println("Modded Lab Binary Recursive Search test");
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int key = 8;
            int found_value = modded.recursiveBinarySearch(arr, key, 0, arr.length - 1);
            System.out.println("Value expected is " + key + ". Value returned is " + arr[found_value]);
        }
}
