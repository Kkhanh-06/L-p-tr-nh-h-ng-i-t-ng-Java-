public class Parents {

    class Parents {
        int x = 10;

        static void show() {
            System.out.println("Parent static show()");
        }
    }

    class Child extends Parents {
        int x = 20;

        static void show() {
            System.out.println("Child static show()");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);
        p.show();
    }
}
