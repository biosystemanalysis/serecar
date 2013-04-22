abstract class AbstractInterpreter implements Interpreter  {
    public String print(String code) {
	return code;
    }

    public String trace(String code, String param) {
	return code;
    }

    public int minLength() {
	return 0;
    }

    public int maxLength() {
	return 1024 * 1024;
    }
}
