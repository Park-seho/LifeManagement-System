import java.text.DecimalFormat;
 
public class Life {
    
    private int personNum;
    private String personName;
    private String task1;
    private String task2;
    private String task3;    
    private String task4;    
    private String task5;    

    public Life(int personNum, String personName, String task1, String task2, String task3, String task4, String task5) {
        super();
        this.personNum = personNum;
        this.personName = personName;
        this.task1 = task1;
        this.task2 = task2;
        this.task3 = task3;
        this.task4 = task4;
        this.task5 = task5;

    }

	public int getPersonNum() {
		return personNum;
	}

	public void setPersonNum(int personNum) {
		this.personNum = personNum;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getTask1() {
		return task1;
	}

	public void setTask1(String task1) {
		this.task1 = task1;
	}

	public String getTask2() {
		return task2;
	}

	public void setTask2(String task2) {
		this.task2 = task2;
	}

	public String getTask3() {
		return task3;
	}

	public void setTask3(String task3) {
		this.task3 = task3;
	}

	public String getTask4() {
		return task4;
	}

	public void setTask4(String task4) {
		this.task4 = task4;
	}

	public String getTask5() {
		return task5;
	}

	public void setTask5(String task5) {
		this.task5 = task5;
	}

}