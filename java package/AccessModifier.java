package svk;

class svk {
     int d = 10;
}

public class AccessModifier {

    public static void main(String[] args) {
        svk obj = new svk();
        System.out.println(obj.d);
        javaAccess ob2 = new javaAccess();
        System.out.println(ob2.sal);
    }
}
