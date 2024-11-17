package String;
public class CountV_C_S{
    public static void count(String str){
        int cnt1=0, cnt2 = 0, cnt3 = 0;
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) == ' '){
                cnt1++;
            }
            else if(str.charAt(i) == 'a' || str.charAt(i) == 'e'  || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                cnt2++;
            }
            else{
                cnt3++;
            }
        }
        System.out.println("The spaces are "+cnt1);
        System.out.println("The vowels are "+cnt2);
        System.out.println("The consonants are "+cnt3);
    }
    public static void main(String[] args) {
        String str = "Chanchal is a hardworking person";
        count(str);
    }
}