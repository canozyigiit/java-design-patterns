package creational.prototype;

public class Document implements Cloneable{

    private int id;
    private String name;
    private Category category;
    private DocumentType documentType;
    private String data;

    public Document() {
    }

    public Document(int id, String name, Category category, DocumentType documentType, String data) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.documentType = documentType;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Document{" +
                "\n id='" + id + '\'' +
                "\n, name='" + name + '\'' +
                "\n, category=" + category +
                "\n, documentType=" + documentType +
                "\n, data='" + data + '\'' +
                '}';
    }
//      Shallow Copy
//    @Override
//    protected Document clone() throws CloneNotSupportedException {
//        return (Document) super.clone();
//    }



//      Deep Copy
    @Override
    protected Document clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        DocumentType documentType = document.getDocumentType().clone();
        Category category = document.getCategory().clone();
        document.setDocumentType(documentType);
        document.setCategory(category);
        return document;
    }
}
