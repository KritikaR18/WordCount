package wordcount;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class WordCount {

	    public static void main(String args[]) throws Exception{
		
		File file = new File("D:\\sample.txt");// Specify the path of the directory where the Data set/File is stored
        if(!file.exists())
        {
            System.out.println("Source file does not exists");
            System.exit(0);
        }
        else{
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String str = "";	
				Set<String> wordsOfDataset= new HashSet<>();
				String line= reader.readLine();
                int totalWords=0;
 
				while(line!= null){
				    //if condition to check if there is actual content in the line
					 if(!line.trim().equals(str)){
						String[] words = line.split(" "); 
						totalWords +=words.length;
						for(String word:words){
							String cleanedUpWord= word.toLowerCase()
									.replace(",",str)
									.replace(":",str)
									.replace(".",str)
									.replace("-",str);
							wordsOfDataset.add(cleanedUpWord);
						}
					 }
					 line= reader.readLine();
			}
				 System.out.println("Words in the Dataset :");
				 System.out.println(wordsOfDataset);
				 System.out.println();
				 System.out.println("Number of unique words in the DataSet :");
				 System.out.println(wordsOfDataset.size());
				 System.out.println();
				 System.out.println("Total number of words in the DataSet :");
				 System.out.println(totalWords);
				 reader.close();
       }
   }
}
