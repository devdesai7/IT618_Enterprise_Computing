/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javafx.util.Pair;

/**
 *
 * @author dev23
 */
public class Candidate {
     private String name ;
// ArrayList <Pair <String,Integer> > list =
//                  new ArrayList <Pair <String,Integer> > ();       
// ArrayList al = new ArrayList();
         HashMap hm = new HashMap();
private int marks ;

 public HashMap getName() {
      
  return hm;
      
    }

    public void setName(String name) {
        this.name = name;
        this.marks = 0;
       hm.put(name, new Integer(0));
       //  list.add(new Pair <String,Integer> (name,0));
   System.out.println(hm.get("dev"));
    }
    
    public void setVote(String name)
    {
        int value = (int) hm.get(name);
        value = value + 1;
          hm.put(name, value);
            System.out.println(hm.get(name));
        
    }
    public int getVoteCount(String name)
    {
        return  (int) hm.get(name);
    }
    public int getCandiateCount()
    {
       
      // System.out.println("SIZE" + hm.size());
        return hm.size();
    }
  
    public HashMap sortedData()
    {
     Map<String, Integer> unSortedData = hm;
         
LinkedHashMap<String, Integer> sortedData = new LinkedHashMap<>();
 
unSortedData.entrySet()
    .stream()
    .sorted(Map.Entry.comparingByValue())
    .forEachOrdered(x -> sortedData.put(x.getKey(), x.getValue()));
        System.out.println(sortedData);
return sortedData;
    }
    
}
