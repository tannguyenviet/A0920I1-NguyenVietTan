package service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface DicService {
    String findValue(String key);
    Map<String,String> getDictionary();
}
