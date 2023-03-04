public class Main {
    public static void main(String[] args) {
        ListConverter<Double> converter1 = new NewLineStrategy<>();
        ListConverter<Double> converter2 = new NewLineEveryotherStrategy<>();
        ListConverter<Double> converter3 = new NewLineEveryThirdStrategy<>();

        Context context = new Context();

        System.out.println(converter1);
        context.setConverter(converter1);
        context.useStrategy();

        System.out.println(converter2);
        context.setConverter(converter2);
        context.useStrategy();

        System.out.println(converter3);
        context.setConverter(converter3);
        context.useStrategy();
    }
}