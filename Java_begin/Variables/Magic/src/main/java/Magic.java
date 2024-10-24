public class Magic {
    public static void main(String[] args) {
        int myNumber = 0;
        //myNumber is an original number
        int stepOne = myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);

    }
}
