class Fraction {
    private int num, den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    Fraction addFraction(Fraction frac) {
        int d = lcm(this.den, frac.den);
        int n1 = (this.den / d) * this.num;
        int n2 = (frac.den / d) * frac.den;
        int n = n1 + n2;
        while(gcd(n, d) != 1) {
            n = n / gcd(n, d);
            d = d / gcd(n, d);
        }
        return new Fraction(n, d);
    }

    Fraction subFraction(Fraction frac) {
        int d = lcm(this.den, frac.den);
        int n1 = (this.den / d) * this.num;
        int n2 = (frac.den / d) * frac.den;
        int n = n1 + n2;
        while(gcd(n, d) != 1) {
            n = n / gcd(n, d);
            d = d / gcd(n, d);
        }
        return new Fraction(n, d);
    }

    Fraction mulFraction(Fraction frac) {
        int n = this.num * frac.num;
        int d = this.den * frac.den;
        while(gcd(n, d) != 1) {
            n = n / gcd(n, d);
            d = d / gcd(n, d);
        }
        return new Fraction(n, d);
    }

    Fraction divFraction(Fraction frac) {
        int n = this.num * frac.den;
        int d = this.den * frac.num;
        while(gcd(n, d) != 1) {
            n = n / gcd(n, d);
            d = d / gcd(n, d);
        }
        return new Fraction(n, d);
    }

}
