/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates the area of a trapezoid.
     *
     * @param base1  length of base of trapzoid
     * @param base2  length of base of trapezoid
     * @param height  height of trapezoid
     * @return   area of the triangle
     */
    public static double trapezoidArea(double base1, double base2, double height)
    {
        double area = 1.0 / 2.0 * (base1 + base2) * height;
        
        return area;
    }
    
    /**
     * Calculates the surface area of a rectangular prism.
     * 
     * @param width  width of rectangular prism
     * @param length  length of rectangular prism
     * @param height  height of rectangular prism
     */
    public static double prismSurface(double width, double length, double height) 
    {
        double surface = 2.0 * (width * length + height * length + height * width);
        
        return surface;
    }    
        
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        
        
    }
}
