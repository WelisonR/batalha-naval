
// define and manage the game score dynamically according to the selected map (txt)
public final class GameScores {
        // Initial score - can be easily changed
        public static final int INITIALSCORE = 4500;
        public static int ACTUALSCORE;
        
        public static int NUMBEROFRECTANGLES;
        public static int POSITIONATTACKSCORE;
        public static int AREAATTACKSCORE;
        public static int LINEATTACKSCORE;
        public static int COLUMNATTACKSCORE;
        
        public GameScores(){
                ACTUALSCORE = INITIALSCORE;
                
                calculateNumberOfRectangles();
                calculateScoreOfPositionAttack();
                calculateScoreOfAreaAttack();
                calculateScoreOfLineAttack();
                calculateScoreOfColumnAttack();
        }
        
        // verify the possibility of a certain attack and subtract from actual score
        public boolean RemainedScore(int attackType){
                switch (attackType) {
                        case PlayerActionsAnalyser.POSITIONATTACK:
                                if ((ACTUALSCORE - POSITIONATTACKSCORE) >= 0){
                                        ACTUALSCORE -= POSITIONATTACKSCORE;
                                        return true;
                                }
                                break;
                        case PlayerActionsAnalyser.AREAATTACK:
                                if ((ACTUALSCORE - AREAATTACKSCORE) >= 0){
                                        ACTUALSCORE -= AREAATTACKSCORE;
                                        return true;
                                }
                                break;
                        case PlayerActionsAnalyser.LINEATTACK:
                                if ((ACTUALSCORE - LINEATTACKSCORE) >= 0){
                                        ACTUALSCORE -= LINEATTACKSCORE;
                                        return true;
                                }
                                break;
                        case PlayerActionsAnalyser.COLUMNATTACK:
                                if ((ACTUALSCORE - COLUMNATTACKSCORE) >= 0){
                                        ACTUALSCORE -= COLUMNATTACKSCORE;
                                        return true;
                                }
                                break;
                        default:
                                break;
                }
                return false;
        }
        
        // All the attack scores calculus are made according to the number of rectangles and the initial score
        
        public final void calculateNumberOfRectangles(){
                NUMBEROFRECTANGLES = (MapReader.getCanvasNumberOfLines() * MapReader.getCanvasNumberOfColumns());
        }
        
        public final void calculateScoreOfPositionAttack(){
                POSITIONATTACKSCORE = (int) (1.2 * INITIALSCORE/NUMBEROFRECTANGLES);
        }
        public final void calculateScoreOfAreaAttack(){
                AREAATTACKSCORE = (int) (3.8 * POSITIONATTACKSCORE);
        }
        public final void calculateScoreOfLineAttack(){
                LINEATTACKSCORE = (int) (POSITIONATTACKSCORE * 0.95 * MapReader.getCanvasNumberOfLines());
        }
        public final void calculateScoreOfColumnAttack(){
                COLUMNATTACKSCORE = (int) (POSITIONATTACKSCORE * 0.95 * MapReader.getCanvasNumberOfColumns());
        }
}
