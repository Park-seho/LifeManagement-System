import java.util.ArrayList;
import java.util.Scanner;
 
public class Life_M {
    
    private ArrayList<Life> Life;
    private Scanner s = new Scanner(System.in);
    
    public Life_M()
    {
        this.Life = new ArrayList<>();    // Student형 변수 배열 생성
    }
    
    public void addNewPerson(Life life)    
    {
        Life.add(life);        
        
        System.out.println("Complete Adding");
    }
    
    public void deletePerson(int personNum)
    {
        boolean isTargetThere = false;
        for(int i = 0; i < Life.size(); i++)    
        {
            if ( Life.get(i).getPersonNum() == personNum )
            {
                int tempNum = Life.get(i).getPersonNum();
                Life.remove(i);
                System.out.println( tempNum + " complete deleting of the person's contents");
                isTargetThere = true;
                break;
            }
        }
        
        System.out.println( !isTargetThere ? "There is no information of the person you typed" : "");
    }
    
    public void editPerson(int personNum) throws Exception
    {
        boolean isTargetThere = false;
        for(int i = 0; i < Life.size(); i++)    
        {
			if ( Life.get(i).getPersonNum() == personNum )
            {
                isTargetThere = true;
                
                System.out.println(" Modify " + Life.get(i).getPersonNum());
                
                int toEditStdNum = inputPersonNum(false);
                if (toEditStdNum == 0)
                    System.out.println("학번 정보를 변경하지 않았습니다.");
                else 
                    Life.get(i).setPersonNum(toEditStdNum);        
                
                Life.get(i).setPersonName(inputPersonName(false));                
 
                Life.get(i).setTask1(inputTask("Task1", false));
                Life.get(i).setTask2(inputTask("Task2", false));
                Life.get(i).setTask3(inputTask("Task3", false));
                Life.get(i).setTask3(inputTask("Task4", false));
                Life.get(i).setTask3(inputTask("Task5", false));
                System.out.println();
                
                System.out.println("The revised information is as follows.");
                System.out.println("PersonNumber\tName\tTask1\tTask2\tTask3\tTask4\tTask5");
              
            }
        }
        
        System.out.println( !isTargetThere ? "There is no person you typed" : "");
    }
    
    
    public void printPersonList()
    {
        System.out.println("PersonNumber\tName\tTask1\tTask2\tTask3\tTask4\tTask5");
 
 
        for(Life life : Life)    
        {
            printOnePerson(life);
        }
 
    }
    
    public void printOnePerson(Life person)
    {
        System.out.println(person.getPersonNum()+"\t"+    
        		person.getPersonName()+"\t"+    
        		person.getTask1()+"\t"+
        		person.getTask2()+"\t"+     
        		person.getTask3()+"\t"+ 
                person.getTask4()+"\t"+ 
                person.getTask5());    
    }
    
    private int inputPersonNum(boolean isFirstInput)
    {
        while(true)
        {
            int tempNum = 0;
            try {
                if (isFirstInput)
                {
                    System.out.print("Type a person number to type(ONLY NUMBER): ");
                }
                else
                {
                    System.out.print("Type a person number to modify: ");
                }                
                
                tempNum = Integer.parseInt(s.nextLine());
                
                return tempNum;            
            }
            catch(Exception e)
            {
                System.err.println("Error! Try again.");
            }
        }        
    }    
    
    
    private String inputPersonName(boolean isFirstInput)
    {
        while(true)
        {
            try {
                System.out.print(isFirstInput ? "Type " : "Modify ");
                System.out.print("Type The Name: ");
                return s.nextLine();
            }
            catch (Exception e)
            {
                System.err.println("Error! Try again.");
            }
        }
        
    }
    
    private String inputTask(String tasks, boolean isFirstInput)
    {
        String task;
        while(true)
        {
            try {
                System.out.print(isFirstInput ? "Type " : "Modify ");
                System.out.print(tasks + " type task: ");
                task = String.valueOf(s.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.err.println("Error! Try again.");
            }
        }
        
        return task;        
    }
    
    void inputNewPerson()
    {
        int stdNum = inputPersonNum(true);
        String stdName = inputPersonName(true);
        String task1 = inputTask("T1", true);
        String task2 = inputTask("T2", true);
        String task3 = inputTask("T3", true);    
        String task4 = inputTask("T4", true);    
        String task5 = inputTask("T5", true);    

        addNewPerson(new Life(stdNum, stdName, task1, task2, task3, task4, task5));        
    }        
}