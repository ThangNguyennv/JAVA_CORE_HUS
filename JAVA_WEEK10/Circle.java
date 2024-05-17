/**
 * The Circle class models a circle with a radius.
 */
public class Circle {  // Save as "Circle.java"
   private double radius;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius*/
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
   }
   
   /** Constructs a Circle instance with the given radius */
   public Circle(double radius) {  // 2nd constructor
      this.radius = radius;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return this.radius;
   }
   
   /** Set new radius */
   public void setRadius(double radius) {
       this.radius = radius;
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return Math.PI*(this.radius*this.radius);
   }
   
   /** Returns the circumference of this Circle instance */
   public double getCircumference() {
      return 2*(Math.PI*this.radius);
   }
   
   /** Return a self-descriptive string of this instance in the form of Circle[radius=?] */
   public String toString() {
       return "Circle[radius=" + this.radius +"]";
   }
}