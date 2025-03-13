import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //input Scanner
        String name; // vairable to ask name
        //Arrays to storevthe Name of the Movie and its rating 
        String[] movieNames = new String[5];
        int[] movieRatings = new int[5];

        //Asks for users Name
        System.out.println("Welcome to the Movie Rating System");
        System.out.println("\nWhat is your name?");
        name = input.nextLine();

        //Asks for top 5 movies
        System.out.println("Hello " + name);
        System.out.println("\nWhat are 5 Movies you've recently seen?");
        for(int i = 0; i < movieNames.length; i++){
            movieNames[i] = input.nextLine();
        }

        //Asks for rating of movie
        System.out.println("What are the ratings for those Movies out of 1-10?");
        for (int i = 0; i < movieRatings.length; i++){
            movieRatings[i] = input.nextInt();
            input.nextLine();
        }

        //Outputs info
        System.out.println(name);
        System.out.println(movieNames[0]);
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println(movieNames[i]);
        }
    }
}