public class Vector2 {
    public float x;
    public float y;
    public float magnitude;
    public Vector2 normalized;

    public static Vector2 zero = new Vector2(0, 0);
    public static Vector2 one = new Vector2(1, 1);

    public static Vector2 right = new Vector2(1, 0);
    public static Vector2 up = new Vector2(0, 1);

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
        magnitude = this.magnitude();
    }

    public static Vector2 add(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector2 subtract(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2 multiply(Vector2 v, float f) {
        return new Vector2(v.x * f, v.y * f);
    }

    public static float distance(Vector2 v1, Vector2 v2) {
        return Vector2.subtract(v1, v2).magnitude();
    }

    public static float angle(Vector2 v1, Vector2 v2) {
        return 0;
    }

    public static float dot(Vector2 v1, Vector2 v2) {
        return v1.x * v2.x + v1.y + v2.y;
    }

    // Non-static methods

    public float magnitude() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector2 normalize() {
        return Vector2.multiply(this, 1 / this.magnitude);
    }
}
