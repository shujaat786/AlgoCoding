
public class PrimeNumbers {

	public static void main(String[] args) {

		int num =32;
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			//condition for non prime
			
			if(num%i==0) {
				
				flag = true;
				break;
			}
			
			
		}
		if(!flag) {
			
			System.out.println("Number is a prime number");
		}
		else
		{
			System.out.println("Not  Prime");
			
		}
		
	
	
	
	
	
	int number = 32;
    boolean flag2 = false;
    for (int i = 2; i <= number / 2; ++i) {

        // condition for i to be a prime number
        if (checkPrime(i)) {

            // condition for n-i to be a prime number
            if (checkPrime(number - i)) {

                // n = primeNumber1 + primeNumber2
             //   System.out.printf("%d = %d + %d\n", number, i, number - i);
                System.out.println(number + "="+ i + "+" + (number - i));
                flag2 = true;
            }

        }
    }

    if (!flag2)
        System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
}

// Function to check prime number
static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }

    return isPrime;
}

}
