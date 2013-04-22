class XorInterpreter extends AbstractInterpreter {
    public String eval(String code, String param) {
	BitString
	    x1 = new BitString(code),
	    x2 = new BitString(param);
	x1.xor(x2);
	return x1.toString(code.length());
    }    
}
