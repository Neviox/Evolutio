package Evolutio;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;


        public class TreciZad {
            public void zadatak() {
                {

                    int[] ar = {2, 5, 4, 15, 22, 52};
                    int B = 116;

                    ArrayList<Integer> arlst = new ArrayList<Integer>();
                    for (int i : ar) {
                        arlst.add(i);
                    }
                    for (int i = 0; i <= arlst.size(); ++i) {
                        arlst.removeIf((n -> (n > B)));
                    }
                    Collections.sort(arlst, Collections.reverseOrder());

                    int suma = 0;
                    int max = Collections.max(arlst);
                    int cnt=0;
                    ArrayList<Integer> rjesenje = new ArrayList<Integer>();

                    while (suma < B && cnt!= arlst.size()) {
                        for (int i : arlst) {
                            if ((max + suma) <= B) {
                                rjesenje.add(i);
                                suma+=max;
                                continue;
                            }if((i+suma)<=B) {
                                rjesenje.add(i);
                                suma+=i;
                                max=i;
                                continue;
                            }
                            cnt++;
                        }
                    }
                    if (suma==B) {
                        System.out.println(rjesenje.size());
                    }
                    else {
                        System.out.println("-1");

                    }
                }
            }
        }