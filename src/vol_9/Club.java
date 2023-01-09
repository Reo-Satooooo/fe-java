package vol_9;

public class Club {

    private String clubName;
    private Member komon;
    private Member[] members;

    public Club(String clubName, Member komon){
        this.clubName = clubName;
        this.komon = komon;
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

    public void delete(String gakuseki){
        for (int i = 0; i < members.length; i++){
            if(members[i] != null){
                Member member = members[i];
                String name = member.getGakuseki();
                if (name.equals(gakuseki)){
                    members[i] = null;
                }
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
