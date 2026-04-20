import java.util.*;

public class TicTacToe {

    static char[][] board = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };

    static void printBoard() {
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
     static boolean checkWin(char p) {
        // rows
        for(int i=0;i<3;i++)
            if(board[i][0]==p && board[i][1]==p && board[i][2]==p)
                return true;
             for(int i=0;i<3;i++)
                if(board[0][i]==p && board[1][i]==p && board[2][i]==p)
                return true;
                if(board[0][0]==p && board[1][1]==p && board[2][2]==p) return true;
                if(board[0][2]==p && board[1][1]==p && board[2][0]==p) return true;

        return false;

}
      static void computerturn(){
        Random rand=new Random();
        while(true){
            int pos=rand.nextInt(9)+1;
            int row=(pos-1)/3;
            int col=(pos-1)%3;
            if(board[row][col] != 'X' && board[row][col] != '0'){
                board[row][col]='0';
                break;
            }

        }

      }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char player='X';
    for(int turn=0;turn<9;turn++){
        printBoard();
        if(turn%2==0){
            System.out.println("your move");
        
       
        int pos=sc.nextInt();
        int row=(pos-1)/3;
        int col=(pos-1)%3;
         if(board[row][col] == 'X' || board[row][col] == 'O'){
            System.out.println("ALready FIlled! Try Again");
            turn--;
            continue;

        }
    board[row][col]='X';
    if(checkWin(player)){
        printBoard();
        System.out.println("player" + player + " wins!");
        return;
     } 
    }
     else {
                
                computerturn();
                System.out.println("Computer played...");

                if(checkWin('O')){
                    printBoard();
                    System.out.println("Computer Wins!");
                    return;
                }
            }

}
printBoard();
System.out.println("its' draw!");;
    }


}
