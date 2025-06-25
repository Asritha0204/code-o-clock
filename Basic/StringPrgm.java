package Basic;
public class StringPrgm {
    public static void main(String[] args) {
        String name="Naina";
        String boy="Bunny";
        String user="    Thalwar";
        String Para="Naina is very studious girl who has no friends and the most introvert but she breakout the fear and travelled with strangers to kashmir";
        System.out.println("Character at 1 is "+name.charAt(0));
        System.out.println("Splitting the para: "+Para.split(""));
        System.out.println("Trim the user: "+user.trim());
        System.out.println("Concatenation : "+ name.concat(boy));
    }
}
