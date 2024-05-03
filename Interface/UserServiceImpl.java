package Interface;

public class UserServiceImpl implements UserService {
    private User[] users;
    private int userCount;

    public UserServiceImpl() {
        this.users = new User[5];
        this.userCount = 0;
    }

    @Override
    public void createUser(String username, String email) {
        // cek apakah username sudah ada
        int userIndex = findUser(username);
        if (userIndex != -1) {
            System.out.println("User already exists");
            return;
        } 

        if (userCount == users.length) {
            System.out.println("User database is full");
            return;
        }
              
        User newUser = new User(username, email);
        users[userCount] = newUser;
        userCount++;
            
        System.out.printf("Successfully created user %s\n", username);
    }

    @Override
    public void readUser(String username) {
        int userIndex = findUser(username);

        if (userIndex == -1) {
            System.out.printf("User tidak ditemukan\n");
            return;
        }

        User user = users[userIndex];
        System.out.printf("Username: %s\n", user.getUsername());
        System.out.printf("Email: %s\n", user.getEmail());
    }

    @Override
    public void updateUser(String username, String email) {
        int userIndex = findUser(username);

        if (userIndex == -1) {
            System.out.printf("User tidak ditemukan\n");
            return;
        }

        User user = users[userIndex];
        user.setEmail(email);
        user.setUsername(username);

        System.out.printf("Username %s berhasil diupdate\n", username);
    }

    @Override
    public void deleteUser(String username) {
        int userIndex = findUser(username);

        if (userIndex == -1) {
            System.out.printf("User tidak ditemukan\n");
            return;
        } 

        User[] newUsersArray = new User[users.length - 1];
        for (int i = 0, j = 0; i < users.length; i++) {
            if (i != userIndex) {
                newUsersArray[j] = users[i];
                j++;
            }
        }


        users = newUsersArray;
        userCount--;

        System.out.printf("User %s berhasil dihapus\n", username);
    }
    
    private int findUser(String username) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }
}
