public interface ComponentFactory {
    public ComputerCase createCase();
    public GraphicsCard createGraphicsCard();
    public Motherboard createMotherboard();
    public Processor createProcessor();
    public Ram createRam();
    public NetworkInterfaceCard createNetworkInterfaceCard();
}
