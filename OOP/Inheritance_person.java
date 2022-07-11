class Person {

    String name;
    int age;

    void learn() {
        System.out.println("공부를 합니다.");
    }

    void walk() {
        System.out.println("걷습니다.");
    }

    void eat() {
        System.out.println("밥을 먹습니다.");
    }

}

class Programmer extends Person {

    String companyName;

    void coding() {
        System.out.println("코딩을 합니다.");
    }

}

class Dancer extends Person {

    String bandName;

    void singing() {
        System.out.println("노래를합니다.");
    }

    void playGuitar() {
        System.out.println("기타를 칩니다.");
    }

}

public class Inheritance_person {

        public static void main(String[] args) {

            Person p = new Person();
            p.name = "Newworld";
            p.age = 26;
            p.learn();
            p.eat();
            p.walk();
            System.out.println(p.name);

            Programmer pg = new Programmer();
            pg.name = "PGnewworld";
            pg.age = 28;
            pg.learn();
            pg.coding();
            System.out.println(pg.name);

        }
}
