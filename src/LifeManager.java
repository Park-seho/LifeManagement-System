import java.util.Scanner;

public class LifeManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Life_M lifeManager = new Life_M(input);
		
		int num = -1;
		while(num != 5) {
			System.out.println("***Life Management System Menu***");
			System.out.println("1.Add important tasks to do today");
			System.out.println("2.Remove unnecessary work");
			System.out.println("3.Modify plans");
			System.out.println("4.Show a daily task");
			System.out.println("5.Exit");
			System.out.println("Select one number 1-5:");
			num = input.nextInt(); 
			if(num == 1) {
				lifeManager.addImportantTasks();
			}
			else if(num == 2) {
				lifeManager.removeUnnecessaryWork();
			}
			else if(num == 3) {
				lifeManager.modifyPlans();
			}
			else if(num == 4) {
				lifeManager.showDailyTask();
			}
			else {
				continue;
			}
		}
	}	
}