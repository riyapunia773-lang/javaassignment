public class Cat {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    public void meow(){
        System.out.println(
                "The cat named " + name + " says : Meow!"
        );
    }

    public static void main(String[]args) {
        Cat cat = new Cat("whiskers");
        Cat anotherCat = new Cat("Rex");

        cat.meow();
        cat.meow();
        anotherCat.meow();
        cat.meow();


    }
}
