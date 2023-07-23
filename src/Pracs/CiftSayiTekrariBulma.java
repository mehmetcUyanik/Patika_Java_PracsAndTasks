package Pracs;

import java.util.ArrayList;
import java.util.List;

public class CiftSayiTekrariBulma {

    static boolean isFind(List<Integer> list,int value){
        for (int i : list){
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] numList = {4,7,4,4,2,10,10,21,2,33,10,2,7,7};
        List<Integer> duplicateList = new ArrayList<>();

        for (int i=0; i<numList.length;i++){
            for (int j=0;j<numList.length;j++){
                if ((i !=j) && (numList[i] == numList[j])){
                    if (!isFind(duplicateList,numList[i])){
                        if (numList[i]%2 == 0){
                            duplicateList.add(numList[i]);
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(duplicateList);

    }
}
