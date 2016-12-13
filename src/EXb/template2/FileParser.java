package EXb.template2;
public class FileParser extends GeneralParser
    {

	@Override
	protected void Load()
        {
            System.out.println("Load the data from the file");
        }

	@Override
        protected void Parse()
        {
            System.out.println("Parse the file data");
        }     
       
    }