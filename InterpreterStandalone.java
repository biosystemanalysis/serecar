/**
 * use an Interpreter interface to create a standalone application
 *
 * Copy this file and change XorInterpreter to the name of your
 * intepereter.
 */
class InterpreterStandalone {
    public static void main(String[] args){
	// use your interpreter here
	Interpreter vm = new XorInterpreter(); 
	String res = vm.eval(args[0], args[1]);
	System.out.println(res);
    }
}
