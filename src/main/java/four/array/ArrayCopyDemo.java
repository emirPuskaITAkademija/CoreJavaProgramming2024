package four.array;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 't', 'e'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);
    }
}
