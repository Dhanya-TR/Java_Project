import java.util.Scanner;
import java.util.ArrayList;
public class todolist {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		int choice;
		do {
			System.out.println("\n1.Add Task\n2.View Task\n3.Delete Task\n4.Exit");
			System.out.println("Enter the Choice:");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter task:");
			    tasks.add(sc.nextLine());
			    break;
			case 2:
				System.out.println("Tasks:");
				for(int i=0;i<tasks.size();i++)
				{
					System.out.println((i+1)+ ". "+tasks.get(i));
				}
				break;
			case 3:
				System.out.println("Enter the task number to delete:");
				int index=sc.nextInt()-1;
				if(index>0 && index<tasks.size()) {
					tasks.remove(index);
					System.out.println("task deleted");
				} else {
					System.out.println("Invalid task Number.");
				}
				break;
			case 4:
				System.out.println("Existing...");
				break;
			default:
				System.out.println("Invalid Choice.");
			}
			
		}while(choice!=4);
		
	}

}
