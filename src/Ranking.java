
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Ranking {
        
        List<User> users = new ArrayList<>();
        String[] namesTop10 = new String[10];
        Integer[] ScoresTop10 = new Integer[10];
        
        public Ranking(){}
        
        public void readRanking(){
                Scanner file = null;
                
                try{
                        file = new Scanner(new File("src/Ranking/ranking.txt"));
                        
                        for (int i = 0; i < 2; i++){
                                String trash = file.nextLine();
                        }
                        
                        while (file.hasNextLine()){
                                String phrase;
                                phrase = file.nextLine();
                                phrase = phrase.replace("-", "");
                                String[] splitString = phrase.split(" ");
                                
                                users.add(new User(splitString[0], Integer.parseInt(splitString[1])));
                        }
                }
                catch(FileNotFoundException e){
                        System.out.println("Could not found file!");
                }
                finally{
                        try{
                                file.close();
                        }
                        catch(Exception e){
                                System.out.println("Could not close file!");
                        }
                }
                
        }
        
        public void sortRanking(){
                users.add(new User(Menu.playerName, PontuacaoJogo.ACTUALSCORE));
                
                Collections.sort(users, new Comparator<User>() {
                        @Override
                        public int compare(User o1, User o2) {
                                int scoreCompare = o2.getTopUserScore() - o1.getTopUserScore();
                                if (scoreCompare != 0){
                                        return scoreCompare;
                                }
                                else{
                                        int nameCompare = o1.getTopUserName().compareTo(o2.getTopUserName());
                                        return nameCompare;
                                }
                        }
                   
                        
                });
                
        }
        
        public void writeRanking(){
                        FileWriter fw = null;
                        PrintWriter pw = null;
                try{
                        fw = new FileWriter("src/Ranking/ranking.txt");
                        pw = new PrintWriter(fw);
                        
                        pw.println("# GAME RANKING");
                        pw.println("# NICKNAME	     SCORE");
                        
                        int count = 0;
                        for(User xUser: users){
                                if (count < 10){
                                        int nameLength = xUser.getTopUserName().length();
                                        pw.print(xUser.getTopUserName() + " "); 
                                        for (int i = 0; i < 21-(nameLength+1); i++){
                                                pw.print("-");
                                        }
                                        pw.println(xUser.getTopUserScore());
                                }
                        count++;
                        }
                        
                }
                catch(IOException e){
                        System.out.println("Não foi possível atualizar o rank!");
                }
                finally{
                        try{
                                pw.close();
                        }
                        catch(Exception e){
                                System.out.println("Não foi possível fechar o arquivo!");
                        }
                }
        }
        
        public void fillRankingInformation(){
                int i = 0;
                for(User xUser: users){
                        if(i < 10){
                                namesTop10[i] = xUser.getTopUserName();
                                ScoresTop10[i] = xUser.getTopUserScore();
                        }
                        i++;
                }
        }
        
        public String getNamesTop10(int i) {
                return namesTop10[i];
        }

        public Integer getScoresTop10(int i) {
                return ScoresTop10[i];
        }

        public List<User> getUsers() {
                return users;
        }
}
