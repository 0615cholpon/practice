package ocaExam;

public class Alpha {
    int ns;
    static int s;
    public Alpha(int ns){
        if(s < ns){
            s = ns;
            this.ns = ns;
        }
    }

    public void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }


}
