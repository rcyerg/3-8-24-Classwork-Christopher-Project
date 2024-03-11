package demo;

public class ChristopherExtraChallenge {
    public static void main(String[] args) {
        //Make christopher all capital letters
        //Extract the word stop from the string christopher
        //3 extract top but reverse it to print pot

        String longString = "Christopher";
        System.out.println(longString.toUpperCase());
        String subStr = longString.substring(4, 8);
        System.out.println(subStr);
        subStr = longString.substring(5, 8);
        StringBuilder reversedSubStr = new StringBuilder(subStr).reverse();
        System.out.println(reversedSubStr.toString());

    }
}
