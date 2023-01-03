public class Child {

    public String name;
    public Child next;
    public Integer size = 0;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Child getNext() {
        return this.next;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNext(Child next) {
        this.next=next;
    }

    public int count(Child c, int x) {
        if (c.next == null) {
            return x++;
        } else {
            x++;
            return count(c.next, x);
        }
    }

    public void print(Child c) {
        if (c.getNext() == null) {
            System.out.println(c.toString());
        } else {
            System.out.println(c.toString());
            print(c.next);
        }
    }

    public Child traverse(Child c, int i) {
        int x;
        for (x=1; x < i; x++) {
            c = c.next;
        }
        return c;
    }

    public Child changeDirection(Child c, Child d) throws NullPointerException {
        Child f;
        if (d.next == null) {
            d.next = c;
            return d;
        } else {
            Child e = d.next;
            d.next = c;
            f = changeDirection(d, e);
        }
        return f;
    }


    public void reorder() {
        //print original
        print(this);

        System.out.println(count(this, 1));
        //reorder
        Child c = traverse(this, count(this, 1)/2);

        Child d = changeDirection(null, c.next);

        c.next = d;
        //print
        print(this);
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }

}
