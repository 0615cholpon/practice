package Abstractions;

public class Boeing {
    public static void main(String[] args) {
        String [][] array = {{"A", "B", "C", "U", "F"}, {"D", "E"}};

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
               // System.out.print(array[i][j] + " ");
                if(array[i][j].equals("B")){
                    break;
                }
            }

        }



    }

}
