package Interface;

public class Main {
    
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        userService.createUser("syahreza", "me@syahreza.com");

        System.out.println();
        
        userService.createUser("budi", "me@budi.com");
        
        System.out.println();
        
        userService.readUser("syahreza");
        
        System.out.println();
        
        // userService.readUser("powpdaadada");
        
        // userService.createUser("syahreza", "syahr123@gmail.com");
        
        userService.updateUser("budi", "budi123@gmail.com");
        
        System.out.println();
        
        userService.readUser("budi");
        
        System.out.println();

        userService.deleteUser("budi");

        System.out.println();

        userService.readUser("budi");

        System.out.println();

        userService.readUser("syahreza");
    }
}
