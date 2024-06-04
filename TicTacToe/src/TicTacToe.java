import java.util.Scanner;

public class TicTacToe {

    public static char symbol = ' ';
    public static char winner = ' ';
    public static void main(String[] args) throws Exception {
    
        char[][] gameBoard = {{' ', '|' , ' ', '|', ' '},
        {'-', '+' , '-', '+', '-'},
         {' ', '|' , ' ', '|', ' '},
         {'-', '+' , '-', '+', '-'},
          {' ', '|' , ' ', '|', ' '}};


        playGame(gameBoard);
        
    }


        public static String switchUser(char[][] gameBoard, int pos, String user){
            if (user.equals("player")){
                user = "cpu";
            }else{
                user = "player";
            }
            return user;
         }

         public static char checkWinner(char [] [] gameBoard){

            
            //check rows
            for(char[] row: gameBoard){
                if (row[0] == row[2] && row[0] == row[4] && row[0] == symbol) {
                    winner = symbol;
                }
             } // check columns
             for(int col = 0; col < gameBoard[0].length; col++){
                if (gameBoard[0][col] == symbol && gameBoard[0][col] == gameBoard[2][col] && gameBoard[0][col] == gameBoard[4][col] ) {
                    winner = symbol;
                }
            } // check diagonals
             if (gameBoard[0][0] == symbol && gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2]) {
                    winner = symbol;
                } else if (gameBoard[0][4] == symbol && gameBoard[0][4] == gameBoard[2][2] && gameBoard[0][4] == gameBoard[4][0]) {
                    winner = symbol;
                }                 

                return winner;
         }



         public static void playGame(char[][] gameBoard){

            
           char winner = ' ';
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 'player' or 'cpu':");
            String user = scan.nextLine();
  
            for(int i = 0; i < 9; i++){
               
                System.out.println("Enter your position: (1-9)");
                int pos = scan.nextInt();
                placePiece(gameBoard, pos, switchUser(gameBoard,pos,user));
               
                printGameBoard(gameBoard);
                winner = checkWinner(gameBoard);
                if(winner != ' '){
                    System.out.println("Winner is: " + winner);
                    break;
                }
                user = switchUser(gameBoard, pos, user);
            }
         }


         public static void placePiece(char[][] gameBoard, int pos, String user){

            
            if(user.equals("player")){
                symbol = 'X';
            }
            else{
                    symbol = 'O';
                }
            
            switch(pos){
                case 1: 
                    if(gameBoard[0][0] == ' '){
                        gameBoard[0][0] = symbol;
                    } else {
                        System.out.println("Position already occupied. Choose another position.");
                        return; // Exit the method if position is occupied
                    }
                    break;
    
                case 2: 
                if(gameBoard[0][2] == ' '){
                    gameBoard[0][2] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied
                }
                    break;
    
                case 3: 
                if(gameBoard[0][4] == ' '){
                    gameBoard[0][4] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied
                }
                    break;

                case 4: 
                if(gameBoard[2][0] == ' '){
                    gameBoard[2][0] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;

                case 5: 
                if(gameBoard[2][2] == ' '){
                    gameBoard[2][2] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;
                case 6: 
                if(gameBoard[2][4] == ' '){
                    gameBoard[2][4] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;
                case 7: 
                if(gameBoard[4][0] == ' '){
                    gameBoard[4][0] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;
                case 8: 
                if(gameBoard[4][2] == ' '){
                    gameBoard[4][2] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;
                case 9: 
                if(gameBoard[4][4] == ' '){
                    gameBoard[4][4] = symbol;
                } else {
                    System.out.println("Position already occupied. Choose another position.");
                    return; // Exit the method if position is occupied    
                }
                    break;
                default:
                    System.out.println("Enter value between 1-9");
              }



          }

         public static void printGameBoard(char[][] gameBoard){

            for(char [] row: gameBoard) {
                for(char c: row){
                    System.out.print(c);
                }
                System.out.println();
     

         }
    }
}
