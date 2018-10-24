public class Main {
    public static void main(String[] args) {
        CivilService cs = new CivilService();
        System.out.println(cs.getDaysLeft());
        cs.work();
        cs.work();
        System.out.println(cs.getDaysLeft());
        MilitaryService ms = new MilitaryService(2);
        System.out.println(ms.getDaysLeft());
        ms.work();
        ms.work();
        ms.work();
        System.out.println(ms.getDaysLeft());
    }
}
