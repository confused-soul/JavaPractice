class test {
    public static void main(String[] args) {
        System.out.println(new test().winnerOfGame("AAAABAB"));
    }
    public boolean winnerOfGame(String colors) {
        while(colors.length() > 2){
            if(turnA(colors) != -1)
                colors = removei(colors, turnA(colors));
            else
                return false;
            if(turnB(colors) != -1)
                colors = removei(colors, turnB(colors));
            else
                return true;
        }
        return false;
    }

    public int turnA(String colors){
        for(int i = 1; i < colors.length() - 1; i++){
            if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i) == 'A'){
                return i;
            }
        }
        return -1;
    }
    public int turnB(String colors){
        for(int i = 1; i < colors.length() - 1; i++){
            if(colors.charAt(i) == colors.charAt(i-1) && colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i) == 'B'){
                return i;
            }
        }
        return -1;
    }
    public String removei(String colors, int i){
        return colors.substring(0, i) + colors.substring(i+1);
    }
}