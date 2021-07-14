public class JavaCore3 {

    public static void main (String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20,10);

        System.out.println("Периметр прямокутника = " + r1.p());
        System.out.println("Площа прямокутника = " + r2.area());

    }

}
