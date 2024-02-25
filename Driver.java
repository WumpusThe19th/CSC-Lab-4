public class Driver{
        public static void main(String[] args){
            OriginalLab4 original = new OriginalLab4();
            System.out.println("Original Lab countDown test");
            original.countDown(4);
            original.gcd(4, 2);
            original.fib(5);

            ModifiedLab4 modded = new ModifiedLab4();
            System.out.println("Modded Lab countDown test even number");
            modded.countDown(4);
            System.out.println("Modded Lab countDown test odd number");
            modded.countDown(5);
            System.out.println("Modded Lab GCD test with GCD");
            System.out.println(modded.gcd(6, 3));
            System.out.println("Modded Lab GCD test without GCD");
            System.out.println(modded.gcd(4, 3));
        }
}
