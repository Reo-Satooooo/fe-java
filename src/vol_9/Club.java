package vol_9;

public class Club {

    private String clubName;
    private Member[] members;

    public Club(String clubName){
        this.clubName = clubName;
        this.members = new Member[70];
    }

    public void join(Member member){
        for (int i = 0; i < members.length; i++){
            if(members[i] == null){
                members[i] = member;
                return;
            }
        }
    }

    public void print(){
        System.out.println(clubName);
        for (int i = 0; i < members.length; i++){
            if (members[i] != null){
                Member member = members[i];
                member.print();
            }
        }
    }

}
