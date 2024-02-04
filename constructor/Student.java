package constructor;

public class Student {
	private int rollno;
	private String name;
	private String address;
	private double score;

	public Student() {
		rollno = 0;
		name = "";
		address = "";
		score = 0.0;
	}

	public Student(int rollno, String name, String address, double score) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.score = score;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", score=" + score + "]";
	}

}
