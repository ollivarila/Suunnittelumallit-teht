
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionFactoryCreator creator = new ReflectionFactoryCreator(args);

        VaateFactory factory = creator.createFactory();
        Jasper jasper = new Jasper(factory);

        jasper.lueMerkit();
    }
}