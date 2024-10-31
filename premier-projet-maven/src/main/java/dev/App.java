package dev;

import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            String titre = ResourceBundle.getBundle("application").getString("titre");
            String asciiArt = FigletFont.convertOneLine(titre);
            System.out.println(asciiArt);

            // affichage de l'environnement
            String environnement = ResourceBundle.getBundle("application").getString(
                    "environnement");
            System.out.println("Environnement : " + environnement);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}