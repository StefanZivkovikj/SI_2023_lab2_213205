import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){//36
            throw new RuntimeException("Mandatory information missing!");//37
        }

        if (user.getUsername()==null){//40
            user.setUsername(user.getEmail());//41
        }

        int same = 1;//44
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {//45
            same = 0;//46
            for (int i=0;i<allUsers.size();i++) {//47
                User existingUser = allUsers.get(i);//48
                if (existingUser.getEmail() == user.getEmail()) {//49
                    same += 1;//50
                }
                if (existingUser.getUsername() == user.getUsername()) {//52
                    same += 1;//53
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {//62
            return false;//63
        }
        else {//65
            if (!passwordLower.contains(" ")) {//66
                for (int i = 0; i < specialCharacters.length(); i++) {//67
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {//68
                        return same == 0;//69
                    }
                }
            }
        }
        return false;//74
    }

}