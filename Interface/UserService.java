package Interface;

// create
// read
// update
// delete

public interface UserService {
    public void createUser(String username, String email);
    public void readUser(String username);
    public void updateUser(String username, String email);
    public void deleteUser(String username);
}
