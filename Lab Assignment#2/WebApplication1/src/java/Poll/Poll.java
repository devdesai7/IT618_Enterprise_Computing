/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poll;


import java.util.ArrayList;
import java.util.HashMap;
import javafx.util.Pair;

/**
 *
 * @author dev23
 */
public class Poll {

    private String name;
    private int id;
   // private String Cname;
    ArrayList<String> Cname = new ArrayList<String>(4);

    public ArrayList<String> getCname() {
      
        return Cname;
    }

    public int setCname(String Cname) {
        System.out.println(Cname);
        if(this.Cname.contains(Cname))
        {
        return 1;
        }
        else{
       this.Cname.add(Cname);
       return 0;
        }
    }
    Candidate c = new Candidate();
//          hp.put()

    public void setCandidates(String name) {
        c.setName(name);
    }

    public HashMap getCandidates() {
        return c.getName();

    }

    public void setVote(String name) {
        c.setVote(name);
    }

    public Pair<String, Integer> getWinner() {
//          String winner="";
//         int votes = 0 ;
//            for (int i = 0; i < c.getCandiateCount(); i++) {
//                String name= (String) c.getName().keySet().toArray()[i];
//               int val = (int) c.getVoteCount(name);
//
//           if(val>votes)
//             {
//            winner = name;
//            votes = val;
//             } 
//             
//          }
//            Pair<String, Integer> p = new Pair<>(winner ,votes);  
//            c.sortedData();
//            return p;
        String name = (String) c.sortedData().keySet().toArray()[c.getCandiateCount() - 1];
        int val = (int) c.getVoteCount(name);
        Pair<String, Integer> p = new Pair<>(name, val);
        return p;
    }

    public Pair<String, Integer> getWinner2() {

       String name = (String) c.sortedData().keySet().toArray()[c.getCandiateCount() - 2];
        int val = (int) c.getVoteCount(name);
        Pair<String, Integer> p = new Pair<>(name, val);
        return p;
    }

}
