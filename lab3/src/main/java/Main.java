
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext instance = ApplicationContext.getInstance();
        instance.getComponentsObjects();
        Component2 component = (Component2) ApplicationContext.getInstance().getComponents().get(Class.forName("Component2"));
        System.out.println(component.toString());
    }
}