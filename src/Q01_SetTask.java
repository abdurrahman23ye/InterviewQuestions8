import java.util.*;

public class Q01_SetTask {
    public static <set> void main(String[] args) {
        //  PART 1
        // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
        // and add all elements from ArrayList to Set

        // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
        // ve tüm öğeleri ArrayList'ten Set'e ekleyin

        // PART 2
        // create a method that takes Set<Character> and varargs of char as parameters
        // and adds all chars to the set

        // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
        // ve tüm karakterleri sete ekleyin

        List<Integer> list= new ArrayList<>(Arrays.asList(3,2,1,11,1,2,3,4,5,6,7,8));
       Set<Integer> set= new TreeSet<>();

        for (Integer w: list
             ) { set.add(w);}

        System.out.println("set = " + set);

        list.stream().forEach(t-> System.out.print(t+" "));

        Set<Character> character=new HashSet<>();
        char a='a';
        char b='b';
        char c='c';
        char d='d';

        addCharacter(character, a,b,c,d);

    }

    private static void addCharacter(Set<Character> character, char... a) {

        for (char each:a
             ) {character.add(each);}

        System.out.println("character = " + character);

        character.stream().forEach(t -> System.out.print(t+" "));

    }
}
