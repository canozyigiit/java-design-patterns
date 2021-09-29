package Prototype;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        EntityService entityService = new EntityService();

        Date start = new Date();
        Document document = entityService.findDocumentById(1);
        Date end = new Date();

        Long second = getSecond(start,end);
        System.out.println(document);
        System.out.println("Süre : " +  second);

        Date start2 = new Date();
        Document document2 = entityService.findDocumentById(2);
        Date end2 = new Date();

        Long second2 = getSecond(start2,end2);
        System.out.println(document2);
        System.out.println("Süre : " +  second2);


        Date start3 = new Date();
        Document documentClone = null;
        try {
            documentClone = document.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        documentClone.setName("Günlük");
        documentClone.setData("Sevgili günlük...");
        documentClone.getDocumentType().setName("Kişisel 2");
        Date end3 = new Date();

        Long second3 = getSecond(start3,end3);
        System.out.println(documentClone);
        System.out.println("Süre : " +  second3);

        System.out.println(document);

    }

    public static Long getSecond(Date start,Date end){
        long has = 1000;

        long second = (end.getTime() / has) - (start.getTime() / has);
        return second;
    }
}
