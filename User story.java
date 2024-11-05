import java.util.Scanner;

/*
 * Represents our user story and the parts of it
 */
public class UserStory {

  private String name;             
  private String[] schools;   
  private int[] applicants;        
  private int[] numenrolled;         
  /*
 * This sets the name of our story parts "schools, applicants,numenrolled"
 */
  
  public UserStory(String name, String schoolFile, String applicantsFile, String enrolledFile) {
    this.name = name;
    
    schools = FileReader.toStringArray(schoolFile);
    applicants = FileReader.toIntArray(applicantsFile);
    numenrolled = FileReader.toIntArray(enrolledFile);
  }
/*
   * This is out user input part
   * it has 3 choices 
   */
  
  public void run() {
    int selection = 0;
    
    while (selection != 3) {
      selection = promptUser();
      System.out.println(showData(selection) + "\n");
    }

    System.out.println("Goodbye! Be sure to also check out:");
  }

  /*
   * this is where the console will prompt our user
   * giving them the text below while the scanner will get their 
   * input
   */
  public int promptUser() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What would you like to know about the " + name + " university? ");
    System.out.println("1: The largest number of applicants");
    System.out.println("2: The largest number of enrolled");
    System.out.println("3: Quit");
    System.out.print("Enter your choice (1, 2, or 3): ");
    
    int choice = input.nextInt();
    input.close();
    return choice;
  }

  /*
   * this allows us to show out data from the user input and scanner
   * it will get either 1,2,or 3 and do the following code
   */
  public String showData(int choice) {
    int index = 0;
    String result = "";
    
    if (choice == 1) {
      index = getMaxApplicants();
      result = "\nResult Found:\n----------\n" + getCollegeInfo(index);
    }
      
    if (choice == 2) {
      index = getMaxEnrolled();
      result = "\nResult Found:\n----------\n" + getCollegeInfo(index);
    }

    return result;
  }

  /*
   * this gets the info from the data sets
   * and goes down each list finding the largest number 
   * and returns it 
   */
  public int getMaxApplicants() {
    int maxValue = applicants[0];
    int maxinfo = 0;

    for (int index = 0; index < applicants.length; index++) {
      if (applicants[index] > maxValue) {
        maxValue = applicants[index];
        maxinfo = index;
      }
    }

    return maxinfo;
  }
/*
* this will grab the largest number in the given 
*index and the rest of the info related to it
*/
  
  public int getMaxEnrolled() {
    int maxValue = numenrolled[0];
    int infomax = 0;
    
    for (int index = 0; index < numenrolled.length; index++) {
      if (numenrolled[index] > maxValue) {
        maxValue = numenrolled[index];
        infomax = index;
      }
    }

    return infomax;
  }

  /*
   * this take the all the college info 
   * and puts it in a proper set up for the user to read in the console.
   */
  public String getCollegeInfo(int index) {
    return schools[index] + "\nMax Applicants: " + applicants[index] + "\nMax Enrolled: " + numenrolled[index];
  }

  
  public String toString() {
    String result = "";

    for (int index = 0; index < schools.length; index++) {
      result += schools[index] + " (" + applicants[index] + " mins, " + numenrolled[index] + " views)\n";
    }

    return result;
  }
  
}
