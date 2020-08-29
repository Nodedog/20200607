public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        System.out.println("等待前");
        object.wait();
        System.out.println("等待后");

    }
}
