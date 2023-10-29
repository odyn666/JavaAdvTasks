package pl.hajduk.task18;

public class Task18Main {
    public static void main(String[] args) {

        Computer pc1 = new Computer("acer", "intel", "gtx", "acer", 8);
        Computer pc2 = new Computer("acer", "intel", "gtx", "acer", 8);
        Computer pc3 = new Computer("custom", "amd", "gtx", "samsung", 18);
        Computer pc4 = new Computer("laptok", "intel", "gt", "toshiba", 3);

        System.out.println(pc1.equals(pc2));
        System.out.println(pc1.equals(pc3));

        System.out.println(pc4.equals(pc2));


    }

}
