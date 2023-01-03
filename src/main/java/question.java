
public class question {

    public static void main(String[] args) {

        Child a = new Child("Jeff");
        Child b = new Child("Henry");
        Child c = new Child("Joe");
        Child d = new Child("Molly");
        Child e = new Child("Beth");
        Child f = new Child("Daniel");

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        a.reorder();
    }
}
