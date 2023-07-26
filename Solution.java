/* Leet code Problem no - 14 - (EASY)
   
   Write a function to find the longest common prefix string amongst an array of strings.
   If there is no common prefix, return an empty string "".
   
    Sample output :- 
    
      Input: strs = ["flower","flow","flight"]
      Output: "fl"
   
   Programming lanuage used - java
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==1) return ""+strs[0];
        String ans="";
        int c=99999;
        String temp = strs[0]+"";

        for(int i=1;i<strs.length;i++)
        {
            int res=0;
            int len=(strs[i].length()<temp.length())?strs[i].length():temp.length();
            for(int j=0;j<len;j++)
            {
                char ch=strs[i].charAt(j);
                char ch2=temp.charAt(j);
                if(ch==ch2)  res++;
                else break;
            }
            if(res<c) c=res;
        }
     
        ans=""+temp.substring(0,c);
        if(c>0) return ans;
        else return "";
    }
}
