public class Main {
    public static void main(String[] args) {
        ComponentFactory factory = new IntelComponentFactory();

        ComputerCase computerCase = factory.createCase();
        Motherboard mb = factory.createMotherboard();
        Processor processor = factory.createProcessor();
        Ram ram = factory.createRam();
        NetworkInterfaceCard networkCard = factory.createNetworkInterfaceCard();
        GraphicsCard graphicsCard = factory.createGraphicsCard();

        mb.addComponent(processor);
        mb.addComponent(ram);
        mb.addComponent(networkCard);
        mb.addComponent(graphicsCard);
        computerCase.addComponent(mb);

        System.out.println("Computer total price: " + computerCase.getPrice() + " €");
    }
}