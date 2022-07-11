public class oop_class {

    public static void main(String[] args){
        car tesla = new car("Model 3", "빨강");

        System.out.println("내 차의 모델은 " + tesla.model + " 이고 색은 " +tesla.color+" 입니다.");
        tesla.power();
        tesla.accelerate();
        tesla.stop();

    }

}

class car {

    public String model;
    public String color;

    public car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void power() {
        System.out.println("시동을 걸었습니다");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop() {
        System.out.println("멈춰!");
    }

}
