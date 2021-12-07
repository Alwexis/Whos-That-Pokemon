package WhosThatPokemon.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.imageio.ImageIO;
import rotomdex.data.Pokemon;

public class Util {
    public static Image getImage(String url, int type) throws IOException {
        BufferedImage imagenbuffer = ImageIO.read(new URL(url));
        if (type == 0) {
            for (int y = 0; y < imagenbuffer.getHeight(); y++) {
                for (int x = 0; x < imagenbuffer.getWidth(); x++) {
                    int pixel = imagenbuffer.getRGB(x, y);
                    if (pixel != 16777215) {
                        imagenbuffer.setRGB(x, y, -16777216);
                    }
                }
            }
        } else if (type == 1) {
            Image correcto = ImageIO.read(new URL("https://imgur.com/WTSX5vc.png"));
            imagenbuffer.createGraphics().drawImage(correcto, 387, 387, null);
        } else if (type == 2) {
            Image correcto = ImageIO.read(new URL("https://imgur.com/r7meUeq.png"));
            imagenbuffer.createGraphics().drawImage(correcto, 387, 387, null);
        }
        return imagenbuffer;
    }

    private String getLine(int line, String path) throws IOException {
        return Files.readAllLines(Paths.get(path)).get(line);
    }

    private int getPokemonLine(String id) throws FileNotFoundException, IOException {
        File yml = new File("src/rotomdex/data/pokemon.yml");
        Scanner reader = new Scanner(yml);
        String compareTo = "- id: '" + id + "'";
        int actual = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(compareTo)) {
                reader.close();
                break;
            }
            if (line.contains("- id: '")) {
                String newLine = line.replace("- id: ", "").replace("'", "");
                if (Integer.valueOf(newLine) > Integer.valueOf(id)) {
                    actual = 0;
                    reader.close();
                    break;
                }
            }
            actual++;
        }
        return actual;
    }

    public Pokemon getPokemon(String id) throws IOException {
        int line = getPokemonLine(id);
        String path = "src/rotomdex/data/pokemon.yml";
        int pkmnId = Integer.valueOf(getLine(line, path).replace("- id: ", "").replace("'", ""));
        String pkmnNombre = getLine(line + 1, path).replace("  identifier: ", "");
        int pkmnSpcId = Integer.valueOf(getLine(line + 2, path).replace("  species_id: ", "").replace("'", ""));
        double pkmnTamanio = Double.valueOf(getLine(line + 3, path).replace("  height: ", "").replace("'", ""));
        double pkmnPeso = Double.valueOf(getLine(line + 4, path).replace("  weight: ", "").replace("'", ""));
        int pkmnBaseXp = Integer.valueOf(getLine(line + 5, path).replace("  base_experience: ", "").replace("'", ""));
        return new Pokemon(pkmnId, pkmnNombre, pkmnSpcId, pkmnTamanio, pkmnPeso, pkmnBaseXp);
    }
}
