public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        switch(shirtNum){
            case 1:
                {
                String player = "goalie";
                return player;
                }
                case 2:
                {
                String player = "left back";
                return player;
                }
                case 3:
                {
                String player = "center back";
                return player;
                }
                case 4:
                {
                String player = "center back";
                return player;
                }
                case 5:
                {
                String player = "right back";
                return player;
                }
                case 6:
                {
                String player = "midfielder";
                return player;
                }
                case 7:
                {
                String player = "midfielder";
                return player;
                }
                case 8:
                {
                String player = "midfielder";
                return player;
                }
                case 9:
                {
                String player = "left wing";
                return player;
                }
                case 10:
                {
                String player = "striker";
                return player;
                }
                case 11:
                {
                String player = "right wing";
                return player;
                }
            default:
                throw new IllegalArgumentException("Invalid shirt number: " + shirtNum);

            
            
        }
    }
}
