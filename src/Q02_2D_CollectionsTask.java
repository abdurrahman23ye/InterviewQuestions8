import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_2D_CollectionsTask {

    public static void main(String[] args) {
        // Create 2D ArrayList which can store String ArrayLists
        // Create 3 ArrayLists which are Employees, Employers, Companies
        // Store this 3 ArrayList in 2D ArrayList

      List<String> employees=new ArrayList<>(Arrays.asList("a","b","c"));
      List<String> employers=new ArrayList<>(Arrays.asList("d","e","f"));
      List<String> companies=new ArrayList<>(Arrays.asList("g","h","i"));
      List<List<String>> list=new ArrayList<>();

      list.add(employees);
      list.add(employers);
      list.add(companies);

        System.out.println("list = " + list);




        }
    }

