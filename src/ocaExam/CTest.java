package ocaExam;

public class CTest {

        String name;
        boolean contract;
        double salary;
        public CTest(){
            this.name = "Joe";
            this.contract = true;
            this.salary = 100;
        }

        public String toString(){
            return name + ":" + contract + ":" + salary;
        }


}
