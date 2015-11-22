package me.ben.spi.search;

import java.util.List;  

public class DatabaseSearch implements Search {  
  
    public List<Doc> search(String keyword) {  
        System.out.println("now use database search. keyword:" + keyword);  
        return null;  
    }  
  
}  