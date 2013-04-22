// because writing java violates human rights

import java.lang.Runtime;

class ExternalInterpreter extends AbstractInterpreter {
    ExternalInterpreter(String cmdName) {
	this.cmdName = cmdName;
    }

    public String eval(String code, String param) {
	java.lang.StringBuilder res = new java.lang.StringBuilder();
	try {
	    // exec program capturing its standart output
	    String[] cmd = {"timeout", "-s", "9", "1", cmdName, code, param};
	    Process p = java.lang.Runtime.getRuntime().exec(cmd);
	    java.io.InputStream s = p.getInputStream();
	    int c;
	    // read stdout
	    while (((c = s.read()) >= 0) && (res.length() < code.length())) {
		switch (c) {
		case '1': res.append("1"); break;
		default:  res.append("0");
		}
	    }
	    // pad string
	    while (res.length() < code.length())
		res.append("0");
	} catch (java.io.IOException e) {}
	return res.toString();
    }    

    String cmdName;
}
