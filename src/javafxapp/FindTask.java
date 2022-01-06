/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapp;

import java.io.*;
import java.util.*;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

/**
 *
 * @author Denis
 */
public class FindTask extends Task<Void>{
final private int SIZE = 200;
final private ObservableList<String> items1;
final private String path;
final private String end;
final private LinkedList<String> list = new LinkedList<>();

    public FindTask(ObservableList<String> items1, String path, String end) {
        this.items1 = items1;
        this.path = path;
        this.end = end;
        
    }

    @Override
    protected Void call() throws Exception {
    File file =new File(path);
       if(file.isDirectory()) findIn(file); 
       return null;
    }

    @Override
    protected void cancelled() {
        items1.add("Canceled by user");
        updateScene();
    }

    @Override
    protected void succeeded() {
        items1.addAll(list);
        items1.add("Were founded "+items1.size()+" files");
        updateScene();
    }
    private void updateScene() 
    {
        updateProgress(SIZE, SIZE);
    }
    
    

  /* public void doWork()
   {
       File file =new File(path);
       if(file.isDirectory()) findIn(file); 
   }
   */
   protected void findIn (File fi)
   {
       File[] files = fi.listFiles((f)->f.getName().endsWith(end)|| f.isDirectory());
       if(isCancelled()) return;
       if(files!=null && list.size()<SIZE)
           for(File f:files)
               if(f.isDirectory())
                   findIn(f);
               else list.add(f.getAbsolutePath());
       
   }

  
    
    
}
