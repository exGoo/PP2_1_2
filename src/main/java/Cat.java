import org.springframework.stereotype.Component;

@Component
public class Cat {

    public Cat() {

    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
