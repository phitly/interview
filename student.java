public class OOP {

    public static class User {
        String name;
        String membership;
        int age;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        User u = new User();
        u.name = "Caleb";
        u.membership = "Gold";

        User u2 = new User();
        u2.name = "Sally";
        u2.membership = "Silver";

        System.out.println(u.name);
        System.err.println(u2.name);
        System.out.println(u.age);
    }
}

//when you create an instance of a class its called an object 
// User u = new User();