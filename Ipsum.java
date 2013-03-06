import java.util.Random;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
public class Ipsum{


   static ArrayList<String> beginnings;
   static ArrayList<String> middle;
   static ArrayList<String> ends;
   static Random rand;
   
   
   public static void main(String[] args){
       long nanoTime = System.nanoTime();
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
                   //System.out.println(getNextLine());    
              }
              //new line
              //System.out.println("");
          }
       }catch(Exception e){
            System.out.println("Integers only, dumbass");
            System.exit(1);
       }
       
       ArrayList<String> totalCombos = new ArrayList<String>();
       
       String temp = getNextLine();
       totalCombos.add(temp);
       int totalSize = beginnings.size() * ends.size() * middle.size();
       System.out.println("Total size is " + totalSize);
       BufferedWriter buf = null;
       while(totalCombos.size() < totalSize){
            temp = getNextLine();
            if(!totalCombos.contains(temp))
                totalCombos.add(temp);
       }
       
       for(int i = 0; i < totalSize; i++){
            //System.out.println(totalCombos.get(i));    
       }
       System.out.println("totalsize is " + totalSize);
       
       try{
           File theFile = new File("../METAL.txt");
           buf = new BufferedWriter(new FileWriter(theFile));
           
           for(int i =0; i < totalSize; i++){
               buf.write(totalCombos.get(i) + "\n");
            }
            
            buf.close();
           
       }catch(Exception e){
           
           System.out.println(e.getMessage());
       }
       long newTime = System.nanoTime();
       newTime -= nanoTime;
       
       System.out.printf("Nano seconds taken: %d", newTime);
    
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
       
   }
   
   public static String getNextLine(){
       return beginnings.get(rand.nextInt(beginnings.size())) + 
       middle.get(rand.nextInt(middle.size())) + ends.get(rand.nextInt(ends.size()));
       
   }
    
}
