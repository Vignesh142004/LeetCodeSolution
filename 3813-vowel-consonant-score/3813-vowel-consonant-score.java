class Solution {
    public int vowelConsonantScore(String s) {

        int len=s.length();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
            else if(ch>='a' && ch<='z')
            {
                consonant++;
            }
        }
        int score=0;
        if(consonant>0)
        {
            score=vowel/consonant;
        }
        return score;
        
    }
}