/*
Md Yasir Khan
BTech
Jamia Millia Islamia, New Delhi
*/

package Programs;

//todo : 
//info display
//automatic draw guesser

import java.util.Scanner;

class TicTacToe{
    static char board[] = {'_','_','_','_','_','_','_','_','_'};    //board
    
    static int game = 0;    //to decide type of game

    static char player1 = 'X';  //player 1's default character
    static char player2 = 'Y';  //player 2's default character
    static char computer = 'C'; //computer's default character

    static String name1 = "";   //1st player name
    static String name2 = "";   //2nd player name

    static Scanner sc = new Scanner(System.in); //scanner object for input

    public static void print(String out, int speed){    //print in 1 line with delay
        for(int i = 0; i < out.length(); i++){
            try{
                Thread.sleep(speed);
                System.out.print(out.charAt(i));
            }catch(Exception e){}
        }
    }

    public static void println(String out, int speed){  //print with line change with delay
        for(int i = 0; i < out.length(); i++){
            try{
                Thread.sleep(speed);
                System.out.print(out.charAt(i));
            }catch(Exception e){}
        }
        System.out.println();
    }

    public static void board(){     //to print the board
        print("\f",100);
        for(int i = 0; i < 9; i++){
            print(board[i]+"\t", 100);
            if(((i+1) % 3 )== 0){
                System.out.print("\n");
            }
        }
    }

    public static char getInitials(String s){   //to get initials from name

        s = s.toUpperCase();    
        int count  = 0;
        char in = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                count++;
        }
        if(count == 0 || count == 1)
            return in;
        else
            return s.charAt(s.indexOf(' ')+1);
    }

    public static void start(){ //starting inputs
        do{
            println("Want to play 1 player or 2 player game??", 50);
            game = sc.nextInt();
            sc.nextLine();
            if(game == 1){
                print("Player's name : ", 100);
                name1 = sc.nextLine();
                player1 = getInitials(name1);
                println("Your character is : "+player1, 100);
            }
            else if(game ==2){
                print("Player 1's name : ", 100);
                name1 = sc.nextLine();
                player1 = getInitials(name1);
                print("Player 2's name : ", 100);
                name2 = sc.nextLine();
                player2 = getInitials(name2);
                println("1st Player's character is : "+player1, 100);
                println("2nd Player's character is : "+player2, 100);
            }
            else if(game == 0){
                System.exit(0);
            }
            else{
                println("Wrong input!", 50);
            }
        }while(game != 1 && game != 2);
    }

    public static int toss(){   //to toss for 1st chance
        return (int)(Math.random()*10)%2;
    }

    public static void p1chance(){  //player 1's turn
        int pos;
        int t = 0;
        do{
            pos  = sc.nextInt();
            if(pos > 0 && pos <= 9){
                if(board[pos-1] == '_'){
                    board[pos-1] = player1;
                    t = 1;
                }
                else{
                    println("Enter again : ",50);
                    t = 0;
                }
            }
            else{
                println("Enter again : ",50);
                t = 0;
            }
        }while(t == 0);
    } 

    public static void p2chance(){  //player 2's turn
        int pos;
        int t = 0;
        do{
            pos  = sc.nextInt();
            if(pos > 0 && pos <= 9){
                if(board[pos-1] == '_'){
                    board[pos-1] = player2;
                    t = 1;
                }
                else{
                    println("Enter again : ",50);
                    t = 0;
                }
            }
            else{
                println("Enter again : ",50);
                t = 0;
            }
        }while(t == 0);
    } 

    public static void computer(){
        int todo = 0;
        int pos = 0;
        for(int i = 0; i<9; i++){
            if(board[i]== '_'){
                board[i]=computer;
                if(checkWinner()==3){
                    pos = i;
                    todo = 1;
                    board[i] = '_';
                    break;
                }
                board[i] = '_';
            }
        }
        if(todo == 0){
            for(int i = 0; i<9; i++){
                if(board[i]== '_'){
                    board[i]=player1;
                    if(checkWinner()==1){
                        pos = i;
                        todo = 2;
                        board[i] = '_';
                        break;
                    }
                    board[i] = '_';
                }
            }
        }
        if(todo == 1 || todo == 2)
            board[pos] = computer;
        else{
            int x = 1;
            do{
                pos = (int)(Math.random()*10);
                if(pos > -1 && pos < 9 && board[pos] == '_'){
                    board[pos] = computer;
                    x--;
                }
            }while(x == 1);
        }
    }

    public static void oneplayer(){ //one player game set up
        int chance = 0;
        int turns = toss();
        if(turns%2 == 1)
            println("Player 1's turn : ",50);
        else 
            println("Plaayer 2's turns : ", 50);
        do{
            if(turns%2==1){
                p1chance();
                board();
            }
            else{
                computer();
                board();
            }
            chance++;
            turns++;
        }while(chance <= 9 && checkWinner() == 0);
    }

    public static void twoplayer(){ //two player game set up
        int chance = 0;
        int turns = toss();
        do{
            if(turns%2==1){
                p1chance();
                board();
            }
            else{
                p2chance();
                board();
            }
            chance++;
            turns++;
        }while(chance < 9 && checkWinner() == 0);
    }

    public static int checkWinner(){    //to check for winners
        int ch = -1;
        for(int i = 0; i < 9; i+=3){
            if(board[i]==board[i+1] && board[i]==board[i+2] && board[i] != '_'){
                ch = i;
                break;
            }
        }
        for(int i = 0; i < 3; i++){
            if(board[i]==board[i+3] && board[i]==board[i+6] && board[i] != '_'){
                ch = i;
                break;
            }
        }
        if(ch==-1){
            if(board[0]==board[4] && board[0]==board[8] && board[0] != '_')
                ch = 0;
            if(board[2]==board[4] && board[2]==board[6] && board[2] != '_')
                ch = 2;
        }

        if(ch==-1)
            return 0;   //returns 0 if no one is the winner
        else if(board[ch]==player1)
            return 1;
        else if(board[ch]==player2)
            return 2;
        else if(board[ch]==computer)
            return 3;
        else
            return 0;
    }
    public static void main(String args[]){
        start();
        if(game == 2)
            twoplayer();
        if(game == 1 )
            oneplayer();
    }
}