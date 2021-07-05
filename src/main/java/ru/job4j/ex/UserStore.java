package ru.job4j.ex;

public class UserStore {
    User user;
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                return user;
            } else {
                return null;
            }
        }
        throw new UserNotFoundException("Такого пользователя нет в списке");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || user.getUserName().length() >= 3) {
            return true;
        } else{
            throw new UserInvalidException("Не подходящее имя пользователя");
        }
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
