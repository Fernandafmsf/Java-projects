package entities;

public class Student {
	public String name;
	public double nota_1;
	public double nota_2;
	public double nota_3;
	
	public double getFinalGrade() {
		return nota_1+nota_2+nota_3;
	}
	
	public String finalSituation() {
		if(getFinalGrade()>=60) {
			return "Passed";
			
		}else {
			//double pointsMissing= 60-getFinalGrade();
			return "Failed\n"
					+"Missing "
					+String.format("%.2f", 60-getFinalGrade());
			
		}
	}

}
