package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        int i = 0;
        for (User name : users) {
            if (name.getUsername().equals(login)) {
                rsl = name;
                break;
            } else {
                i++;
            }
        }
        if (i == users.length) {
            throw new UserNotFoundException("Пользователь не найден.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
            if (!user.isValid() || user.getUsername().length() < 3) {
                throw new UserInvalidException("Пользователь не валидный.");
            }
        return true;
    }

    public static void main(String[] args) {
            try {
                User[] users = {
                        new User("Petr Arsentev", true),
                        new User("Vasia Orlov", true)
                };
                User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
