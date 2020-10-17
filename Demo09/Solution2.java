package Demo09;

//虽说方法很简单，但是不是很能看懂，这个string类我还不是很熟悉
public class Solution2 {

    public boolean judgeNmu(int x) {
        String reversedStr = (new StringBuilder(x + " ")).reverse().toString();
        return (x + " ").equals(reversedStr);
    }
}
