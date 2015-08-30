
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class xlsmysql{
    
    public static String stripQuotes(String str){
        StringBuilder sb=new StringBuilder();
        for (char c : str.toCharArray()) {
            if(c=='"' || c=='\''){
            }
            else{
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        String sourceFilename = args[0];
        BufferedReader br = new BufferedReader(new FileReader(sourceFilename));
        String line = br.readLine();
        StringTokenizer st;
        int errorcount=0;
        while((line=br.readLine())!=null){
            line = line.trim();
            st= new StringTokenizer(line);
            int afgno=0;
            try {
                afgno = Integer.parseInt(st.nextToken());
                //System.out.println(afgno + " >> "+ line);
            } catch (Exception e) {
                if(line.length()==0)
                    continue;
                errorcount++;
                line = stripQuotes(line);
                line = line.trim();
                System.out.println(" >"+line+"<");
            }
        }
        System.out.println("Errors = "+errorcount);
    }
}