package Control.Entities.Planets;


import View.Create.NewImage;
import Control.Entities.Components.Coordinates;
import Control.Entities.Components.Location;
import Control.Entities.Components.Planets;

public class Python extends Planets {
    
    public Python() {
        this.name = "Python";
        dislocation = 4;
        rotation = 24;
        this.history = "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace.\nIts language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.";
        this.imageIcon = NewImage.newImageIcon("src/main/java/View/Uploads/Python.png");
        
        Coordinates coord = new Coordinates(9, 12);
        Coordinates minCoord = new Coordinates(7, 11);
        Coordinates maxCoord = new Coordinates(9, 13);

        this.location = new Location(coord, minCoord, maxCoord);
    }

    
}
