package mockInterview;

public class MissingNum {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 7, 8, 10, 15};
        int missing = 1;
        for(int i = 0; i < numbers.length; i++){
            do {
                if (missing != numbers[i]) {
                    System.out.println("Missing number: " + missing);
                    missing++;
                }
            }
            while (missing != numbers[i]);
            missing++;



        }
        }

            }



