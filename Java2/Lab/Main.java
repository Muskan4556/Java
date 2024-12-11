package Java2.Lab;

import java.util.*;
class Main {
	public static void main(String args[]) {
//		Employee emp = new Employee();
//		System.out.println(emp.toString());
		
		int n = 10;
		Employee employees[] = new Employee[n];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true) {
			  System.out.println("\nMenu:");
	            System.out.println("1. Create new Employee record");
	            System.out.println("2. Update name based on ID");
	            System.out.println("3. Print All Employees");
	            System.out.println("4. Print Department-Specific Employees");
	            System.out.println("5. Remove a employee based on ID");
	            System.out.println("6. Print details based on ID");
                System.out.println("7. Print details based on Year of joining");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	         
	         int choice = sc.nextInt();
	         sc.nextLine();
	         
	         switch (choice) {
			case 1: {
				if(i<n) {
					System.out.println("Enter your id: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter your name : ");
					String name = sc.nextLine();
					System.out.println("Enter your dept: ");
					String dept = sc.nextLine();
                    System.out.println("Enter your year of joining: ");
					String doj = sc.nextLine();
                    
					employees[i] = new Employee(id, name, dept,doj);
					i++;
                    System.out.println("Employee added successfully.");
					break;
				}else {
					 System.out.println("No space available to add a new employee.");
				}
			}
			
			case 2: {
				System.out.println("Enter your id: ");
				int id = sc.nextInt();
				sc.nextLine();
				boolean isFound = false;
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null && employees[k].getId() == id) {
						System.out.println("Enter your name : ");
						String name = sc.nextLine();
						employees[k].setName(name);
                        System.out.println("Name updated successfully.");
						isFound = true;
						break;
					}
				}
                if(!isFound){
                    System.out.println("No employee found");
                }
				break;
			}
			
			case 3: {
				System.out.println("Employees List : ");
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null){
                        System.out.println(employees[k].toString());
                    }
				}
				break;
			}
			
			case 4: {
				System.out.println("Enter dept: ");
				String dept = sc.nextLine();
                boolean isFound = false;
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null && employees[k].getDept().equalsIgnoreCase(dept)) {
						System.out.println(employees[k].toString());
                        isFound = true;
					}
				}
                if(!isFound){
                    System.out.println("No employees found in the specified department.");
                }
				break;
			}
			
			case 5: {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
                sc.nextLine();
                boolean isFound = false;
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null && employees[k].getId() == id) {
						// Shift elements to the left to fill the gap
                        for(int j = k; j < n - 1; j++) {
                            employees[j] = employees[j + 1];
                        }
                        employees[n - 1] = null;  // Set the last element to null after shifting
                        isFound = true;
                        break;
					}
				}
                if(!isFound){
                    System.out.println("No employee found");
                }
				break;
			}
			
			case 6: {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
                sc.nextLine();
                boolean isFound = false;
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null && employees[k].getId() == id) {
						System.out.println(employees[k]);
                        isFound = true;
					}
				}
                if(!isFound){
                    System.out.println("No employee found");
                }
				break;
			}

            case 7: {
                System.out.println("Enter year of joining: ");
				String dateOfJoining = sc.nextLine();
                boolean isFound = false;
				for(int k = 0; k<n; k++ ) {
					if(employees[k]!= null && employees[k].getDateOfJoining().equalsIgnoreCase(dateOfJoining)) {
						System.out.println(employees[k]);
                        isFound = true;
					}
				}
                if(!isFound){
                    System.out.println("No employee found");
                }
				break;
            }
			
			case 8: {
				  System.out.println("Exiting program...");
                  return;
			}
				
			default:
                 System.out.println("Invalid choice. Please try again.");
			}
	         
		}
	}
}