package EXb.template2;
public class SqlServerParser extends GeneralParser
    {

	@Override
	protected void Load()
        {
            System.out.println("Connect to SQL Server");
        }

	@Override
        protected void Parse()
        {
            System.out.println("Loop through the dataset");
        }     
       
    }