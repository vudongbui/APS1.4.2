import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        Scanner scanner = new Scanner(System.in);

        int kase;
        kase = scanner.nextInt();

        for (int a = 0; a < kase; a++) {
            int number;
            int num;
            int request;
            int min,max;
            int fn=0;
            num = scanner.nextInt();
            request = scanner.nextInt();
            int[]nb = new int[num];
            for(int b=0;b<num;b++){
                nb[b]=scanner.nextInt();
            }
            min = scanner.nextInt();
            max = scanner.nextInt();
            for(int b0 = 0;b0<10;b0++){
                for(int b1 = 0;b1<10;b1++){
                    for(int b2 = 0;b2<10;b2++){
                        for(int b3 = 0;b3<10;b3++){
                            for(int b4 = 0;b4<10;b4++){
                                int []x = new int[5];
                                int count = 0;
                                x[0] = b0;
                                x[1] = b1;
                                x[2] = b2;
                                x[3] = b3;
                                x[4] = b4;
                                for(int c = 0; c<5;c++){
                                    for(int d = 0; d<num;d++){
                                        if(x[c]==nb[d]){
                                            count++;
                                        }
                                    }
                                }
                                if(count>=request){
                                    number = b4+10*b3+100*b2+1000*b1+10000*b0;
                                    if(number>=min&&number<=max){
                                        fn++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("#"+(a+1)+" "+fn);
        }
    }
}
