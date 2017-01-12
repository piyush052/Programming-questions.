package week5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();

        int[] arr = new int[n + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) arr[i] =Math.min(1 + arr[i / 2], arr[i]);
            if (i % 3 == 0) arr[i] =Math.min(1 + arr[i / 3], arr[i]);

        }
        for (int i = n; i > 1; ) {
            sequence.add(i);
            if (arr[i - 1] == arr[i] - 1)
                i = i - 1;
            else if (i % 2 == 0 && (arr[i / 2] == arr[i] - 1))
                i = i / 2;
            else if (i % 3 == 0 && (arr[i / 3] == arr[i] - 1))
                i = i / 3;
        }
        sequence.add(1);
//        while (n >= 1) {
//            sequence.add(n);
//            if( n%10==0){
//            	n-=1;
//                sequence.add(n);
//            }
//            if (n % 3 == 0) {
//                n /= 3;
//            } else if (n % 2 == 0) {
//                n /= 2;
//            } else {
//                n -= 1;
//            }
//        }
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        List<Integer> sequence = optimal_sequence(n);
//        System.out.println(sequence.size() - 1);
//        for (Integer x : sequence) {
//            System.out.print(x + " ");
//        }
        
        System.out.println(primesum(n).toString());
    }
public  static ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> res=new ArrayList<Integer>();

if(a==4){
    res.add(2);
    res.add(2);
    return res;
}

LinkedList<Integer> arr=new LinkedList<Integer>();
arr.add(2);
for(int i=3;i<=a;i+=2){
    arr.add(i);
    System.out.println("add "+i);

}

for(int i=1;i<arr.size()-1;i++){
    for(int j=i+1;j<arr.size();j++){
        if(arr.get(j)%arr.get(i)==0){
                     System.out.println("remove  "+arr.get(j));

            arr.remove(j);
        
    }
}
System.out.print(""+arr.toString());
for(int i1=0;i1<arr.size();i1++){
    for(int j=arr.size()-1;j>i1;j--){
    if(arr.get(i1)+arr.get(j)==a){
            res.add(arr.get(i1));
            res.add(arr.get(j));      
            return res;

        }
    }
}


}
return res;

}
}
