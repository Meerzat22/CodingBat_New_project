package string_1;

public class First_String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    public String atFirst(String str) {
        if(str.length() >= 2){
            return str.substring(0,2);
        }else if(str.length() == 1){
            return str + '@';
        }else{
            return "@@";
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    public String nonStart(String a, String b) {
        return a.substring(1).trim() + b.substring(1).trim();
    }

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }else {
            return str.substring(str.length()-1);
        }
    }

    public String middleThree(String str) {
        int mid = str.length()/2;
        return str.substring(mid - 1,mid + 2);
    }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")){
            return "blue";
        }else {
            return "";
        }
    }

    public String extraFront(String str) {
        String front = "";
        if (str.length() >= 2){
            front = str.substring(0,2);
        }else {
            front = str;
        }
        return front + front + front;
    }

    public String makeAbba(String a, String b){
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return '<' +  tag + '>' + word + "</" + tag + '>';
    }

    public String firstTwo(String str) {
        if (str.length() < 2){
            return str;
        }else {
            return str.substring(0,2);
        }
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()){
            return a + b + a;
        }else {
            return b + a + b;
        }
    }

    public String middleTwo(String str) {
        int mid = str.length()/2;
        return str.substring(mid - 1, mid + 1);
    }

    public String twoChar(String str, int index) {
        if(index < 0 || index + 1 >= str.length()){
            index = 0;
        }
        return str.substring(index, index +2);
    }

    public String lastChars(String a, String b) {
        char first = a.length() == 0 ? '@' : a.charAt(0);
        char last  = b.length() == 0 ? '@' : b.charAt(b.length() - 1);
        return "" + first + last;
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
