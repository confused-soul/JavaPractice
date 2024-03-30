package Programs;

class longestsub{
    public static void main(String[] args) {
        System.out.println(longestkSubstr("nixnqsdsdlupn", 4));
    }

    public static int longestkSubstr(String s, int k) {
        // code here
        int st = 0;
        int end = 1;
        int max = -1;
        while(end < s.length()){
            int c = 0;
            int[] let = new int[26];
            for(int i = st; i <= end; i++){
                let[s.charAt(i) - 97]++;
            }
            for(int i = 0; i < 26; i++){
                if(let[i] > 0)
                    c++;
            }
            if(c > k){
                st++;
            }
            else if(c == k){
                max = Math.max(end - st + 1, max);
                end++;
            }
            else{
                end++;
            }
        }
        return max;
    }
}