class Program7
{
    public void interest(double p, double r, int t)
    {
        double si, f;
        si=(p*r*t)/100.0;
        f=p+si;
        System.out.println("Simple Interest = "+si);
        System.out.println("Final Amount = "+f);
    }
}
