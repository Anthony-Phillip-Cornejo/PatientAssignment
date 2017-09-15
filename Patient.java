
public class Patient {	
	
	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Patient " + name + " is " + age + " years old.";
	}
	
	public double dosage() {
		return 600.0;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		double bmi;
		bmi = weightInKilograms / (heightInMeters * heightInMeters);
		return bmi;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		if(heightUnits.equalsIgnoreCase("cm")) {
			height = height / 100;
		} else if (heightUnits.equalsIgnoreCase("in")) {
			height = height * 0.0254;
		}
		
		if(weightUnits.equalsIgnoreCase("lbs")) {
			weight = weight * 0.453592;
		} else if (weightUnits.equalsIgnoreCase("stone")) {
			weight = weight * 6.35029;
		}
		double bmi = weight / (height * height);
		return bmi;
	}
	
}
