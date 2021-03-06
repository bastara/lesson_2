package Test;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6);
    private final double mass;
    private final double radius;
    private final static double G = 6.673E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getGravity() {
        return G * mass / (radius * radius);
    }
}
