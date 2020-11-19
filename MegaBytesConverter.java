

public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesandKiloBytes(2500);
    }

    public static void printMegaBytesandKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            int KB = (kiloBytes % 1024);
            int MB = kiloBytes - KB;
            System.out.println(kiloBytes + " KB = " + (MB/1024) + " MB and " + KB + " KB");

        }
    }

}
