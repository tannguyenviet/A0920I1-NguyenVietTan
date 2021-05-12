package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService implements  DicService{
    public Map<String,String> getDictionary(){
        Map<String,String> map = new HashMap<>();
        map.put("name","ten");
        map.put("dictionary","tudien");
        map.put("clear","lam sach");
        map.put("happy","vui");
        return map;
    }
    public String findValue(String key){
        Map<String,String> map = getDictionary();
        if(map.containsKey(key)){
            return map.get(key);
        }else return "no result for key";
    }
}
