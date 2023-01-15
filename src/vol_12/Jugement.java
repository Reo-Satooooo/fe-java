package vol_12;

public class Jugement {

    public void jugement(Player player1, Player player2){
        int player1Num = player1.checkNum();
        int player2Num = player2.checkNum();

        player1.checkCard();
        player2.checkCard();

        // 両者21超で引き分け
        if (player1Num > 21 && player2Num > 21){
            System.out.println("引き分け");
        }
        // 21超でPlayer1の負け
        else if(player1Num > 21){
            System.out.println(player2.playerName + "の勝利");
        }
        // 21超でPlayer2の負け
        else if(player2Num > 21){
            System.out.println(player1.playerName + "の勝利");
        }
        // Player1の負け
        else if(player1Num < player2Num){
            System.out.println(player2.playerName + "の勝利");
        }
        // Player2の負け
        else if(player1Num > player2Num){
            System.out.println(player1.playerName + "の勝利");
        }
        // 引き分け
        else if (player1Num == player2Num){
            System.out.println("引き分け");
        }
    }

}
