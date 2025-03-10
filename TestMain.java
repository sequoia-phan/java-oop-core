class GC {
    int value;

    GC(int value) {
        this.value = value;
    }

    void setValue(int newValue) {
        this.value = newValue;
    }
}

class Main {
    public static void modify(GC obj) {
        obj.value = 100;  // Modifying the object's field
    }

    public static void changeReference(GC obj) {
        obj = new GC(200);  // Assigning obj to a new object
    }

    public static void main(String[] args) {
        GC gc3 = new GC(10);
        GC gc4 = gc3;  // Both gc3 and gc4 refer to the same object

        modify(gc3);
        System.out.println("After modify(gc3): gc3.value = " + gc3.value); // 100
        System.out.println("After modify(gc3): gc4.value = " + gc4.value); // 100

        changeReference(gc3);
        System.out.println("After changeReference(gc3): gc3.value = " + gc3.value); // 100
        System.out.println("After changeReference(gc3): gc4.value = " + gc4.value); // 100
    }
}

