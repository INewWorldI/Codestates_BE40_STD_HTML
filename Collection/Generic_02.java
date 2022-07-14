class Asia {  }
class Korea extends Asia { }
class USA {  }

class Nworld<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Generic_02 {

    public static void main(String[] args) {

        Nworld<Asia> findworld = new Nworld<>();
        findworld.setItem(new Korea());      // 다형성 적용
        //findworld.setItem(new USA()); // 에러

    }

}
