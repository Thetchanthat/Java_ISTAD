abstract class Macbook{
    String name1 = "Chip_M1";
    String name2 = "Chip_Intel";
    public abstract void showInfo();
}
class M1 extends Macbook{
    public void showInfo(){
        System.out.println("Output the "+name1);
    }
}
class Inter extends Macbook{
    public void showInfo(){
        System.out.println("Output the "+name2);
    }
}
public class Main {
    public static void main(String[] args) {
        Macbook mac;
        mac = new M1();
        mac.showInfo();
        mac = new Inter();
        mac.showInfo();
    }
}