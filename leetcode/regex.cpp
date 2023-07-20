class Solution {
public:
    bool isMatch(string s, string p) {

        if(p == ".*"){
            return true;
        }
        // s.push_back('$');
        // p.push_back('$');

        // for(auto c:s){
        //     cout<<c;
        // }

        bool ans = true;
        bool asterix = false;
        int i = 0;
        int j = 0;
        int matched=0;
        while(j < p.size()){
            if(p[j] != '.' && p[j] != '*'){
                if(p[j] != s[i]){
                    ans = false;
                    i++;
                    j++;
                    matched++;
                }else{
                    i++;
                    j++;
                    matched++;
                }


            }

            if(p[j] == '.'){
                i++;
                j++;
                matched++;
            }

            if(p[j] == '*'){
                if(p[j-1] != '.'){
                    if(ans==false){
                        ans = true;
                        matched++;
                    }
                    while(s[i] == p[j-1]){
                        i++;
                        matched++;
                    }
                    j++;
                    continue;
                }else{
                    if(p.size()-1-j == 0){
                        ans=true;
                        matched = s.size();
                        break;
                    }else{
                        // while(i < p.){
                        //     i++;
                        //     matched++;
                        // }
                        break;
                    }

                }
            }



        }

        if(s.size() != matched)
            cout << "here";
            ans = false;

        return ans;
    }





};


while(j < p.size()){

}
