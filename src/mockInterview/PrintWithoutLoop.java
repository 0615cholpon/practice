package mockInterview;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        printNumbers(20);
        System.out.println();
        anotherVersion(1, 100);
    }
        public static void printNumbers(int  num){
        if(num > 0){
            printNumbers(num - 1);
        }
        System.out.print(num + " ");

        }

        public static void anotherVersion(int start, int end){
            System.out.print(start + " ");
            start++;
            if(start <= end){
                anotherVersion(start, end);
            }
        }

    }



