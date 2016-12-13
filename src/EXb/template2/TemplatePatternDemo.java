package EXb.template2;
public class TemplatePatternDemo {
   public static void main(String[] args) {

	   FileParser ObjFileParser = new FileParser();
	   ObjFileParser.Process();
       System.out.println("-----------------------");
	   SqlServerParser ObjSqlParser = new SqlServerParser();
	   ObjSqlParser.Process();
   }
}