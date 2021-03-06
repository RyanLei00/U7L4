import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayListAlgorithms
{

    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int belowAverage(ArrayList<Integer> intList)
    {
        double average = 0;
        int numLessThanAvg = 0;
        for(int i = 0; i < intList.size(); i++){
            average += intList.get(i);
        }
        average = average / intList.size();
        for(int j = 0; j < intList.size(); j++){
            if(intList.get(j) < average){
                numLessThanAvg++;
            }
        }
        return numLessThanAvg;
    }

    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++)
        {
            if(wordList.get(i).substring(wordList.get(i).length()-1).equals("s")){
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int position = 0;
        int minimum = intList.get(0);
        for(int i = 1; i < intList.size(); i++){
            if(intList.get(i) < minimum){
                minimum = intList.get(i);
                position = i;
            }
        }
        return position;
    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        int numOfTimes = 0;
        for(int i = 0; i < numList1.size(); i++){
            if(numList1.get(i) == numList2.get(i)){
                numOfTimes++;
            }
        }
        if(numList1.size() == numOfTimes){
            return true;
        }
        return false;
    }

    public static void removeOdds(ArrayList<Integer> numList)
    {
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) % 2 == 1){
                numList.remove(i);
                i--;
            }
        }
    }

    public static void wackyVowels(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).indexOf("a") != -1 || wordList.get(i).indexOf("e") != -1 || wordList.get(i).indexOf("i") != -1 || wordList.get(i).indexOf("o") != -1) {
                wordList.remove(i);
                i--;
            }
            else {
                wordList.add(i, wordList.get(i));
                i++;
            }
        }
    }

    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for(int i = 0; i < intList.size(); i++){
            for(int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i) == intList.get(j)){
                    intList.remove(j);
                    j--;
                }
            }
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++){
            wordList.add(i + 1, wordList.get(i).toUpperCase());
            i++;
        }
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        int origSize = wordList.size();
        for(int i = 0; i < origSize; i++){
            wordList.add(wordList.get(i).toUpperCase());
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence)
    {
        String[] strArr = sentence.split(" ");
        ArrayList<String> reversed = new ArrayList<>();

        for(int i = strArr.length - 1; i >= 0; i--)
        {
            reversed.add(strArr[i]);
        }
        return reversed;
    }

    public static void moveBWords(ArrayList<String> wordList)
    {
        int x = 0;
        for(int i = 0; i < wordList.size(); i++)
        {
            if(wordList.get(i).indexOf("b") == 0)
            {
                wordList.add(x, wordList.get(i));
                i++;
                x++;
                wordList.remove(i);
                i--;
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList)
    {
        Arrays.sort(numList);
        int mode = 1;
        int prevHigh = 0;
        ArrayList<Integer> modeList = new ArrayList<>();
        for(int i = 0; i < numList.length - 1; i++)
        {
            if(numList[i] == numList[i + 1]){
                mode++;
            }
            else{
                if(mode > prevHigh){
                    prevHigh = mode;
                    modeList.clear();
                    modeList.add(numList[i]);
                }
                else if(mode == prevHigh){
                    modeList.add(numList[i]);
                }
                mode = 1;
            }
            if(prevHigh == 1){
                modeList.clear();
            }
        }
        return modeList;
    }
}
