import java.util.*;

public class ArrayListEx{

    public static void main(String[] args) {

        // ArrayList를 생성하여 list에 할당
        List<String> list = new ArrayList<>();
        List<String> newlist = new ArrayList<>();

        // String 타입의 데이터를 ArrayList에 추가
        list.add("Java");
        list.add("egg");
        list.add("tree");
        list.add("코드 스테이츠");
        list.add("SEB 40기");
        list.add(3, "=========="); // add 메서드로 넣을경우 순차적으로 넣어지나 인덱스 값 설정을 통해 중간에 넣는다.

        newlist.add("새로운 텍스트");
        newlist.add("그렇습니다 이것은 새 텍스트");

        list.addAll(newlist); // addAll 메서드를 통해서 기존 리스트에 새로운 리스트를 추가한다.
        // list.addAll(3, newlist); addAll 의 경우도 인덱스 값 설정을 통해 중간에 삽입할 수 있다.

        // 저장된 총 객체 수 얻기
        int size = list.size();

        System.out.println("size :"+size);

        // 0번 인덱스의 객체 얻기
        String skill = list.get(0);

        System.out.println("skill :"+skill);

        System.out.println("");

        System.out.println("[ 인덱스 삭제 전 ]");
        // 저장된 총 객체 수 만큼 조회
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        System.out.println("");

        // 0번 인덱스 객체 삭제
        list.remove(0);

        System.out.println("[ 인덱스 삭제 후 ]");
        for (String str: list) {
            System.out.println(str);
        }

//        System.out.println("");

//        list.clear(); // 리스트 전체 초기화
//
//        System.out.println("[ 인덱스 전체 삭제 ]");
//        for (String str: list) {
//            System.out.println(str);
//        }

        System.out.println();

        if (list.contains("코드 스테이츠")) {
            System.out.println("가지고 있습니다.");
        } else {
            System.out.println("가지고있지 않습니다.");
        }



    }

}
