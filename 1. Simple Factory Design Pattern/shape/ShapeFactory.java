package shape;

public class ShapeFactory {
    public static IShape getShape(ShapeType shapeType) {
        IShape shapeInstance = null;
        switch(shapeType) {
            case ShapeType.CIRCLE:
                shapeInstance = new Circle();
                break; 
            case ShapeType.SQUARE:
                shapeInstance = new Square(); 
                break;
            case ShapeType.RECTANGLE:
                shapeInstance = new Rectangle(); 
                break;
            default : 
                shapeInstance = null;
                break;
        }


        return shapeInstance;
    }
} 