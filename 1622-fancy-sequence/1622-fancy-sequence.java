import java.util.*;

class Fancy {

    static final long MOD = 1000000007;
    List<Long> seq;
    long mul;
    long add;

    public Fancy() {
        seq = new ArrayList<>();
        mul = 1;
        add = 0;
    }

    public void append(int val) {
        long x = (val - add + MOD) % MOD;
        x = (x * modInverse(mul)) % MOD;
        seq.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= seq.size()) return -1;
        long val = seq.get(idx);
        val = (val * mul + add) % MOD;
        return (int) val;
    }

    private long modInverse(long x) {
        return pow(x, MOD - 2);
    }

    private long pow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}