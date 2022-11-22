import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Love Stained");
    desertIslandPlaylist.add("Colorado");
    desertIslandPlaylist.add("Truth Hurts");
    desertIslandPlaylist.add("Cranes in the sky");
    desertIslandPlaylist.add("Slow down");
    desertIslandPlaylist.add("Away Park");
    desertIslandPlaylist.add("That girl");

    // print curated selection 
    System.out.println(desertIslandPlaylist);
    // check playlist length
    System.out.println(desertIslandPlaylist.size());
    // remove songs until 5 are left
    desertIslandPlaylist.remove("That girl");
    desertIslandPlaylist.remove("Colorado");


    //Get the indices of the songs you want to swap.
    int indexA = desertIslandPlaylist.indexOf("Love Stained");
    int indexB = desertIslandPlaylist.indexOf("Slow down");
    // Create a temporary variable to store the value of song a. (We’ll 
call the songs a and b here.)
    String tempA = "Love Stained";
    // Rewrite the value at the index of a to the value of b.
    desertIslandPlaylist.set(indexA, "Slow down");
     desertIslandPlaylist.set(indexB, "Love Stained");
    // Rewrite the value at the index of b to the value of the temporary 
variable.

      // print new playlist
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
  }
 
}
