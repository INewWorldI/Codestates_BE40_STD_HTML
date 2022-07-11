public class oop_static {
    public static void main(String[] args) {
//        StaticExample staticExample = new StaticExample();
//        System.out.println("인스턴스 변수: " + staticExample.num1); // static 키워드가 없는 인스턴스 변수
//        System.out.println("클래스 변수: " + StaticExample.num2); //static 키워드가 있는 클래스 변수



        StaticField staticField1 = new StaticField(); // 객체 생성
        StaticField staticField2 = new StaticField();

        staticField1.num1 = 100;
        staticField2.num1 = 1000;

        System.out.println(staticField1.num1);
        System.out.println(staticField2.num1);

        staticField1.num2 = 150;
        staticField2.num2 = 1500;
        System.out.println(staticField1.num2);
        System.out.println(staticField2.num2);

    }
}

//class StaticExample {
//    int num1 = 10;
//    static int num2 = -10;
//}

class StaticField {
    int num1 = 10;
    static int num2 = 15;
}