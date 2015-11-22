package me.ben.spi.search;

import java.util.List;  

  
public interface Search {  
    List<Doc> search(String keyword);  
}  