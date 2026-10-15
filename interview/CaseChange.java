class CaseChange{
    public static void main(String[] args){
        String s = "JaVaScRiPt";
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>=65 && ch<=90){
                ch += 32;
            }
            else if(ch>=97 && ch<=122){
                    ch -= 32;
            }
                ans += ch;
            }
            System.err.println(s);
            System.err.println(ans);
        }
    }
