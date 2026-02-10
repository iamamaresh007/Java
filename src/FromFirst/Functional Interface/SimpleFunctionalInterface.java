
interface MyInterface {
    void display();
}

class Main {
    public static void main(String[] args) {
        MyInterface mi = () -> System.out.println("Display call from lamba");
        mi.display();
    }
}
