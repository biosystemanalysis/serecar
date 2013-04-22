class TournementArena {
    TournementArena(Interpreter[] vms, String[] arena) {
	codeLen = arena[0].length();
	this.vms     = vms;
	this.arena   = arena;
	rng = new java.util.Random();
    }

    String[] iterate() {
	Interpreter vm = vms[rng.nextInt(vms.length)];
	String
	    code  = arena[rng.nextInt(arena.length)],
	    param = arena[rng.nextInt(arena.length)],
	    res = vm.eval(code, param);
	arena[rng.nextInt(arena.length)] = res;
	String [] ret = {code, param, res};
	return ret;
    }
    
    public static void main(String[] args){
	// init arena
	Interpreter[] vms = {
	    new XorInterpreter(),
	    new ExternalInterpreter("/bin/echo")
	};
	String[] arena = {"00", "01", "10", "11"}; // TODO: add random bit-strings
	TournementArena a = new	TournementArena(vms, arena);

	// run arena forever
	while (true) {
	    String[] r = a.iterate();
	    System.out.println(r[0] + " ( " + r[1] + " ) -> " + r[2]);
	}
    }

    int codeLen;
    Interpreter[] vms;
    String[] arena;
    java.util.Random rng;
}
