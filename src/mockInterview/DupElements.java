package mockInterview;

public class DupElements {
    public static void main(String[] args) {
        String words = "weather sunny weather sunny school test tomorrow";
        words = words.toLowerCase();
        String container = "";
        int counter = 0;

        String [] wordSplit = words.split(" ");
        for(int i = 0; i < wordSplit.length; i++){
          counter = 0;
          if(!container.contains(wordSplit[i])){
              for(int j = 0; j < wordSplit.length; j++){
                  if(wordSplit[i].equals(wordSplit[j])){
                      counter++;
                  }
              }

          }
          if(counter > 1){
              container += wordSplit[i] + " ";
          }
        }
        System.out.println(container);
    }
}
