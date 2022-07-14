import java.util.*;

public class IteratorEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> iterator = list.iterator();

        System.out.println("이터레이터로 삭제 전");
        for(String st:list){
            System.out.println(st);
        }

        if(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("B")){
                iterator.remove();
            }
        }

        System.out.println("이터레이터로 삭제 후");
        for(String st:list){
            System.out.println(st);
        }

    }

}
