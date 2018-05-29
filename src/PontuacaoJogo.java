public final class PontuacaoJogo {
        public static final int INITIALSCORE = 4500;
        public static int ACTUALSCORE;
        
        public static int NUMBEROFRECTANGLES;
        public static int POSITIONATTACKSCORE;
        public static int AREAATTACKSCORE;
        public static int LINEATTACKSCORE;
        public static int COLUMNATTACKSCORE;
        
        
        public PontuacaoJogo(){
                ACTUALSCORE = INITIALSCORE;
                calculateNumberOfRectangles();
                calculateScoreOfPositionAttack();
                calculateScoreOfAreaAttack();
                calculateScoreOfLineAttack();
                calculateScoreOfColumnAttack();
        }
        
        public final void calculateNumberOfRectangles(){
                NUMBEROFRECTANGLES = (LeitorMapa.getCanvasNumberOfLines() * LeitorMapa.getCanvasNumberOfRows());
        }
        
        public final void calculateScoreOfPositionAttack(){
                POSITIONATTACKSCORE = (int) ((1.2 * INITIALSCORE)/NUMBEROFRECTANGLES);
        }
        public final void calculateScoreOfAreaAttack(){
                AREAATTACKSCORE = (int) (3.8 * POSITIONATTACKSCORE);
        }
        public final void calculateScoreOfLineAttack(){
                LINEATTACKSCORE = (int) ((POSITIONATTACKSCORE * 0.95) * LeitorMapa.getCanvasNumberOfLines());
        }
        public final void calculateScoreOfColumnAttack(){
                COLUMNATTACKSCORE = (int) ((POSITIONATTACKSCORE * 0.95) * LeitorMapa.getCanvasNumberOfRows());
        }
}