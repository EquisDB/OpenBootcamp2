package ob.springej2;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService saludo;

    public UserService(NotificationService saludo) {

        this.saludo = saludo;
    }


    @Override
    public String toString() {
        return "ob.springej2.UserService{" +
                "saludo=" + saludo +
                '}';
    }
}
