package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                result = users[i];
                break;
            }
            if (result == null) {
                throw new UserNotFoundException("User not found");
            }
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
    //    boolean result = false;
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        }

        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Number of characters less than 3");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr", true)};
        try {
            User user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.getMessage();
        } catch (UserNotFoundException fe) {
            fe.getMessage();
        }
    }
}
