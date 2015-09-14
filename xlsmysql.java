
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
    private String name;
    private String batch;

    public int getAfg() {
        return afg;
    }

    public void setAfg(int afg) {
        this.afg = afg;
    }

    public String getName() {
        return name.replace('\'',' ');
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        switch(batch){
            case "1962 Batch 'A'": this.batch 	= "1963 B1";
            break;
            case "1963  BATCH  B": this.batch 	= "1963 B1";
            break;
            case "1964  BATCH  C": this.batch 	= "1964 C1";
            break;
            case "1965  BATCH  D": this.batch 	= "1965 D1";
            break;
            case "1966  BATCH  E": this.batch 	= "1966 E1";
            break;
            case "1967  BATCH  F": this.batch 	= "1967 F1";
            break;
            case "1968  BATCH  G": this.batch = "1968 G1";
            break;
            case "1969  BATCH  H": this.batch = "1969 H1";
            break;
            case "1970  BATCH  I": this.batch = "1970 I1";
            break;
            case "1971  BATCH  J": this.batch = "1971 J1";
            break;
            case "1972  BATCH  K": this.batch = "1972 K1";
            break;
            case "1973  BATCH  L": this.batch = "1973 L1";
            break;
            case "1974  BATCH  M": this.batch = "1974 M1";
            break;
            case "1975  BATCH  N": this.batch = "1975 N1";
            break;
            case "1976  BATCH  O": this.batch = "1976 O1";
            break;
            case "1977  BATCH  P": this.batch = "1977 P1";
            break;
            case "1978 BATCH Q": this.batch = "1978 Q1";
            break;
            case "1979   BATCH  R": this.batch = "1979 R1";
            break;
            case "1980   BATCH  S": this.batch = "1980 S1";
            break;
            case "1981   BATCH  T": this.batch = "1981 T1";
            break;
            case "1982   BATCH  U": this.batch = "1982 U1";
            break;
            case "1983  BATCH   V": this.batch = "1983 V1";
            break;
            case "1984   BATCH  W": this.batch = "1984 W1";
            break;
            case "1985 BATCH X": this.batch = "1985 X1";
            break;
            case "1986  BATCH  Y": this.batch = "1986 Y1";
            break;
            case "1987  BATCH  Z": this.batch = "1987 Z1";
            break;
            case "1988  BATCH  A2": this.batch = "1988 A2";
            break;
            case "1989  BATCH  B2": this.batch = "1989 B2";
            break;
            case "1990  BATCH  C2": this.batch = "1990 C2";
            break;
            case "1991  BATCH  D2": this.batch = "1991 D2";
            break;
            case "1992  BATCH  E2": this.batch = "1992 E2";
            break;
            case "1993   BATCH  F2": this.batch = "1993 F2";
            break;
            case "1994   BATCH  G2": this.batch = "1994 G2";
            break;
            case "1995  BATCH  H2": this.batch = "1995 H2";
            break;
            case "1996  BATCH  I 2": this.batch = "1996 I2";
            break;
            case "1997   BATCH  J2": this.batch = "1997 J2";
            break;
            case "1998  BATCH  K 2": this.batch = "1998 K2";
            break;
            case "1999  BATCH  L 2": this.batch = "1999 L2";
            break;
            case "2000   BATCH  M 2": this.batch = "2000 M2";
            break;
            case "2001  BATCH  N 2": this.batch = "2001 N2";
            break;
            case "2002   BATCH  O 2": this.batch = "2002 O2";
            break;
            case "2003  BATCH  P 2": this.batch = "2003 P2";
            break;
            case "2004   BATCH   Q 2": this.batch = "2004 Q2";
            break;
            case "BATCH  R2  2005": this.batch = "2005 R2";
            break;
            case "BATCH S22006": this.batch = "2006 S2";
            break;
            case "BATCH T-2  2007": this.batch = "2007 T2";
            break;
            case "BATCH U 2 2008": this.batch = "2008 U2";
            break;
            case "BATCH  V-2  2009": this.batch = "2009 V2";
            break;
            case "BATCH  W-2  - 2010": this.batch = "2010 W2";
            break;
            case "BATCH  X-2 - 2011": this.batch = "2011  X2";
            break;
            case "BATCH  Y-2 - 2012": this.batch = "2012 Y2";
            break;
            case "Z2 Batch 2013": this.batch = "2013 Z2";
            break;
            case "A-3 Batch Jul 2014": this.batch = "2014 A3";
            break;
            default: this.batch = "Undefined";
        }
        //this.batch = batch;
    }
    
    @Override
    public String toString() {
        return "student{" + "afg=" + afg + ", name=" + name + '}';
    }
    
    public String toEloquent(){
        StringBuilder sb = new StringBuilder();
       	sb.append("\n$user = new User;");
	sb.append("\n$user->name = '"+this.name+"';");
	sb.append("\n$user->afid = "+this.getAfg()+";");
	sb.append("\n$user->batch = '"+this.getBatch()+"';");
	sb.append("\n$user->save();");
        return sb.toString();
    }
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
        String batch = "1962 Batch 'A'";
        while((line=br.readLine())!=null){
            //System.out.println("Parsing : "+line);
            line = stripQuotes(line);
            line = line.trim();

            flag=false;
            for (StringTokenizer stringTokenizer = new StringTokenizer(line); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                if(token.equalsIgnoreCase("(Migration-")){
                    flag=false;
                    break;
                }
                if(token.equalsIgnoreCase("Batch")){
                    flag = true;
                    
                }
            }
            if(flag){
                batch = line;
                System.out.println("//----- "+batch+" -----//");
                //System.out.println("case \""+ line+ "\": this.batch = \""+line+"\";\nbreak;");
            }
                
            st= new StringTokenizer(line);
            Student student = new Student();
            student.setBatch(batch);
            try {
                student.afg = Integer.parseInt(st.nextToken());
                //student.name = "";
                student.setName("");
                while(st.hasMoreTokens()){
                    //student.name+=st.nextToken() + " ";
                    student.setName(student.getName() + st.nextToken() + " ");
                }
                //student.name = (student.name).trim();
                student.setName(student.getName().trim());
                //System.out.println();
                while(studentcounter < student.afg){
                    //System.out.print(" \n" + student.afg + " ");
                    studentcounter++;
                }
                //System.out.print(student.toString());
                System.out.println(student.toEloquent());
                //System.out.println(student.afg + " >> "+ line);
            } catch (Exception e) {
                if(line.length()==0)
                    continue;
                errorcount++;
                line = stripQuotes(line);
                line = line.trim();
                //System.out.println(" >"+line+"<");
            }

        }
        //System.out.println("Errors = "+errorcount);
    }
}