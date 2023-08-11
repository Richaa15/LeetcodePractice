class Solution {
    public boolean isValid(String s) {
        //check for odd length string, to  satisfy the conditions, the string must always be even length
        if(s.length()%2!=0) return false;

        //Instead of creating a stack create a fixed length charater array of n/2 length where n is the length of the string.. as we only need the array to store the openings of the parenthesis i.e '{', '(', '['. 
        char[] s1 = new char[s.length()/2];

        //create a pointer to point a the currently filled position in array, which is currently none therefore -1;
        int sp=-1;

        //start a for-loop to itearte the values of the string
        for(int i=0; i<s.length();i++){
            
            // save the current char of the string as 'v'
            char v= s.charAt(i);

            //check if 'v' is one of the opening paranthesis
            if(v=='('||v=='{'||v=='['){
                //increment the array pointer to point at the position to be filled
                sp++;

                // if it exceeds the available positions of the array then return false
                if(sp>s1.length-1) return false;

                // else set the array value at pointer positions as the parenthesis value
                s1[sp]=v;

            //if 'v' is not amoung the opening parenthsis; check if the array pointer points at real position, if not, then there is no opening paranthesis in the array to make the 'v' against hence return false;
            }else if(sp<0){ 
                return false;

            //if sp points to real position, then comapre it against the opening parenthesis in question, if there's a mismatch then reject it.
            }else if( v==')' && s1[sp]!='(' || v=='}' && s1[sp]!='{' || v==']' && s1[sp]!='[' ){
                return false;
            //if the closing parenthesis in 'v' and opening paranthesis in array position 'sp' match then, decrement the sp value to indicate the fullfilled match. 
            }else{
                sp--;
            }
        }
        //finally if the array pointer, points to real position in array, return false as the matching is incomplete. 
        if(sp==-1){
            return true;
        }else{return false;}
            
    }
}