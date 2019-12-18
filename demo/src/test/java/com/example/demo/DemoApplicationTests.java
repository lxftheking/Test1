package com.example.demo;

import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class DemoApplicationTests {



    @Test
    public void Test1(){
        tock tock = new tock();
        Thread thread = new Thread(tock);
        Thread thread1 = new Thread(tock);
        Thread thread2 = new Thread(tock);

            thread.start();
            thread1.start();
            thread2.start();


    }


}

class tock implements Runnable {

   // String name;
   private int piao =100;

//    public tock(String name) {
//        this.name = name;
//    }


    @Override
    public void run() {
        while (true) {
            synchronized ("111"){
                if (piao > 0)
                    System.out.println(Thread.currentThread().getName() + "  " + piao--);
            }

        }

    }

}
