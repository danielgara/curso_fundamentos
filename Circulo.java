public class Circulo
{
    private double radio;
    
    public Circulo(){
        //this.radio = 1;
    }
    
    public Circulo(double r){
        this.setRadio(r);
    }
    
    public double getRadio() {
      return this.radio;
    }
    
    public void setRadio(double r) {
      if(r > 0){  
        this.radio = r;
      }else{
        System.out.println("Error, ¿de que me hablas viejo?");
      }
    }
    
    public double getPerimetro() {
      return 2 * this.radio * Math.PI;
    }
}