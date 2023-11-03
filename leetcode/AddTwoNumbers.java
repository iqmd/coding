import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> chars_a = new HashMap<>();
        HashMap<Character,Integer> chars_b = new HashMap<>();

        for(int i=0 ; i < ransomNote.length(); i++){
            if(chars_a.containsKey(ransomNote.charAt(i))){
                int count = chars_a.get(ransomNote.charAt(i));
                count++;
                chars_a.put(ransomNote.charAt(i),count);
            }else{
                chars_a.put(ransomNote.charAt(i),1);
            }
        }

        for(int i=0 ; i < magazine.length(); i++){
            if(chars_b.containsKey(magazine.charAt(i))){
                int count = chars_b.get(magazine.charAt(i));
                count++;
                chars_b.put(magazine.charAt(i),count);
            }else{
                chars_b.put(magazine.charAt(i),1);
            }
        }



    }
}
