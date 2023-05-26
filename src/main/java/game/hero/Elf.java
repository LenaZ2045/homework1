package game.hero;

public class Elf<name> {
    public String name;
    public String lastName;
    public String color;
    private int weight;
    private int age;

    public void main(String[] args) {

        Elf id = new Elf();
        String name = "Egor";
        String lastName = "Boyko";
        String color = "Purple";
        int weight = 100;
        int age = 47;
    }


    private void setName(String name) {
        String name1 = this.name;
        System.out.println(name1);
    }

    private void setLastName(String lastName) {
        this.lastName = "Boyko";
        System.out.println(this.lastName);
    }

    private void setColor(String color) {
        this.color = color;
        System.out.println(this.color);
    }

    int weight1 = this.weight;

    private void getWeight(int weight) {
        this.weight = weight;
        System.out.println(this.weight);
    }

    private void getAge(int age) {
        int age1 = this.age;
        System.out.println(age1);
    }
}