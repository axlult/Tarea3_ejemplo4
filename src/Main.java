public class Main {
    public void main(String[] args) {
        OperacionesFracciones operacionesFracciones = new OperacionesFracciones();
        OperacionesNatural operacionesNatural = new OperacionesNatural();
         fraccion f1= new fraccion(1,4);
        fraccion f2= new fraccion(1,2);
        
        operacionesFracciones.sumar(f1, f2);
        operacionesNatural.sumar(f1, f2);

    }
    public class fraccion{
        public fraccion(int num, int den) {
            this.num = num;
            this.den = den;
        }
        public fraccion() {
            this.num = 1;
            this.den = 1;
        }
        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getDen() {
            return den;
        }

        public void setDen(int den) {
            this.den = den;
        }

        int num;
        int den;

    }
    public abstract class operaciones {
        public abstract void  multiplicar(fraccion a, fraccion b);
        public abstract void sumar(fraccion a, fraccion b);
        public abstract void  restar(fraccion a, fraccion b);
        public abstract void  dividir(fraccion a, fraccion b);
    }
    public class OperacionesNatural extends operaciones {
        @Override
        public void  multiplicar(fraccion a, fraccion b) {
            int num;
            int den;
            num=a.num* b.num;
            den=a.den*b.den;

            System.out.println(num/den);
        }
        @Override
        public void  sumar(fraccion a, fraccion b) {
            int num;
            int den;
            num=a.num+b.den * a.den+b.num;
            den=a.den+b.den;
            System.out.println(num/den);
        }
        @Override
        public void  restar(fraccion a, fraccion b) {
            int num;
            int den;
            num=a.num-b.den * a.den+b.num;
            den=a.den-b.den;
            System.out.println(num/den);
        }
        @Override
        public void dividir(fraccion a, fraccion b) {
            int num;
            int den;
            num=a.num * b.den;
            den=a.den+b.num;
            System.out.println(num/den);
        }
    }
    public class OperacionesFracciones extends operaciones {
        @Override
        public void  multiplicar(fraccion a, fraccion b) {
            fraccion aux = new fraccion();
            aux.num=a.num* b.num;
            aux.den=a.den*b.den;
            System.out.println(aux);
        }
        @Override
        public void  sumar(fraccion a, fraccion b) {
            fraccion aux = new fraccion();
            aux.num=a.num+b.den * a.den+b.num;
            aux.den=a.den+b.den;
            System.out.println(aux);
        }
        @Override
        public void  restar(fraccion a, fraccion b) {
            fraccion aux = new fraccion();
            aux.num=a.num-b.den * a.den+b.num;
            aux.den=a.den-b.den;
            System.out.println(aux);
        }
        @Override
        public void dividir(fraccion a, fraccion b) {
            fraccion aux = new fraccion();
            aux.num=a.num * b.den;
            aux.den=a.den+b.num;
            System.out.println(aux);
        }
    }

}

