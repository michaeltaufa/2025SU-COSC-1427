public class TestInfo 
{
  public static void main(String[] args) 
  {
    System.out.println("Calling method from another class:");
    // ParadisInfo is calling method from 'ParadiseInfo' from different
    // file, but in the same directory.
    ParadiseInfo.displayInfo();
  }
}
