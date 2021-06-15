import java.util.Scanner;
 
public class LifeManager extends Life_M{
    
    public static void main(String[] args) {
        LifeManager lm = new LifeManager();
        Scanner m = new Scanner(System.in);        
        
        while(true)
        {
            System.out.println("***Life Management System Menu***");
            System.out.println("1. Add people with task ");
            System.out.println("2. Print out the people whose task is registered");
            System.out.println("3. Delete person's information(task)");
            System.out.println("4. Modify person's information(task)");
            System.out.println("5. Exit");
  
            String menu = m.nextLine();
            System.out.println();
            
            switch(menu)    {
            case "0":
                System.out.println("***TEST FOR TYPING INFORMATION***");
 
                lm.addNewPerson(new Life(1, "bengi", "exercise", "study", "read the book", "do assignment", "meet friends"));
                lm.addNewPerson(new Life(2, "faker", "study", "exercise", "Walk with dog", "do assignment", "play soccer"));
                lm.addNewPerson(new Life(3, "peanut", "play computer games", "exercise", "walking", "study", "do assignment"));
                lm.addNewPerson(new Life(4, "pray", "do assignment", "walking", "play computer games", "exercise","study"));
                lm.addNewPerson(new Life(5, "smeb","study","play baseball", "exercise", "meet friends", "do assignment"));    
                lm.addNewPerson(new Life(6, "the shy", "exercise", "do assignment", "meet friends", "study", "play computer games"));
                System.out.println();
                break;                
            case "1":
                int num = 0;
                while(true)    {
                    try {
                        System.out.print("Type the number of people: ");
                        num = Integer.parseInt(m.nextLine());
                        break;
                    } catch(Exception e) {
                        System.err.println("Error!");
                    }
                }
                for(int i = 1; i <= num; i++)
                    lm.inputNewPerson();
                break;
            case "2":
                System.out.println("***Print out People List***");
                lm.printPersonList();
                System.out.println();
                break;
            case "3":
                System.out.println("***Delete People List***");
                while(true)
                {
                    try {                        
                        System.out.print("Type Person's Name to delete: ");
                        int toRemove = Integer.parseInt(m.nextLine());
                        lm.deletePerson(toRemove);
                        break;
                    }
                    catch(Exception e) {
                        System.err.println("Error!");
                    }    
                }                            
                break;
            case "4":
                System.out.println("***Modify People List***");
                while(true)
                {
                    try {                        
                        System.out.print("Type Person's Name to modify: ");
                        int toEdit = Integer.parseInt(m.nextLine());
                        lm.editPerson(toEdit);
                        break;
                    }
                    catch(Exception e) {
                        System.err.println("Error!");
                    }
                }
                                
                break;
            case "5":
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("Check the menu again");
                
            }
      
        } 
        
    }
    
}