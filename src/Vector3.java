public class Vector3 {
    public float x;
    public float y;
    public float z;
    public float magnitude;
    public Vector3 normalized;

    public static Vector3 zero = new Vector3(0, 0, 0);
    public static Vector3 one = new Vector3(1, 1, 1);

    public static Vector3 right = new Vector3(1, 0, 0);
    public static Vector3 up = new Vector3(0, 1, 0);
    public static Vector3 forward = new Vector3(1, 0, 0);

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        magnitude = this.magnitude();
    }

    public static Vector3 add(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3 subtract(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector3 multiply(Vector3 v, float f) {
        return new Vector3(v.x * f, v.y * f, v.z * f);
    }

    public static float distance(Vector3 v1, Vector3 v2) {
        return Vector3.subtract(v1, v2).magnitude();
    }

    public static float angle(Vector3 v1, Vector3 v2) {
        return 0;
    }

    public static float dot(Vector3 v1, Vector3 v2) {
        return v1.x * v2.x + v1.y + v2.y + v1.z * v2.z;
    }

    // Non-static methods

    public float magnitude() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3 normalize() {
        return Vector3.multiply(this, 1 / this.magnitude);
    }
}
