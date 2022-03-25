public class ParseCSV {
  public static void main(String[] args) {
    try {
      //csv file containing data
      String strFile = "C:/Users/rsaluja/CMS_Evaluation/Drupal_12_08_27.csv";
      CSVReader reader = new CSVReader(new FileReader(strFile));
      String [] nextLine;
      int lineNumber = 0;
      while ((nextLine = reader.readNext()) != null) {
        lineNumber++;
        System.out.println("Line # " + lineNumber);

        // nextLine[] is an array of values from the line
        System.out.println(nextLine[4] + "etc...");
      }
    }
