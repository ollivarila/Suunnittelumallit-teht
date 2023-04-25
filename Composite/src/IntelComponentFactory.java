public class IntelComponentFactory implements ComponentFactory{
    private double casePrice = 200;
    private double graphicsCardPrice = 400;
    private double motherboardPrice = 180;
    private double processorPrice = 349;
    private double ramPrice = 200;
    private double networkInterfaceCardPrice = 129;
    @Override
    public ComputerCase createCase() {
        return new ComputerCase(casePrice);
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new GraphicsCard(graphicsCardPrice);
    }

    @Override
    public Motherboard createMotherboard() {
        return new Motherboard(motherboardPrice);
    }

    @Override
    public Processor createProcessor() {
        return new Processor(processorPrice);
    }

    @Override
    public Ram createRam() {
        return new Ram(ramPrice);
    }

    @Override
    public NetworkInterfaceCard createNetworkInterfaceCard() {
        return new NetworkInterfaceCard(networkInterfaceCardPrice);
    }
}
