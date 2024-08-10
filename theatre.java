public class theatre {
    String movie_name;
    int movie_time;

    public void watch_movie()
    {
    System.out.println("Watching " + movie_name);
    System.out.println("Show Time is " + movie_time);
    }

    public static void main(String[] args) {
        theatre movie1=new theatre();
        theatre movie2=new theatre();
        
        movie1.movie_name="Jailer";
        movie1.movie_time=630;
        movie2.movie_name="Leo";
        movie2.movie_time=7;

        movie1.watch_movie();
        movie2.watch_movie();

    }
    
}
