package Tut5;

public class User {
    private String name;
    private int alter;

    public User(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public static void main(String[] args) {
        User user1 = new User("Floh", 21);
        user1.vorstellen();
        user1.geburtstagFeiern();
    }

    public void vorstellen(){
        System.out.println("Hallo ich heiße " + name + " und bin " + alter + " Jahre alt");
    }

    public void geburtstagFeiern(){
        alter++;
    }
}
