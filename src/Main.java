import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //10000 0 1 <- przykładowe parametry programu
        try {
            RandomNumbers test = new RandomNumbers( //stworz nowy obiekt RandomNumbers i przekaz parametry programu do konstruktora
                    Integer.parseInt(args[0]),      //program sam wykonuje już wszystko, nie trzeba innych metod wywoływać
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]));
            test.closeDataStreams(); //Zamykamy strumienie
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
