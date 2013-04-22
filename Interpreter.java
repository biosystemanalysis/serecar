interface Interpreter {
    /**
     * return result of intepreted code, given param as argument
     */
    public String eval(String code, String param);

    /**
     * print the program code parses to
     */
    public String print(String code);

    /**
     * print a  trace of the intepretation of code given param
     */
    public String trace(String code, String param);

    public int minLength();

    public int maxLength();
}
