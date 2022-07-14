import java.util.*;

public class HashSetEx {

    public static void main(String[] args) {

        // HashSet 생성
        HashSet<String> languages = new HashSet<>();

        // HashSet에 객체 추가
        languages.add("Java");
        languages.add("Python");
        languages.add("Java"); // 중복
        languages.add("Javascript");
        languages.add("C");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Node Js");
        languages.add("Java"); // 중복

        System.out.println("객체의 수 :"+languages.size());

        // 반복자 생성하여 it에 할당
        Iterator it = languages.iterator();

        // 반복자를 통해 HashSet 을 순회하며 각 요소들을 출력

        System.out.println();
        System.out.println("기본 순회 출력");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // contains 메서드로 Java 를 체크후 있으면 Java 를 삭제
        System.out.println();
        System.out.println("Java 가 있는지 체크 후 삭제");
        if(languages.contains("Java")){
            languages.remove("Java");
            System.out.println("Java 를 삭제했습니다.");
        }

        // isEmpty 메서드를 통해서 리스트가 set 이 비워져 있는지 아닌지 유무 파악
        System.out.println();
        System.out.println("set 이 비워져있는지 체크");
        if(languages.isEmpty()){
            System.out.println("비어있습니다.");
        } else System.out.println("비어있지 않습니다.");


    }

}
