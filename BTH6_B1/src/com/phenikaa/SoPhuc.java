package com.phenikaa;

public class SoPhuc {
    private double a;
    private double jd;

    public SoPhuc() {
    }

    public SoPhuc(double a, double jd) {
        this.a = a;
        this.jd = jd;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getJd() {
        return jd;
    }

    public void setJd(double jd) {
        this.jd = jd;
    }

    @Override
    public String toString() {
        String result="";
        if(a!=0&jd!=0){
            result +=a+"+"+jd+"i";
        }
        else if(a!=0){
            result +=a;
        }
        else if(jd!=0){
            result +=jd+"i";
        }

        return result;
    }

    public double Modun(){
        return Math.sqrt(a*a+jd*jd);
    }

    public Boolean Compare(SoPhuc soPhuc){
        return (a==soPhuc.getA()&&jd==soPhuc.getJd());
    }

    public SoPhuc add(SoPhuc soPhuc){
        SoPhuc result = new SoPhuc();
        result.setA(this.a+soPhuc.getA());
        result.setJd(this.jd+soPhuc.getJd());
        return result;
    }

    public SoPhuc sub(SoPhuc soPhuc){
        SoPhuc result = new SoPhuc();
        result.setA(this.a- soPhuc.getA());
        result.setJd(this.jd-soPhuc.getJd());
        return result;
    }

    public SoPhuc multi(SoPhuc soPhuc){
        SoPhuc result = new SoPhuc();
         result.setA(a* soPhuc.getA()-jd*soPhuc.getJd());
         result.setJd(a* soPhuc.getJd()+jd* soPhuc.getA());
         return result;
    }

    public SoPhuc div(SoPhuc soPhuc){
        SoPhuc result = new SoPhuc();
        result.setA((a* soPhuc.getA()+jd*soPhuc.getJd())/(a*a+ soPhuc.getA()* soPhuc.getA()));
        result.setJd((a* soPhuc.getJd()-jd* soPhuc.getA())/(a*a+ soPhuc.getA()* soPhuc.getA()));
        return result;
    }

    public SoPhuc multi(float k){
        SoPhuc result = new SoPhuc();
        result.setA(a*k);
        result.setJd(jd*k);
        return result;
    }

    public SoPhuc ConjugateComplex(){
        SoPhuc result = new SoPhuc(a,-jd);
        return result;
    }
}
