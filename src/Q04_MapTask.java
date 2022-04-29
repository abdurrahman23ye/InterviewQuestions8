import java.util.HashMap;
import java.util.Map;

public class Q04_MapTask {
    public static void main(String[] args) {
        // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]


        // BÖLÜM 1
        // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
        // "Grup1" = ["Üye1", "Üye2"]
        // "Grup2" = ["Üye3", "Üye4", "Üye5"]

        // PART 2
        // find how many members each group has

        // BÖLÜM 2
        // her grubun kaç üyesi olduğunu bul

        Map<Integer,String> uyeSayisi=new HashMap<>();

        uyeSayisi.put(1,"ali,veli,ahmet");
        uyeSayisi.put(2,"veli,ahmet");
        uyeSayisi.put(3,"ahmet");

        for (int i = 1; i <=uyeSayisi.keySet().size() ; i++) {

            System.out.println(uyeSayisi.get(i).split(",").length);

        }
    }
}
