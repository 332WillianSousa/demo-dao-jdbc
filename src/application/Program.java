package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Department obj2 = new Department(2, "Reportagens");
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
	}

}
