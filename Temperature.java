public class Temperature {
    public static void main(String[] args) {
        System.out.println(toCelcius(45));
    }

    public static float toCelcius(float far) {
        return (far - 32) * 5 / 9;
    }
}
