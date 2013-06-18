/*
 * This will create n stanzas of m-lines each of 
 * randomly created metal lyrics. If unspecified by
 * the command line, n=m=4. Have fun!
 */

import java.util.Random;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
public class Exec{


   static ArrayList<String> beginnings;
   static ArrayList<String> middle;
   static ArrayList<String> ends;
   static Random rand;
   
   
   public static void main(String[] args){
       beginnings = new ArrayList<String>();
       middle = new ArrayList<String>();
       ends = new ArrayList<String>();
       rand = new Random();
       
       populateLists();
       try{
          int numLines = args.length > 0 ? Integer.parseInt(args[0]) : 4;
          int numStanzas = args.length >1 ? Integer.parseInt(args[1]) : 4;
          
          for(int i =0; i < numStanzas; i ++){
              for(int j = 0; j< numLines; j++){
                   System.out.println(getNextLine());    
              }
              //new line
              System.out.println("");
          }
       }catch(Exception e){
            System.out.println("Integers only, dumbass");
            System.exit(1);
       }

       System.out.printf("Beginnings size: %d\n", beginnings.size());
       System.out.printf("Middle size: %d\n", middle.size());
       System.out.printf("Ends size: %d\n", ends.size());
       
    
    }
    
    
   public static void populateLists(){
       //beginnings first
       beginnings.add("Time after time, ");
       beginnings.add("So far away, ");
       beginnings.add("Marching on through endless fields, ");
       beginnings.add("On the wings of a dragon, ");
       beginnings.add("Storming through the burning fields, ");
       beginnings.add("Baptized in fields of fire, ");
       beginnings.add("Ashes to ashes, dust to dust, ");
       beginnings.add("From the islands to the cities, ");
       beginnings.add("Terminal, what disease? ");
       beginnings.add("Heart of an eagle, ");
       beginnings.add("Into the darkness, ");
       beginnings.add("In the end of time, ");
       beginnings.add("In the end, ");
       beginnings.add("For Satan, ");
       beginnings.add("Welcome to our convent, where ");
       beginnings.add("Feel at home in our black conventicle, where "); 
       beginnings.add("Don't summon the devil, don't call the priest, if you need the strength, then ");
       beginnings.add("Welcome to our sanguinary sect of worship, where ");
       beginnings.add("My bones are decayed, my flesh it doth rot, ");
       beginnings.add("Bodies convulse and mangle in pain, ");

       middle.add("we anathematise ");
       middle.add("we fight for ");
       middle.add("we cry for ");
       middle.add("we die for ");
       middle.add("death takes its toll of ");
       middle.add("we lose our sanity to ");
       middle.add("we raise our swords for ");
       middle.add("the air reeks of ");
       middle.add("we destroy your evil with ");
       middle.add("we battle for ");
       middle.add("locked in a prison with nothing but ");
       middle.add("we fly onwards for ");
       middle.add("we ride for ");
       middle.add("silenced by ");
       middle.add("lives are lost for ");
       middle.add("all fall to ");
       middle.add("malevolence paves the way for ");
       middle.add("hellish fiends bite: ");
       middle.add("monstrous beings created within ");
       
       ends.add("Cthulu!");
       ends.add("Baphomet's call");
       ends.add("Baphomet");
       ends.add("AVE SATANAS!");
       ends.add("Shemhamforash.");
       ends.add("the glory of man!");
       ends.add("putrefaction.");
       ends.add("SATAN!");
       ends.add("666.");
       ends.add("revolution!");
       ends.add("the passing of time.");
       ends.add("our brothers in arms!");
       ends.add("the death of our mothers.");
       ends.add("the fight of our lifetime!");
       ends.add("the darkness.");
       ends.add("the blackest of hearts.");
       ends.add("Mephisto's hall of fame");
       ends.add("the infernal depths!");
       ends.add("wisdom undefiled");
       ends.add("vile abominations");
       ends.add("accursed enemies of ambition");
       ends.add("subterranean resistance cult");
   }
   
   public static String getNextLine(){
       return beginnings.get(rand.nextInt(beginnings.size())) + 
       middle.get(rand.nextInt(middle.size())) + ends.get(rand.nextInt(ends.size()));
       
   }
    
}
