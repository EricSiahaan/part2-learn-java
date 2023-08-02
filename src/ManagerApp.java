public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Eric";
        manager.sayHello("Hamzah");

        var vp = new VicePrecident();
        vp.name = "Joko";
        vp.sayHello("Hamzah");

        System.out.println(manager);
        System.out.println(vp);
        System.out.println(manager.toString());
        System.out.println(vp.toString());
    }
}
