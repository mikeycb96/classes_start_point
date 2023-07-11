public class Computer {

    private int storage;
    private String printerModel;


    public Computer(int storage){
        this.storage = storage;

    }
     public int getCurrentStorage() { return this.storage;}


     public int addStorage(int addedStorage) {
         return this.storage += addedStorage;


     }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
