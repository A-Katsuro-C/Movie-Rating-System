import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //input Scanner
        String name; // vairable to ask name 
        //Arrays to storevthe Name of the Movie and its rating
        int MAX = 5; 
        String[] movieNames = new String[MAX];
        int[] movieRatings = new int[MAX];
        int sum = 0;
        int ratingAverage;

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
            int ratingInput = input.nextInt(); // vairable for condition check
            if (!(ratingInput > 10 || ratingInput < 1)){
                movieRatings[i] = ratingInput;
                input.nextLine();
            } else {
                System.out.println("Invalid number, Please enter a new number: ");
                i--;
            }
            
            
        }

        for (int i = 0; i < MAX; i++){
            sum += movieRatings[i];
        }

        ratingAverage = sum / MAX;

        //Outputs info
        System.out.println(name);
        for (int i = 0; i < MAX; i++) {
            System.out.print(movieNames[i] + " - ");
            System.out.println(movieRatings[i]);
        }

        System.out.print("Your average rating is: " + ratingAverage);
        input.close();
    }
}