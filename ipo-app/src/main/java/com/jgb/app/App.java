package com.jgb.app;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App 
{
    public static void main( String[] args )
    {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc1 = Jsoup.connect("https://www.nasdaq.com/market-activity/ipos").get();
            
            Document doc2 = Jsoup.connect("https://finance.yahoo.com/calendar/ipo?from=2021-01-17&to=2021-01-23&day=2021-01-19").get();
            
            Document doc3 = Jsoup.connect(" https://www.marketwatch.com/tools/ipo-calendar").get();
     
            System.out.printf("Title: %s\n", doc1.title());/*,"\n ",doc2.title(),"\n ", doc3.title()*/
            
            System.out.printf("Title: %s\n", doc2.title());

            System.out.printf("Title: %s\n", doc3.title());

          } catch (IOException e) {
            e.printStackTrace();
          }
    }
}
