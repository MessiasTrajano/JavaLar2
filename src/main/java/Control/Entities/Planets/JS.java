package Control.Entities.Planets;

import View.Create.NewImage;
import Control.Entities.Components.Coordinates;
import Control.Entities.Components.Location;
import Control.Entities.Components.Planets;


public class JS extends Planets {

    public JS() {
        this.name = "JS";
        dislocation = 3;
        rotation = 10;
        this.history = "JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm.\nIt has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions.";
        this.imageIcon = NewImage.newImageIcon("src/main/java/View/Uploads/JS.png");

        Coordinates coord = new Coordinates(10, 12);
        Coordinates minCoord = new Coordinates(6, 10);
        Coordinates maxCoord = new Coordinates(10, 14);

        this.location = new Location(coord, minCoord, maxCoord);
    }

}
