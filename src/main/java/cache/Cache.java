package cache;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class Cache {


        Map<Integer, String> userData = new HashMap<>();

        public String get(int key){
            String s = userData.get(key);
            System.out.println(s); // For testing
            return s;
        }
        public void set(int key, String value){
            userData.put(key, value);
        }

        public boolean has(int key){
            boolean a = false;
            if(userData.containsKey(key)){
                a = true;
            }
            System.out.println(a); // For testing
            return a;
        }
        public void delete(int key){
            userData.remove(key);
        }


    /*public void setTTL(int key, long ttl) { //DOES NOT WORK --WiP--
        LocalTime now = LocalTime.now();
        System.out.println("Cache Created at "+now);

            userData.remove(key);
        }*/

    public void setTTL(int key) { //<-- LÅNT FRA INES
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                userData.remove(key);
            }
        };
        timer.schedule(task, 100000); //1.5 minutes
    }
    }