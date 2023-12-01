package Control.Entities.Planets;


import View.Create.NewImage;
import Control.Entities.Components.Coordinates;
import Control.Entities.Components.Location;
import Control.Entities.Components.Planets;

public class Php extends Planets {
    
    public Php() {
        this.name = "Php";
        dislocation = 2;
        rotation = 60;
        this.history = "PHP is a general-purpose scripting language especially suited to web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994.\nThe PHP reference implementation is now produced by The PHP Group. PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor.";
        this.imageIcon = NewImage.newImageIcon("src/main/java/View/Uploads/php.png");

        Coordinates coord = new Coordinates(12, 12);
        Coordinates minCoord = new Coordinates(4, 8);
        Coordinates maxCoord = new Coordinates(12, 16);

        this.location = new Location(coord, minCoord, maxCoord);
    }

    
}
