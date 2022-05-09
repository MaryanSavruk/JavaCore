package demo2;

public class User {
    int id; // byte short int long
    String name;
    String login;
    String password;
    byte age;
    String sex;
    float weight;
    double height;
    boolean isActive;
    char special;

    public User(){
    }

    public User(int id,
                String name,
                String login,
                String password,
                byte age,
                String sex,
                float weight,
                double height,
                boolean isActive,
                char special) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;
        this.special = special;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isActive=" + isActive +
                ", special=" + special +
                '}';
    }
}
