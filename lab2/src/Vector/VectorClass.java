package Vector;
import static java.lang.Math.sqrt;

public class VectorClass {
    private int n;
    private int vector[];

    public VectorClass(int n) {
        this.n = n;
        this.vector = new int[n];
    }

    public void setElement(int i, int value) {
        vector[i] = value;
    }

    public int getElement(int i) {
        return vector[i];
    }

    public void setLenghth(int n) {
        this.n = n;
    }

    public int getLenghth() {
        return n;
    }
    public int findMin() {
        int min = 10000;
        for (int i = 0; i<n; i++) {
            if (vector[i]<min) {
                min = vector[i];
            }
        }
        return min;
    }
    public int findMax() {
        int max = 0;
        for (int i = 0; i<n; i++) {
            if (vector[i]>max) {
                max = vector[i];
            }
        }
        return max;
    }
    public void sortUp() {
        int c;
        for (int i = 0; i<n; i++) {
            c = vector[i];
            for (int j = i+1; j<n; j++) {
                if (c>vector[j]){
                    c = vector[j];
                    vector[j]=vector[i];
                    vector[i]=c;
                }
            }
        }
    }
    public double findEuclid() {
        double euclid = 0;
        for (int i = 0; i<n; i++) {
            euclid+=(vector[i]*vector[i]);
        }
        return sqrt(euclid);
    }
    public void numberMultiplier(int x) {
        for (int i = 0; i<n; i++) {
            vector[i] *= x;
        }
    }
    public VectorClass twoVectors(VectorClass vector2) {
        VectorClass vecSum = new VectorClass(n);
        try {
            if (n!=vector2.n) throw new Exception ("Векторы разной длины!");
            for (int i = 0; i < n; i++) {
                vecSum.setElement(i, (vector[i] + vector2.vector[i]));
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return vecSum;
    }
    public int scalar(VectorClass vector2) {
        int product = 0;
        try {
            if (n != vector2.n) throw new Exception("Векторы разной длины!");
            for (int i = 0; i < n; i++) {
                product += vector[i] * vector2.vector[i];
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return product;
    }
}

