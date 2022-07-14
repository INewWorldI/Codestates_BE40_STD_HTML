import java.util.*;

public class TreeSetEx {

    public static void main(String[] args) {

        // TreeSet 생성
        TreeSet<String> workers = new TreeSet<>();

        // TreeSet에 요소 추가
        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim Coding");

        System.out.println(workers); // 오름차순으로 정렬되있는데 그 이유는 TreeSet의 기본 정렬이 오름차순이기 때문
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim", "Park"));
    }

}
