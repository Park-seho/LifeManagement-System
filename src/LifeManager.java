import java.util.Scanner;

public class LifeManager {

	public static void main(String[] args) {
		int num = 5;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("***Life Management System Menu***");
			System.out.println("1.Add important tasks to do today");
			System.out.println("2.Remove unnecessary work");
			System.out.println("3.Modify plans");
			System.out.println("4.Show a daily task");
			System.out.println("5.Show a menu");
			System.out.println("6.Exit");
			System.out.println("Select one number 1-6:");
			num = input.nextInt(); 
			if(num == 1) {
				addImportantTasks();
			}
			else if(num == 2) {
				removeUnnecessaryWork();
			}
			else if(num == 3) {
				modifyPlans();
			}
			else if(num == 4) {
				showDailyTask();
			}
			else {
				continue;
			}
		}
	}
	public static void addImportantTasks() {
		Scanner input = new Scanner(System.in);
		System.out.print("Morning Tasks:");
		String MorningTasks = input.next();
		System.out.print("Afternoon Tasks:");
		String AfternoonTasks = input.next();
	}
	
	public static void removeUnnecessaryWork() {
		Scanner input = new Scanner(System.in);
		System.out.print("Want to remove Tasks:");
		String WantRemove = input.next();
	}
	
	public static void modifyPlans() {
		Scanner input = new Scanner(System.in);
		System.out.print("Want to modify Tasks:");
		String WantModify = input.next();
	}
	
	public static void showDailyTask() {
		Scanner input = new Scanner(System.in);
		System.out.println("a.study major");
		System.out.println("b.meet friends");
		System.out.println("c.play computer games");
		System.out.println("d.do part time job");
		System.out.println("e.do assignments");
		int ShowDaily = input.nextInt();
	} 
	
}