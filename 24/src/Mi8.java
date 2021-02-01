public class Mi8 extends Helicopter implements VerticalTakeoff{
    @Override
    public void fly() {
        System.out.println("Mi8");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("Mi8 vertical");
    }
}
