import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EndScreen {
    //double[] resultList;

    public void endScreen(double[] resultList) throws IOException {
        System.out.println("Thanks for using our currency convertor");
        System.out.println(resultList);
        String filePath = "C:\\Users\\shimi\\OneDrive\\Desktop\\results.txt";
        //Files.writeString(Paths.get(filePath),resultList);

    }

}
