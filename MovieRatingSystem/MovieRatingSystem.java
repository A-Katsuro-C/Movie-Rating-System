import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args){
        //Step 1: Implements User Input Handling 
        Scanner input = new Scanner(System.in); //input Scanner
        String name; // vairable to ask name 
        //Variables to store the Name of the Movie and its rating
        int MAX = 5; 
        String[] movieNames = new String[MAX];
        int[] movieRatings = new int[MAX];
        //Variables for Average Rating
        int sum = 0;
        int ratingAverage;

        int count = 0;

        //Asks for users name
        System.out.println("Welcome to the Movie Rating System");
        System.out.println("\nWhat is your name?");
        name = input.nextLine();

        //Step 2: Accept and Validate Movie Ratings
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

        //Step 3: Calculates the Average Rating
        for (int i = 0; i < MAX; i++){
            sum += movieRatings[i];
        }

        ratingAverage = sum / MAX;
        //Outputs info
        System.out.println("Name: " + name + "\nMovie Name - Rating\n");
        for (int i = 0; i < MAX; i++) {
            System.out.print(movieNames[i] + " - ");
            System.out.println(movieRatings[i]);
            if (movieRatings[i] == 10){
                System.out.println("Wow! You found a masterpiece.\n");
            }
            if (movieRatings[i] < 4){
                System.out.println("That Movie didn't impress you much.\n");
                if (movieRatings[i] < 3){
                    System.out.println("You have strong opinions on movies.\n");
                }
            }
            
        }

        System.out.print("\nYour average rating is: " + ratingAverage);
        //Step 4: Implements Rating Classification (if-else Statments)
        if (ratingAverage == 10 || ratingAverage == 9){
            System.out.println(" You are a cinephile.");
        } else if (ratingAverage == 8 || ratingAverage == 7){
            System.out.println(" You enjoy movies quite a bit.");
        } else if (ratingAverage == 6 || ratingAverage == 5){
            System.out.println(" You have mixed feelings about movies.");
        }else{
            System.out.println(" You are a tough critic");
        }

        for(int i = 0; i < MAX; i++){
            if (movieRatings[i] >= 7 ){
                count++;
            }
        }
        if (count == MAX){
            System.out.println("You seem to enjoy most movies!");
        }
        
        input.close();
    }
}