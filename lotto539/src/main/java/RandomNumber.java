import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumber {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();//收集所有號碼的List

        for (int i = 1; i <=39; i++) {
            numbers.add(i); //把39個號碼丟進去
        }

        Collections.shuffle(numbers); //打亂List集合

        for (int i = 1; i <= 5; i++) {
            System.out.println("第"+ (i) +"個號碼:" + numbers.get(i-1));//顯示前五個List裡面的數字
        }
    }
}
