package Design_Patterns.StructuralDesignPattern.CompositeDesignPattern.Solution1WithCompositeDesign;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movie");

        File border = new File("Border");
        directory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");

        comedyMovieDirectory.add(hulchul);

        directory.add(comedyMovieDirectory);
        directory.ls();
    }
}
