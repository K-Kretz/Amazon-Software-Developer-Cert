import java.util.Comparator;

class LastNameComparator implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
      String fullName_1 = (String) o1;
      String fullName_2 = (String) o2;

      String lastName_1 = lastName(fullName_1);
      String lastName_2 = lastName(fullName_2);

      return lastName_1.compareTo(lastName_2);

  }

  private String lastName(String fullName){
   int lastSpaceIndex = fullName.lastIndexOf(' ');
      return fullName.substring(lastSpaceIndex+1);
  }
}
