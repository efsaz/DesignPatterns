package EXb.template2;
public abstract class GeneralParser
    {
        protected abstract void Load();

        protected abstract void Parse();
        protected void Dump()
        {
            System.out.println("Dump data in to oracle");
        }
        public void Process()
        {
            Load();
            Parse();
            Dump();
        }
    }