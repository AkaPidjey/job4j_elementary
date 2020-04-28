package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = new User();
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                result = users[i];
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (user.isValid()) {
            result = true;
        } else {
            throw new UserInvalidException("User not valid");
        }
        if (user.getUsername().length() < 3) {
            result = false;
            throw new UserInvalidException("Number of characters less than 3");
        }
        return result;
    }

    public static void main(String[] args, User user, User[] users, String login) {
        try {
            if (findUser(users, login)) {
                validate(user) == false;
            }
        } catch (UserInvalidException ie) {
            ie.getMessage();
        } catch (UserNotFoundException fe) {
            fe.getMessage();
        }
        User[] users = { new User("Petr Arsentev", true) };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
