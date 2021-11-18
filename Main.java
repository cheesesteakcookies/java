
/**
    Samuel Yousey, CIS219, Tuesdays and Thursdays at 3:30 PM
 */
public class Main
{
    //Generates random numbers given a maximum and a minimum number
    //Formula from https://careerkarma.com/blog/java-math-random/
    public static int generateNumber(int min, int max) {
                //Generate random number within given range
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    public static void main(String[] args)
    {
        // Generates an array with no duplicates and prints it to the console
        genArray();
    }
    public static void genArray(){
        // initialise instance variables
        int x = 0;
        // Initialise array
        int[] arr = new int[20];
        for (int i = 0; i < arr.length;)
        {
            // Generate a random number between 1 and 30
            int randomNumber = generateNumber(1, 30);
            // Set number to find equal to current number generated
            int tofind = randomNumber;
            boolean found = false;
            // Iterates over array with current generated number
            for (int n : arr) {
                // Checks to see if number is in array
                if(n == tofind) {
                    found = true;
                    //if yes, break the loop
                    break;
                }
            }
            //if number was found generate a new number
            if(found){
                    randomNumber = generateNumber(1, 30);
                }
            //if number was not add it to the array
            if(found == false) {
                    arr[i] = randomNumber;
                    //Print to console
                    System.out.println(randomNumber);
                    //increment the loop counter
                    i++;
                }
        }
    }
}
