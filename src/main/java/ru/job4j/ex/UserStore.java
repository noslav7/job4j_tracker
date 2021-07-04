package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (User.getUserName().equals(login)) {
                throw new UserNotFoundException("Такого ползователя нет в списке");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!User.isValid() || User.getUserName().length() < 3) {
            throw new UserInvalidException("Не подходящее имя пользователя");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access.");
            }
        } catch (UserInvalidException ui) {
            System.out.println("Не подходящий ользователь");
        } catch (UserNotFoundException ue) {
            System.out.println("Имя пользователя не найдено");
        }
    }
}