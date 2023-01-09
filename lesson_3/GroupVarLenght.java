public class GroupVarLenght {
    static int sub(int... terms) {
        int sub = 0;
        for (int term : terms) {
            sub -= term;
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(sub(10, 20));
    }
}
