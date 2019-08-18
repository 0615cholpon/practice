package ocaExam;

public class ReportMain {
    public static void callExport(Exportable ex){
        ex.export();
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
}
