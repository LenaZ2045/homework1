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
            this.name = "Egor";
            System.out.println(this.name);
        }
        private void setLastName() {
            this.lastName = "Boyko";
            System.out.println(this.lastName);
        }
        private void setColor() {
            this.color = color;
            System.out.println(this.color);
        }
        int weight1 = this.weight;
        private void getWeight() {
            this.weight = weight;
            System.out.println(this.weight);
        }
        private void getAge() {
            this.age = age;
            System.out.println(this.age);
        }
    }

}

