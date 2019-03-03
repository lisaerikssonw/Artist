package artisttest;

public class ArtistExcersice {

    public static void main(String[] args) {

        Perform a1 = (name, song) -> System.out.println(name+ " is singing "+ song);   

        Perform a2 = (name, song) -> System.out.println(name+ " is singing " + song);
        
        a1.playSound("Queen", "Bohemian Rhapsody");
        a2.playSound("David Bowie", "Life on Mars");
        
        
    }

}
