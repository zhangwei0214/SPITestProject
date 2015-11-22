package me.ben.spi.search;

import java.util.List;  

  
public class FileSearch implements Search {  

    public List<Doc> search(String keyword) {  
        System.out.println("now use file system search. keyword:" + keyword);  
        return null;  
    }  
  
}  