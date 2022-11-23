package ob.springej2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Hola");

    }

    public String imprimeSaludo(){

    return "Esto es un saludo";
}


}
