package cache.controllers;

import cache.Cache;
import cache.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CacheController {
    Cache userCache = new Cache();
    @GetMapping("/get-user-data")
    @ResponseBody
    public String renderCache(@RequestParam int id) throws InterruptedException {

        if(userCache.has(id)==true){
            return userCache.get(id);
        }
        else if(userCache.has(id)==false){
            User user = new User(id);
            String s = user.getDataSlow();
            userCache.set(id,s);
            return s;
        }
        return "/get-user-data";
    }
}
