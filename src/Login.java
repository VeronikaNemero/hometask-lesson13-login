import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Login {

    public static boolean confirmation(String login, String password, String confirmPassword) {
        if((login.length() > 20) || (login.contains(" "))){
            WrongLoginException wrongLoginException = new WrongLoginException("Wrong login!");
            System.out.println(wrongLoginException.getMessage());
        }
        if((password.length() > 20) || (password.contains(" ")) || (password.matches("[0-9]"))){
            WrongPasswordException wrongPasswordException = new WrongPasswordException("Wrong password!");
            System.out.println(wrongPasswordException.getMessage());
        }
        if(!confirmPassword.equals(password)) {
            WrongPasswordException wrongPasswordException = new WrongPasswordException("Dont match the password!");
            System.out.println(wrongPasswordException.getMessage());
        }
        return false;
    }
}
