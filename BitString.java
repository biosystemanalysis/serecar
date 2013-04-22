import java.lang.StringBuilder;

class BitString extends java.util.BitSet {
    public BitString(String s) {
	for (int i=0; i<s.length(); i++)
	    set(i, s.charAt(i) == '1');
    }

    public String toString() {
	return toString(length());
    }

    public String toString(int size) {
	java.lang.StringBuilder res = new java.lang.StringBuilder();
	for (int i=0; i<size; i++)
	    res.append(get(i)? "1" : "0");
	return res.toString();
    }
}
