
public class Main
{
    public static void main(String[] args) {

        Trie ptree = new Trie();
        Fruits fruits = new Fruits();
        Dictionary dictionary = new Dictionary();

        String[] fs = fruits.getFruits();
        String[] words = dictionary.getWords();

        for(int i=0; i < words.length; i++){
                ptree.insert(words[i]);
        }

        ptree.prefix(args[0]);



    }
}
