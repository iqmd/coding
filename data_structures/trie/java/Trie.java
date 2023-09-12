import java.util.ArrayList;
import java.util.Stack;

public class Trie {
    Node root = new Node();
    Stack<Character> word = new Stack<>();

    public void insert(Node root,String word, int length){
        if(length == word.length()){
            root.flag = true;
            return;
        }

        if(root.children[word.charAt(length)] == null ){
            root.children[word.charAt(length)] = new Node();
        }
        insert(root.children[word.charAt(length)],word, length+1);
    }

    public void insert(String word){
       insert(this.root,word,0) ;
    }




    public Node match(Node root,String prefix, int i){
        if(i == prefix.length()){
            return root;
        }
        word.push(prefix.charAt(i));
        return match(root.children[prefix.charAt(i)],prefix,i+1);


    }


    public void display(Node root,ArrayList<String> completions,String prefix){
        if(root != null){
            if (root.flag == true) {
                StringBuilder sb = new StringBuilder();
                for (char ch : word) {
                    sb.append(ch);
                }
                String str = sb.toString();
                completions.add(str);
             }
        }
        for(int i=0; i < 256; i++){
            if(root.children[i] != null){
                word.push((char)i);
                display(root.children[i],completions,prefix);
                word.pop();
            }
        }
    }



    public void prefix(String prefix){
        ArrayList<String> completions = new ArrayList<>();
        Node start = match(root,prefix,0);
        if(start != null){
            display(start,completions,prefix);
            System.out.println(completions);
        }else{
            System.out.println("No autocomplete found !");
        }

    }


}
