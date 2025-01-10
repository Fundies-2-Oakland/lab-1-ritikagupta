public class Main {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1, 2, 3);
        System.out.println(vector.format());
        System.out.println(vector.getMag());
        System.out.println(vector.normalize().format());
    }
}

class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String format() {
        return String.format("(%f, %f, %f)", x, y, z);
    }

    public double getMag(){
        return Math.sqrt((x*x+y*y+z*z));
    }

    public Vector3D normalize() {
        double mag = getMag();
        if (mag == 0) {
            throw new IllegalStateException("Cannot normalize a vector with zero magnitude");
        }
        return new Vector3D(x / mag, y / mag, z / mag);
    }

}