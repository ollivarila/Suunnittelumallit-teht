import java.lang.reflect.*;
public class ReflectionFactoryCreator {

    private final String className = "CustomVaateFactory";
    private String[] args;

    public ReflectionFactoryCreator(String[] args){
        this.args = args;
    }

    public VaateFactory createFactory() throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);

        try {
            CustomVaateFactory factory = (CustomVaateFactory) clazz.getConstructor().newInstance();
            Field merkkiField = factory.getClass().getDeclaredField("merkki");
            merkkiField.setAccessible(true);
            merkkiField.set(factory, args[0]);
            return factory;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }

}
