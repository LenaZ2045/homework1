package game.hero;

// 7. Создать Getter и Setter для нужных полей
// 8. Создать класс Constant
// 9. Добавить static константы (вспомнить синтаксис) elf power, elf charisma, elf magic

public class Elf {
    private int id;
    private String name;
    private String lastName;
    private String color;
    private int weight;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {


//        String name = "Egor";
//        String lastName = "Boyko";
//        String color = "Purple";
//        int weight = 100;
//        int age = 47;



//        System.out.println(name);
//        System.out.println(lastName);
//        System.out.println(color);
//        System.out.println(weight);
//        System.out.println(age);
    }


//    public void setName(String name) {
//        String name1 = this.name;
//        System.out.println(name1);
//    }
//
//    private void setLastName(String lastName) {
//        this.lastName = "Boyko";
//        System.out.println(this.lastName);
//    }
//
//    private void setColor(String color) {
//         String color1 = this.color;
//        System.out.println(color1);
//    }
//    private void getWeight(int weight) {
//        int weight1 = this.weight;
//        System.out.println(weight1);
//    }
//
//    private void getAge(int age) {
//        int age1 = this.age;
//        System.out.println(age1);
//    }
}