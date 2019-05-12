package inheritance;

public class Student {
	public String name;
	public int age;
	public String location;
	public String grade;
	
	public void study(String course) {
		System.out.println(this.name + " is studying " + course);
	}
	public void takeExam(int point) {
		if(point >= 90) {
			this.grade = "A";
		}
		else if(point >= 80 && point < 90) {
			this.grade = "AB";
		}
		else if(point >= 70 && point < 80) {
			this.grade = "B";
		}
		else if(point >= 60 && point < 70) {
			this.grade = "C";
		}
		else {
			this.grade = "F";
		}
	}

}
