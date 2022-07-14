class World<N> { // 제너릭으로 T를 선언했다.
    private N item;

    public World(N item) {
        this.item = item;
    }

    public N getItem() {
        return item;
    }

    public void setItem(N item) {
        this.item = item;
    }
}

public class Generic_01 {

    public static void main(String[] args) {
        World<String> World1 = new World<>("기타줄"); // Basket 클래스 내의 N을 String 으로 바꿔라
    }

}

//위의 객체로 Basket 을 실행하면 아래 예제와 같다.
//class Basket {
//    private String item;
//
//    Basket(String item) {
//        this.item = item;
//    }
//
//    public String getItem() {
//        return item;
//    }
//
//    public void setItem(String item) {
//        this.item = item;
//    }
//}