package Prototype;

public class EntityService {


    public Category findCategoryById(int id){


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);
        String name;
        if (id == 1) {
           name = "Özel";
        }else if(id == 2){
           name = "İş";
        }else{
        name = "Genel";
        }
        category.setName(name);
        return category;
    }

    public DocumentType findDocumentTypeById(int id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DocumentType documentType = new DocumentType();
        documentType.setId(id);
        String name;
        if (id == 1) {
            name = "Kişisel";
        }else if(id == 2){
            name = "Kurumsal";
        }else{
            name = "Genel";
        }
        documentType.setName(name);
        return documentType;
    }


    public Document findDocumentById(int id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Document document = new Document();
        document.setId(id);
        document.setCategory(findCategoryById(id));
        document.setDocumentType(findDocumentTypeById(id));
        String name, data;

        if (id == 1) {
            name = "Mektup";
            data = "Merhaba Can....";

        }else if(id == 2){
            name = "Rapor";
            data = "Bu rapor genel müdürlüğe verilmek üzere hazırlanmıştır...";
        }else{
            name = "Trafik cezaları";
            data = "Yüksek hız nedeniyle ...";
        }
        document.setName(name);
        document.setData(data);
        return document;
    }
}
