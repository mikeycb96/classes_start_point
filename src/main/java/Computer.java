public class Computer {

    private int storage;
    private String printerModel;


    public Computer(int storage){
        this.storage = storage;
        this.printerModel = null;

    }
     public int getCurrentStorage() { return this.storage;}


     public void addStorage(int addedStorage){
        this.storage += addedStorage;
     }

    public void setPrinterModel(String newPrinterModel) {
        this.printerModel = newPrinterModel;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
