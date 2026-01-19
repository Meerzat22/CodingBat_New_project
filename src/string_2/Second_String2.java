package string_2;

import java.util.List;
import java.util.stream.Collectors;

public class Second_String2 {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(digit -> digit * 2).collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x",""))
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true){
            return true;
        }else {
            return false;
        }
    }

    public int diff21(int n) {
        if(n > 21){
            return  (n - 21) * 2;
        }else {
            return  21 - n;
        }
    }

    public boolean mixStart(String str) {
        if(str.startsWith("mix")){
            return true;
        } else if (str.contains("ix")) {
            return true;
        }else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == true && bSmile == true){
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        }else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        if(a == b){
            return (a + b) * 2;
        }else {
            return a + b;
        }
    }

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        } else if (a + b == 10) {
            return true;
        }else {
            return false;
        }
    }
}
