public class OOP {

    public static class User {
        private String _name;
        String membership;

    
        public void setName(String name){
            System.out.println("loggin into file:");
            _name = name;
        }
    
        public String getName(){
            return _name;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        User u = new User();
        u.setName("Caleb");
        u.membership = "Gold";


        System.out.println(u.getName());

    }
}

//when you create an instance of a class its called an object 
// User u = new User();


