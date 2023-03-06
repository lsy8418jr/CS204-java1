package Homework;

class Student {
	private String id;
	private int zipcode;
	private String name;

	public Student() {
		id = "8";
		name = "John";
		zipcode = 19090;
	}

	public String getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setid(String newid) {
		id = newid;
	}

	public void setname(String newname) {
		name = newname;
	}

	public void setZip(int newzip) {
		zipcode = newzip;
	}

	public String toString() {
		String result = id + " " + name + " " + Integer.toString(zipcode);
		return result;
	}

}

class TestStudent1 {
	public static void main(String args[]) {

		Student s0 = new Student();
		System.out.println(s0);

		System.out.println();

		Student s1 = new Student();
		s1.setid("P685281");
		s1.setname("Seyun Lee");
		s1.setZip(19008);

		System.out.println("ID is " + s1.getid());
		System.out.println("The student name is " + s1.getname());
		System.out.println("Zipcode is  " + s1.getZipcode());

	}
}