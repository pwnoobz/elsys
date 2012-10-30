//* Pragramata trqbva da chete failut feature_scenarios_times i 
//* ot nego da izkarva vuv fail kolko puti "features/instance_create_update.feature"
//* se sudurja v .csv failut

import java.io.*;

public class CSVReader {
 
 private static int count;

 public static void main(String[] arg) throws Exception {

  BufferedReader CSVFile = new BufferedReader(new FileReader("file.csv"));

  String dataRow = CSVFile.readLine(); 

  while (dataRow != null) {
   String[] dataArray = dataRow.split(",");
   for (String item : dataArray) {
    if(item.equals("features/instance_create_update.feature"))
    {
     count++;
    }
   }
   dataRow = CSVFile.readLine();
  }

  CSVFile.close();

  System.out.println(count);