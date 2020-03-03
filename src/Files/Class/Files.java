package Files.Class;

import java.io.File; // checked of een bestand bestaat op je pc

public class Files {
    public static void main(String[] args) {

        File x = new File("C:\\test\\justin.txt"); // bij paths moet je 2 keer \\ ipv 1 keer \

        if(x.exists())
            System.out.println(x.getName() + " exists!");
        else
            System.out.println(x.getName() + " does not exist");

    }
}
