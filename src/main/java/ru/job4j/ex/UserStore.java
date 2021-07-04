package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users,String login) throws UserNotFoundException {
        if (login.contains(users)) {
            throw new UserNotFoundException("Такого ползователя нет в списке");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String characters = String.valueOf(user);
        if (!user.isValid() || characters.length < 3) {
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
        } catch (UserNotFoundException ue) {
            System.out.println("Имя пользователя не найдено");
        } catch (Exception eui) {
            System.out.println("Не подходящий ользователь");
        }
    }
}
