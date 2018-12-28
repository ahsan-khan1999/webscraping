//package com.imdb;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;

public class FetchData {

    public static void main(String[] args) throws IOException {
        scrap("https://www.w3schools.com/xml/xml_xpath.asp");
    }
    public static ArrayList<String> scrap(String url) throws IOException{

        Document doc = Jsoup.connect(url).get();
        System.out.println(doc.outerHtml());

        Elements r_urdu_div = doc.select("a.div.w3-center w3-small w3-opacity");
//        Elements u_urdu_div = doc.select("div.u");

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i <r_urdu_div.size() ; i++) {
            list.add(r_urdu_div.text());

    }
        return list;

}
}


/*if (r_urdu_div.size() == u_urdu_div.size()){
            for (int i=0; i <u_urdu_div.size() ; i++) {
                list.add(r_urdu_div.get(i).text()+""+u_urdu_div.get(i).text());
            }
        }
//    Document d=Jsoup.connect("https://www.w3schools.com/xml/xml_xpath.asp").timeout(6000).get();
//    Elements ele=d.select("div class=\"top10\"");
//        for (Element element : ele.select("div.result")) {
//                String img_url=element.select("div.result_thumb img").attr("src");
//                System.out.println(img_url);
//
//                String title=element.select("div.result_data a").text();
//                System.out.println(title);
//                }


        }
*/