package task2;
public class User {
    private String name;
    private int age;

    public User() {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return  "{\n" +
                "        \"name\": \"" + getName() + "\",\n" + // додати лапки для імені
                "        \"age\": " + getAge() + "\n" +
                "    }\n";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
