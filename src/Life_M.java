import java.util.Scanner;

public class Life_M {
	Life life;
	Scanner input;
	Life_M(Scanner input){
		this.input = input;
	}
	
	public void addImportantTasks() {
		life = new Life();
		System.out.print("Name:");
		life.Name = input.next();
		System.out.print("Tasks:");
		life.Tasks = input.next();
	}

	public void removeUnnecessaryWork() {
		System.out.print("Name:");
		String name = input.next();
		if(life.Name.equals(name)) { 
			life = null;
			System.out.println("The name is removed");
		}
	}
	
	public void modifyPlans() {
		System.out.print("Name:");
		String name = input.next();
		if(life.Name.equals(name)) {
			System.out.println("The name is modified" + name);
		}
	}
	
	public void showDailyTask() {
		System.out.print("Name:");
		String name = input.next();
		if(life.Name.equals(name)) {
			life.printInof();
		}
	} 
}
