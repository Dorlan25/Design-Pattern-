public class Main {

    public static void main(String[] args) {


        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubtactNumbers();
        Chain chainCal4 = new MultNumbers();
        Chain chainCal3 = new DivideNumbers();



        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);
        chainCal4.setNextChain(chainCal1);


        Numbers request = new Numbers(4, 4, "add");

        chainCal1.calculate(request);

    }
}
