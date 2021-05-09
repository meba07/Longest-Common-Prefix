package com.myprograms;

public class LCP {
    public String LongestCommonPrefixes(String[] strings){
        /*the argument strings is an array that take testcases 1,2,3 which gives a 2D array
        this method returns longest common prefix
         */
        int prefixlen;
        if(strings.length==0)
            return "";
        for (prefixlen=0;prefixlen<strings[0].length();prefixlen++)
        {
            char match=strings[0].charAt(prefixlen);
            for(int i=0;i<strings.length;i++)
            {
                if(prefixlen>=strings[i].length()||strings[i].charAt(prefixlen)!=match)
                    return strings[0].substring(0,prefixlen);
            }
        }
     return strings[0];
    }
    public static void main(String[] args)
    {
        LCP ob=new LCP();

        String[] testcase1={"flower","flow","flowervase"};
        System.out.println("longest common prefix for testcase1-" +ob.LongestCommonPrefixes(testcase1));
        String[] testcase2={"dog","cat","bird"};
        System.out.println("longest common prefix for testcase2-" +ob.LongestCommonPrefixes(testcase2));
        String[] testcase3={"","class","classes"};
        System.out.println("longest common prefix for testcase3-" +ob.LongestCommonPrefixes(testcase3));

    }
}
