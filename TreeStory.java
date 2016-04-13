import java.io.Console;

class TreeStory {

  private static Console console = System.console();

  public static void main(String[] argv) {

    /*
     *    __Name__ is an __adjective__ __noun__.
     *
     *    They are always __adverb__ __verb__.
     */

    String ageString = console.readLine("How old are you?  ");
    int age = Integer.parseInt(ageString);

    if (age < 13) {
      console.printf("Sorry you must be at least 13 to use this program.\n");
      System.exit(0);
    }

    String name = console.readLine("Enter your name:  ");
    String adj  = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");

    if (noun.equalsIgnoreCase("dork") ||
        noun.equalsIgnoreCase("jerk") ||
        noun.equalsIgnoreCase("nerd")) {
      console.printf("That language is not allowed. Exiting...\n\n");
      System.exit(0);
    }

    String adv  = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending in -ing:  ");

    console.printf("Your TreeStory:\n---------------\n");
    console.printf("%s is a %s %s. ", name, adj, noun);
    console.printf("He is always %s %s.\n", adv, verb);

  }

}
