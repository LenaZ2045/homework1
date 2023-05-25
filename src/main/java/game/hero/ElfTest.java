package game.hero;

public class ElfTest {
    public static void main(String[] args) {

        Elf ElfTest = new Elf();
        String s1 = ElfTest.name;
        String s2 = ElfTest.lastName;
        String s3 = ElfTest.color;
    }
    public ElfTest(String s1, String s2, String s3) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
