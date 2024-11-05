public class DataRunner {
  public static void main(String[] args) {

    UserStory NewApplicant = new UserStory("Colleges", "Schools.txt", "applicants.txt", "enrolled.txt");

    NewApplicant.run();
    
  System.out.println(NewApplicant.getCollegeInfo(81));


    
    
    
  }
}
