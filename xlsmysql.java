
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Batch{
    public int year;
    public String batch;
    public String batchname;

    public Batch(int year, String batch, String batchname) {
        this.year = year;
        this.batch = batch;
        this.batchname = batchname;
    }

}

class Student{
    public int afg;
    public String name;

    @Override
    public String toString() {
        return "student{" + "afg=" + afg + ", name=" + name + '}';
    }
    
}

class Students extends ArrayList<Student>{
    
}
class xlsmysql{
    
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
        int studentcounter =1;
        boolean flag = false;
        while((line=br.readLine())!=null){
            //System.out.println("Parsing : "+line);
            line = stripQuotes(line);
            line = line.trim();
            
            flag=false;
            for (StringTokenizer stringTokenizer = new StringTokenizer(line); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                if(token.equalsIgnoreCase("Batch")){
                    flag = true;
                    
                }
            }

            st= new StringTokenizer(line);
            Student student = new Student();
            
            try {
                student.afg = Integer.parseInt(st.nextToken());
                student.name = "";
                while(st.hasMoreTokens()){
                    student.name+=st.nextToken() + " ";
                }
                student.name = (student.name).trim();
                System.out.println();
                while(studentcounter < student.afg){
                    //System.out.print(" \n" + student.afg + " ");
                    studentcounter++;
                }
                System.out.print(student.toString());

                //System.out.println(student.afg + " >> "+ line);
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